package info.devjournal.springBootOpenAPI;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SecurityRequirements(value = {})
@Tag(name = "Hello controller", description = "Controller for making test requests")
public class SimpleRestController {

    @GetMapping("/hello")
    @Operation(summary = "Will return simple 'Hello dev!' message", description = "Just click it to see what happens !")
    public String helloWorld(){
        return "Hello dev!";
    }
}