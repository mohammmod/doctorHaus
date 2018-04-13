package at.refugeescode.diagnose.servece;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfigeration {
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
