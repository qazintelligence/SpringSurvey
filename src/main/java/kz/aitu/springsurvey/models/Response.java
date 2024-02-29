package kz.aitu.springsurvey.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
@Entity
@Table(name = "responses")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int response_id;
    private int survey_id;
    private int question_id;
    private int user_id;
    private int answer;
}
