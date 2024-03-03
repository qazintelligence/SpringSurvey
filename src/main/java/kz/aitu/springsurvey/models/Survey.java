package kz.aitu.springsurvey.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "surveys")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int survey_id;
    private int user_id;
    private String title;


    public Survey () {}
    public Survey(int user_id, String title) {
        this.user_id = user_id;
        this.title = title;
    }
}
