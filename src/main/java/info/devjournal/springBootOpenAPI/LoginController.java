package info.devjournal.springBootOpenAPI;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SecurityRequirements(value = {})
@Tag(name = "Login controller", description = "Controller for making auth requests")
public class LoginController {


    @PostMapping(path = "/login", consumes = "application/json")
    @SecurityRequirements(value = {})
    @Operation(summary = "Generate auth data", description = "For provided login and password, user receives auth data for later authentication to endpoint")
    public ResponseEntity<LoginResponse> doLogin(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(new LoginResponse("devjournal","authToken", List.of("ADMIN", "MOD")));
    }
}
