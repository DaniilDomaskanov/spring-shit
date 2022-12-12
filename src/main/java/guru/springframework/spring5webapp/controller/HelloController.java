package guru.springframework.spring5webapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String setup(@RequestParam Long channelId) {
        //todo: dynamically bot settings
        return "Hello";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void event(@RequestBody String event) {
        //waiting respons
        System.out.println(event);
    }
}
