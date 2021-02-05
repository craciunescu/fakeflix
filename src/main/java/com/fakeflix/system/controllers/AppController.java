package com.fakeflix.system.controllers;

import java.util.List;

import com.fakeflix.system.domain.Media;
import com.fakeflix.system.repositories.MediaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    private MediaRepository mediaRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Media> listMedia() {
        return mediaRepository.findAll();
    }

}
