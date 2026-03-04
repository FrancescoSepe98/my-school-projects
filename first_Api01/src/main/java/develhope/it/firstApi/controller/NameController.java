package develhope.it.firstApi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping(value = "/{name}")
    public String getName(@PathVariable (required = false, value = "name") String name){
        return "Your name is, " + name;
    }
    @PostMapping(value = "")
    public String postReverseName(@RequestBody String name){
        StringBuilder st = new StringBuilder(name);
        String reverseName = st.reverse().toString();
        return reverseName;

    }
}
