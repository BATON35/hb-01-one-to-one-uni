package com.example.hb01onetooneuni.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "youtube_channel")
    private String youtubeChanel;
    @Column(name = "hobby")
    private String hobby;


    public InstructorDetail(String youtubeChanel, String hobby) {
        this.youtubeChanel = youtubeChanel;
        this.hobby = hobby;
    }
}
