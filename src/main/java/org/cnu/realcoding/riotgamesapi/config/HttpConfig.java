package org.cnu.realcoding.riotgamesapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpConfig {
    
    public RestTemplate createRestTemplte() {
        return new RestTemplate();
    }
}
