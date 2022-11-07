package com.example.strim4;

import java.io.Serializable;

public class OnePieceModel implements Serializable {
    private String imageUrl;
    private String name;

    public OnePieceModel(String imageUrl, String name, int age, String color) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private int age;
    private String color;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
