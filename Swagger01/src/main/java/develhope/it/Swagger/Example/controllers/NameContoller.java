package develhope.it.Swagger.Example.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameContoller {
    @GetMapping(value = "/name/{name}")

    @Operation(summary = "Get name", description = "Get the name that you wanna sai Hello" ,
            responses =@ApiResponse(description = "Says hello and the name of the user",responseCode = "200"))
    public String getName(@PathVariable (required = false) String name){
        return "Hello, " + name;
    }
}
