package com.accenture.challenge.model;

public class Product {

    public enum Gender {
        MALE, FEMALE, UNISEX;
    }
    public enum Color {
        WHITE, BLACK, GREY, RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE, PINK, MULTICOLOR;
    }

    private int id;
    private int size;
    private Gender gender;
    private Color color;

    public Product (int id, int size, Color color, Gender gender) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", size=" + size +
                ", gender=" + gender +
                ", color=" + color +
                '}';
    }
}