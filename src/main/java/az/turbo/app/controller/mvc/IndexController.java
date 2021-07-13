package az.turbo.app.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class IndexController {


    @GetMapping("/")
    public String indexPage() {
        return "index";
    }


}
