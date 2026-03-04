package it.develhope.annotations.entity;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    @IsAString
    public String name;
    @IsAString
    public int age;

    @IsAString
    public List<Integer> i = new ArrayList<>();


    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
