package integrationtests.com.example.technozure.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class SpeakerControllerIntegrationTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Autowired
    private ObjectMapper objectMapper;
    
    @Test
    public void testGetAllSpeakers() throws Exception {
        // when
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/speakers")
                .contentType(MediaType.APPLICATION_JSON));
        
        // then
        resultActions.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].employeeName").value("John Doe"))
                .andExpect(jsonPath("$[0].employeeId").value("EMP123"))
                .andExpect(jsonPath("$[0].talks[0].talkName").value("Java 101"));
    }
}
