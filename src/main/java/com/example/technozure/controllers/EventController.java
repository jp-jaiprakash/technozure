package com.example.technozure.controllers;

import com.example.technozure.entities.Event;
import com.example.technozure.repos.EventRepository;
import com.example.technozure.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    
    @Autowired
    private EventService eventService;
    
    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }
}
