package com.fakeflix.system.services;

import java.util.List;

import com.fakeflix.system.domain.Media;
import com.fakeflix.system.repositories.MediaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class MediaService {
    @Autowired
    private MediaRepository mediaRepository;

    public List<Media> listAllMedia() {
        return mediaRepository.findAll();
    }

}
