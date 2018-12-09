package com.company;

public class Book {
    private String color;
    private int countPage;
    private String name;
    public Book()
    {
        color = "";
        countPage = 0;
        name = "";
    }
    public Book(String line)
    {
        color = line;
        countPage = 0;
        name = "";
    }
    public Book(String line, int count)
    {
        color = line;
        countPage = count;
        name = "";
    }
    public Book(String line, int count, String str)
    {
        color = line;
        countPage = count;
        name = str;
    }

    public String getColor() {
        return color;
    }

    public int getCountPage() {
        return countPage;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return this.name+", amount page "+this.countPage;
    }
    public void printClass(){
        System.out.println(name  + " книга, в которой "+ countPage + " страниц");
    }

}
