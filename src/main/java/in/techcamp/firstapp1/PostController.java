package in.techcamp.firstapp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    @GetMapping("/hello")
    public String showHello(){
        return "hello";
    }
}
