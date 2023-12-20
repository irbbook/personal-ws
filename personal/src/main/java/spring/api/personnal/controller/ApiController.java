package spring.api.personnal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
@CrossOrigin(origins = "*")
public class ApiController {
    @GetMapping("/")
    public String getStart() {
        return "Pass";
    }
}
