package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellworld {
    @GetMapping
    public String A(){
        return "abc";
    }
}
