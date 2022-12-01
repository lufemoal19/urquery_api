package urquery.api.controllers;

import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.http.*;
import java.net.http.HttpResponse.*;
import java.net.http.HttpRequest.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/compile")
public class CompileController {


    @PostMapping
    public Map<String,Object> compile(@RequestBody Map data) throws Exception{
        String prologResponse = callPrologServer(data);
        Map<String,Object> result = new HashMap<>();
        result.put("prolog response", prologResponse);
        System.out.println("DATA: "+data);
        return result;
    }

    //ver prolog http://localhost:8000/
    public String callPrologServer(Map data) throws Exception{
        var PORT = 8000;
        var API = "/add";
        var SERVICE = String.format("http://localhost:%d%s", PORT, API);

        var client = HttpClient.newHttpClient();
        var uri = URI.create(SERVICE);
        var body = "{\"code\": \" let l = 'name' in <li> { for $prod in doc " +
                "('catalogo.xml')/producto/categoria return <ul>{$prod/nombre}</ul> } " +
                "</li>\n\"}"; //"{\"a\":10, \"b\":665}";
        var request = HttpRequest.newBuilder(uri)
                .version(HttpClient.Version.HTTP_1_1)
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .POST(BodyPublishers.ofString(data.toString()))
                .build();
        System.out.print("*** Sending %s ***" + data);
        var response = client.send(request, BodyHandlers.ofString());
        System.out.print("*** Response ***");
        System.out.print(response.body());
        return response.body();
    }
}