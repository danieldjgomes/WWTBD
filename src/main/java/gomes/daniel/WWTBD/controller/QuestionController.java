package gomes.daniel.WWTBD.controller;

import gomes.daniel.WWTBD.dto.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/questions")
@RestController
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping
    ResponseEntity<List<Question>> getQuestionsByTheme(@RequestParam String theme) {
        return ResponseEntity.ok(questionService.getQuestionsByTheme(theme));
    }

}
