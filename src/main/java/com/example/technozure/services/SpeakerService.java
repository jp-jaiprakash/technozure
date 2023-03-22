package com.example.technozure.services;


import com.example.technozure.entities.Speaker;
import com.example.technozure.repos.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository;

    public List<Speaker> getAllSpeakers() {
        return speakerRepository.findAll();
    }
}
