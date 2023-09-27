package gomes.daniel.WWTBD.controller;

import gomes.daniel.WWTBD.client.ChatGPTFeignClient;
import gomes.daniel.WWTBD.client.ChatGPTMapper;
import gomes.daniel.WWTBD.client.GPTQuestionResponse;
import gomes.daniel.WWTBD.client.model.ChatGPTQuery;
import gomes.daniel.WWTBD.dto.Question;
import gomes.daniel.WWTBD.factories.ChatGPTQuestionGameFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final ChatGPTFeignClient chatGPTClient;

    private final ChatGPTQuestionGameFactory chatGPTQuestionGameFactory;

    private final ChatGPTMapper chatGPTMapper;

    public List<Question> getQuestionsByTheme(String theme) {
        ChatGPTQuery query = chatGPTQuestionGameFactory.createQuery(theme);
        GPTQuestionResponse questionsGPTResponse = chatGPTClient.getQuestionsGPTResponse(query);
        return chatGPTMapper.toModel(questionsGPTResponse);
    }
}
