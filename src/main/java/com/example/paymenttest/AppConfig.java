package com.example.paymenttest;

import com.siot.IamportRestClient.IamportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    String apiKey = "5874574837427237";
    String secretKey = "jAMTXhZI0eRE46qwC00y4tBUQy9KGwuLO38ny4ccuRJlQ3TwRkrNDJ6ny2hMu8H5oF3yPJzr4TboNQ2b";

    @Bean
    public IamportClient iamportClient() {
        return new IamportClient(apiKey, secretKey);
    }
}
