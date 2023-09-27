package gomes.daniel.WWTBD.client;

import gomes.daniel.WWTBD.client.model.ChatGPTQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "chat-gpt", url = "${chatgpt.api.url}", path = "v1/chat/completions")
public interface ChatGPTFeignClient {

    @PostMapping
    GPTQuestionResponse getQuestionsGPTResponse(@RequestBody ChatGPTQuery query);
}
