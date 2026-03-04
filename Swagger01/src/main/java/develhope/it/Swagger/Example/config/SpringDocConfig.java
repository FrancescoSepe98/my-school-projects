package develhope.it.Swagger.Example.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
@OpenAPIDefinition(info =
@Info(
        title = "FIRST SWAGGER EXERCISE",
        version = "1.0",
        description = "My API",
        license = @License(name = "",url = ""),
        contact = @Contact(url = "https://www.linkedin.com/in/francesco-sepe-8b33ab1a4", name = "Francesco Sepe", email = "sepe.francesco.lavoro@gmail.com")
))
public class SpringDocConfig {
   @Bean
   public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("-public")
                .pathsToMatch("/public/**")
                .build();
    }
}