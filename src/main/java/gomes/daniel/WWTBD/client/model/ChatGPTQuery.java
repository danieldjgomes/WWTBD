package gomes.daniel.WWTBD.client.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ChatGPTQuery {
    private final String model;
    private final List<Message> messages;
    private final Double temperature;

    @Builder
    @Data
    public static class Message {
        private final String role;
        private final String content;
    }
}
