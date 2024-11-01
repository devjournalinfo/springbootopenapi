package info.devjournal.springBootOpenAPI;

import java.util.List;

public record LoginResponse(String login, String token, List<String> roles) {
}
