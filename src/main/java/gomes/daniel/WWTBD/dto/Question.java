package gomes.daniel.WWTBD.dto;


import lombok.Data;

@Data
public final class Question {
    private final Integer order;
    private final String title;
    private final String alternativeA;
    private final String alternativeB;
    private final String alternativeC;
    private final String alternativeD;
    private final String rightAnswer;


}
