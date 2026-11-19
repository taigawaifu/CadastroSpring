package dev.java10x.cadastroninja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("boasvindas")
    public String boasVindas(){
      return "Essa e minha 1 mensamge";
    }
}
