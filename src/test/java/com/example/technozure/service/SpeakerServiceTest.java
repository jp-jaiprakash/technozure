package com.example.technozure.service;

import com.example.technozure.entities.Speaker;
import com.example.technozure.repos.SpeakerRepository;
import com.example.technozure.services.SpeakerService;
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
public class SpeakerServiceTest {
    
    @Mock
    private SpeakerRepository speakerRepository;
    
    @InjectMocks
    private SpeakerService speakerService;
    
    @Test
    public void testGetAllSpeakers() {
        // given
        List<Speaker> speakers = Arrays.asList(new Speaker(), new Speaker());
        when(speakerRepository.findAll()).thenReturn(speakers);
        
        // when
        List<Speaker> result = speakerService.getAllSpeakers();
        
        // then
        assertThat(result).isEqualTo(speakers);
    }
}
