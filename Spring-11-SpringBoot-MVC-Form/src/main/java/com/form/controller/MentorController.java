package com.form.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.form.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {



    @GetMapping("/register")
    public String showForm(Model model){

        model.addAttribute("mentor", new Mentor());

        List<String> batchList= Arrays.asList("B1", "B2", "B3", "B4", "B5");
        model.addAttribute("batchList", batchList);

        return "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute("mentor") Mentor mentor) throws Exception {
        String json= mentor.toString(mentor);
        System.out.println(json);
        return "mentor/mentor-confirmation";
    }

}
