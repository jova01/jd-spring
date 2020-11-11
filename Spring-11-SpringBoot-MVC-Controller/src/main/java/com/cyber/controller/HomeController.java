package com.cyber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("check")
    public String getRequestMapping(){
        return "home";
    }


    @GetMapping("/jova")
    public String getRequestMapping2(){
        return "home";
    }

  //  @PostMapping("cyber/welcome")
    @RequestMapping(method= RequestMethod.POST, value="cyber/welcome")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("book/{id}")
    public String pathVariable(@PathVariable("id") String id){
        System.out.println("Book id is "+ id);
        return "home";
    }

    @GetMapping("table/{id}/{name}")
    public String pathVariable1(@PathVariable String id, @PathVariable String name){
        System.out.println("Table id is "+ id + " Name is "+ name);
        return "home";
    }

    @GetMapping("test/class")
    public String requestParam(@RequestParam String course){
        System.out.println("Course name is "+ course);
        return "home";
    }

    @GetMapping(value="/pen")
    public String requestParam2(@RequestParam(required = false, defaultValue = "Cyber") String name){
        System.out.println("Pen name is " + name);
        return "home";
    }
}
