package com.wp.blog;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.wp.blog.controller.HomeController;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = HomeController.class)
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void whenValidInput_thenReturns200() throws Exception {
        this.mockMvc.perform(get("/")
                .contentType("application/text"))
                .andExpect(status().is(200));
    }

    @Test
    void whenInvalidInput_thenReturns400() throws Exception {
        this.mockMvc.perform(get("/invalid")
                .contentType("application/text"))
                .andExpect(status().is(404));
    }

}