package com.example.springboot

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.context.annotation.Import
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
@AutoConfigureMockMvc
@Import(EtagFilter::class)
class ControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `should return content type`() {
        mockMvc.perform(MockMvcRequestBuilders.get("/test"))
                .andExpect(status().is2xxSuccessful)
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
    }
}