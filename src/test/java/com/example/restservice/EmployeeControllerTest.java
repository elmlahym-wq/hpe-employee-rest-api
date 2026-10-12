package com.example.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employeeList").isArray());
    }

    @Test
    public void testAddEmployee() throws Exception {
        String newEmployeeJson = "{"
                + "\"employee_id\":\"4\","
                + "\"first_name\":\"Mohammed\","
                + "\"last_name\":\"Ali\","
                + "\"email\":\"mohammed@example.com\","
                + "\"title\":\"Developer\""
                + "}";

        mockMvc.perform(post("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(newEmployeeJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employeeList[?(@.employee_id == '4')].email").value(org.hamcrest.Matchers.hasItem("mohammed@example.com")));
    }
    @Test
    public void testRejectMalformedJson() throws Exception {
        mockMvc.perform(post("/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testRejectUnsupportedMediaType() throws Exception {
        mockMvc.perform(post("/employees")
                .contentType(MediaType.TEXT_PLAIN)
                .content("employee"))
                .andExpect(status().isUnsupportedMediaType());
    }
}
