package gomes.daniel.WWTBD.client.configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChatGPTInterceptor implements RequestInterceptor {

    @Value("${chatgpt.api.key}")
    private String apiKey;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Authorization", "Bearer " + apiKey);
    }
}
