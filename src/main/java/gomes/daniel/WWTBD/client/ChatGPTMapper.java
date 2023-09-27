package gomes.daniel.WWTBD.client;

import com.google.gson.Gson;
import gomes.daniel.WWTBD.dto.Question;
import gomes.daniel.WWTBD.dto.QuestionData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatGPTMapper {

    public List<Question> toModel(GPTQuestionResponse response) {
        List<GPTQuestionResponse.Choice> choices = response.getChoices();
        String content = choices.get(0).getMessage().getContent();
        Gson gson = new Gson();
        QuestionData questionData = gson.fromJson(content, QuestionData.class);
        return questionData.getQuestions();
    }
}
