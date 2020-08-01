package ru.geekbrains.sample.dto;

import lombok.*;
import org.springframework.context.annotation.Bean;


@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String name;
    private int score;


//    public Student(Long id, String name, int score) {
//        this.id = id;
//        this.name = name;
//        this.score = score;
//    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
