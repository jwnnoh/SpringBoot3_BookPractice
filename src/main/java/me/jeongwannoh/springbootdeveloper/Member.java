package me.jeongwannoh.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자
@AllArgsConstructor
@Getter
@Entity
public class Member {
    @Id //id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increment
    @Column(name = "id", updatable = false)
    private long id;

    @Column(name = "name", nullable = false) //name이라는 not null 컬럼
    private String name;
}
