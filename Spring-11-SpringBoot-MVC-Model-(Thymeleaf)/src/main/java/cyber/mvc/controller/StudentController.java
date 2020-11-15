package cyber.mvc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import cyber.mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("student")
public class StudentController {

    @GetMapping("welcome")
    public String homePage(Model model) throws JsonProcessingException {

        model.addAttribute("name", "CYBER");
        model.addAttribute("course", "MVC");
        String subject = "Collections";
        model.addAttribute("subject", subject);

        int random = new Random().nextInt(1000);
        model.addAttribute("random", random);

        List<Integer> numbers= new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(0);
        model.addAttribute("numbers", numbers);

        LocalDate date= LocalDate.of(1997, 07, 07 );
        model.addAttribute("date", date);

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);

        ObjectMapper mapper =new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json= mapper.writeValueAsString(student);
        System.out.println(json);
        model.addAttribute("json", json);


        return "student/welcome";
    }

    @GetMapping("register")
    public String register(){
        return "student/register";
    }
}
