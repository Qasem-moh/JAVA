package com.example.demo.student;

import javax.persistence.GenerationType;

public @interface GenratedValue {
    String generator();

    GenerationType strategy();
}
