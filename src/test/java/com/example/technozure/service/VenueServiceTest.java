package com.example.technozure.service;

import com.example.technozure.entities.Venue;
import com.example.technozure.repos.VenueRepository;
import com.example.technozure.services.VenueService;
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
public class VenueServiceTest {
    
    @Mock
    private VenueRepository venueRepository;
    
    @InjectMocks
    private VenueService venueService;
    
    @Test
    public void testGetAllVenues() {
        // given
        List<Venue> venues = Arrays.asList(new Venue(), new Venue());
        when(venueRepository.findAll()).thenReturn(venues);
        
        // when
        List<Venue> result = venueService.getAllVenues();
        
        // then
        assertThat(result).isEqualTo(venues);
    }
}
