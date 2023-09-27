package gomes.daniel.WWTBD.factories;

import gomes.daniel.WWTBD.client.model.ChatGPTQuery;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ChatGPTQuestionGameFactoryImpl implements ChatGPTQuestionGameFactory {


    @Value("${chatgpt.model:gpt-3.5-turbo}")
    private String model;

    @Value("${chatgpt.temperature}")
    private Double temperature;

    @Value("${chatgpt.role}")
    private String role;

    @Override
    public ChatGPTQuery createQuery(String theme) {
        return ChatGPTQuery.builder()
                .model(model)
                .temperature(temperature)
                .messages(Collections.singletonList(ChatGPTQuery.Message.builder()
                        .role(role)
                        .content(buildContent(theme))
                        .build()))
                .build();
    }

    private String buildContent(String value) {
        return """
                Responda apenas com o JSON
                A partir de agora você vai se comportar como um servidor web que dado um tema, criará 10 perguntas sobre o tema e retornará em formato json, a dificuldade da pergunta deve ser de 1 a 10 sempre incrementando um por pergunta. O formato será:
                                
                {
                  "questions":[
                    {
                      "order": 0,
                      "title": "lorem",
                      "alternativeA": "lorem",
                      "alternativeB": "lorem",
                      "alternativeC": "lorem",
                      "alternativeD": "lorem",
                      "rightAnswer" : "A" // A, B, C ou D
                    },
                        
                            ]
                }
                O tema será: %s
                """.formatted(value);

    }
}
