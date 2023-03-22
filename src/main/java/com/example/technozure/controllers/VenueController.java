package com.example.technozure.controllers;

import com.example.technozure.entities.Venue;
import com.example.technozure.repos.VenueRepository;
import com.example.technozure.services.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/venues")
public class VenueController {
    
    @Autowired
    private VenueService venueService;
    
    @GetMapping
    public List<Venue> getAllVenues() {
        return venueService.getAllVenues();
    }
}
