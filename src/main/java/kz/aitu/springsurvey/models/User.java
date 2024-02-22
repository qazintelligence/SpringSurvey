package kz.aitu.springsurvey.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "//ставим название тейбла из постгре которое имеем") //надо не забыть про то что в апликейшн пропертиес
public class User { // изменить под наш сервер
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //делаем это ток если у нас праймари кей на айди стоит но навр так и есть
    private int id;
    private String name;
    private String surname; //вроде юзернейм еще был у нас
    private boolean gender;  //тут по идее тоже под тейбл подстраивается
}
