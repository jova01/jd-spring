package cyber.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("student")
public class StudentController {

    @GetMapping("welcome")
    public String homePage(Model model){

        model.addAttribute("name", "CYBER");
        model.addAttribute("course", "MVC");
        String subject = "Collections";
        model.addAttribute("subject", subject);

        int random = new Random().nextInt(1000);
        model.addAttribute("random", random);

        return "student/welcome";
    }
}
