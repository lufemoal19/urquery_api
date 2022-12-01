package urquery.api.controllers;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import urquery.api.model.About;
import urquery.api.repo.AboutRepository;

import java.util.*;

@RestController
@RequestMapping(path = "about")
public class AboutController {

    @Autowired
    private AboutRepository aboutRepository;

    @GetMapping("")
    public List<About> vistaAbout()
    {
        return aboutRepository.findAll();
    }

/*
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> getAbout(){
        Map<String,Object> data = new LinkedHashMap<String,Object>();
        //JSONObject data = new JSONObject();
        data.put("Universidad", "Universidad Nacional");
        data.put("Escuela", "Escuela de Informatica");
        data.put("Curso", "EIF400 Paradigmas de Programacion");
        data.put("Trabajo", "I Etapa Proyecto UrQuery");
        data.put("Estudiantes", "Natalia Arce, Michelle Delgado, " +
                "Felipe Morera, Emmanuel Paniagua");
        data.put("Semestre y año", "II Ciclo, 2022");

        return data;
    }*/



//    @GetMapping
//    public String getAbout(){
//                return new JSONArray(List.of("Universidad Nacional",
//                "Escuela de Informatica",
//                "EIF400 Paradigmas de Programacion",
//                "I Etapa Proyecto UrQuery",
//                "Natalia Arce", "Michelle Delgado",
//                "Felipe Morera", "Emmanuel Paniagua",
//                "II Ciclo, 2022")).toString();
//    }

//    @GetMapping
//    public List<String> getAbout(){
//        return List.of("Universidad Nacional",
//                "Escuela de Informatica",
//                "EIF400 Paradigmas de Programacion",
//                "I Etapa Proyecto UrQuery",
//                "Natalia Arce", "Michelle Delgado",
//                "Felipe Morera", "Emmanuel Paniagua",
//                "II Ciclo, 2022");
//    }

}
