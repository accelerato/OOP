package com.company;

public class Ball {
    private String color;
    private int weight;
    private int radius;
    public Ball()
    {
        color = "";
        radius = 0;
        weight = 0;
    }
    public Ball(int wT)
    {
        weight = wT;
        radius = 0;
        color = "";
    }
    public Ball(int wT, int r)
    {
        weight = wT;
        radius = r;
        color = "";
    }
    public Ball(int wT, int r, String line)
    {
        weight = wT;
        radius = r;
        color = line;
    }

    public int getRadius() {
        return radius;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String toString(){
        return this.color+", radius "+this.radius;
    }
    public void printClass(){
        System.out.println(color  + " мяч с диаметром "+ (radius * 2) + " сантиметров");
    }

}

