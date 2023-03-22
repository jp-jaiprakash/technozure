package com.example.technozure.service;

import com.example.technozure.entities.Event;
import com.example.technozure.repos.EventRepository;
import com.example.technozure.services.EventService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EventServiceTest {
    
    @Mock
    private EventRepository eventRepository;
    
    @InjectMocks
    private EventService eventService;
    
    @Test
    public void testGetAllEvents() {
        // given
        List<Event> events = Arrays.asList(new Event(), new Event());
        when(eventRepository.findAll()).thenReturn(events);
        
        // when
        List<Event> result = eventService.getAllEvents();
        
        // then
        assertThat(result).isEqualTo(events);
    }
}
