package urquery.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import urquery.api.repo.DocumentRepository;
import urquery.api.model.Documento;

import java.util.*;

@RestController
@RequestMapping(path = "document")
public class DocumentController {

    @Autowired
    private DocumentRepository documentRepository;

    @GetMapping("")
    public List<Documento> getDocuments()
    {
        return documentRepository.findAll();
    }

    @GetMapping("{id}")
    public Documento getDocumento(@PathVariable String id)
    {
        return documentRepository.findById(id).orElseThrow(RuntimeException::new);
    }



    /*String getDocument(@PathVariable String id) {
        return "Lorem ipsum " + id;
    }*/



}
