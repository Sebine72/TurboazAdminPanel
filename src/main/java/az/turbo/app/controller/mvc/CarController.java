package az.turbo.app.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cars")
public class CarController {


    @GetMapping("/")
    public String indexPage() {
        return "cars/index";
    }
    @GetMapping("/add")
    public String addPage() {
        return "cars/add";
    }


}
