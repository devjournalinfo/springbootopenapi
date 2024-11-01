package info.devjournal.springBootOpenAPI;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Restricted controller", description = "Controller for making secured test requests")
public class RestrictedController {

    @GetMapping("/restricted")
    @Operation(summary = "Mockup restricted endpoint", description = "Should return 'Secret !!' or Unauthorized")
    public String hello(){
        return "Secret !!";
    }
}