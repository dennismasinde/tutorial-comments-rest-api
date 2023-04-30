package io.maddennis.tutorialcomments.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = " API One To  Many",
                version = "1.0.0",
                description = """
                        Endpoints documentation.\n
                        A list of all available endpoints
                        """
        ),
        servers= {
                @Server(
                        url="http://localhost:8085"
                )
        }
)
public class SwaggerConfig {
}
