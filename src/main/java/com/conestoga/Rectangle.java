package com.conestoga;

public class Rectangle {

    private int length;

    private int width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int length, int width) {

        validateInput(length);
        validateInput(width);

        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        validateInput(length);
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        validateInput(width);
        this.width = width;
    }

    public int getPerimeter() {
        return (2*(length + width));
    }

    public int getArea() {
        return length * width;
    }

    private void validateInput(int input) {
        if (input <= 0) {
            throw new IllegalArgumentException("Negative and Zero values are not allowed");
        }
    }
}