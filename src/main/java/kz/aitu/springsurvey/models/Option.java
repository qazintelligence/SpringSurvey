package kz.aitu.springsurvey.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "options")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int option_id;
    private String text;
    private int question_id;

    public Option() {}
    public Option(int option_id, String text, int question_id){
        this.option_id = option_id;
        this.text = text;
        this.question_id = question_id;
    }
}
