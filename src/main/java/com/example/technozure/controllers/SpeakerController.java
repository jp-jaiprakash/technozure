package com.example.technozure.controllers;

import com.example.technozure.entities.Speaker;
import com.example.technozure.repos.SpeakerRepository;
import com.example.technozure.services.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/speakers")
public class SpeakerController {
    
    @Autowired
    private SpeakerService speakerService;
    
    @GetMapping
    public List<Speaker> getAllSpeakers() {
        return speakerService.getAllSpeakers();
    }
}
