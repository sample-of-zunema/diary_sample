package com.example.demo_sample;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class NewDiaryForm {

    @NotNull
    @Size(min = 3, max = 150)
    private String newdiary;

}