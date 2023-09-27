package gomes.daniel.WWTBD.dto;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class QuestionData {
    @SerializedName("questions")
    private List<Question> questions;
}