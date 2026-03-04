package develhope.it.firstApi.controller;

import develhope.it.firstApi.Logica.Factorial;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factorial")
public class FactorialController {
    @GetMapping(value = "")
    public String getFactorial(@RequestParam(required = false) Integer variable) {
        Integer x = Factorial.factorial(variable);
        return "Il fattoriale e' " + x;
    }


}

