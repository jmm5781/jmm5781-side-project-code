package com.techelevator;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
//        title = "Placeholder -- No Title Yet";
//        author = "Somebody Wrote This But I Don't Know Who Did Yet";
//        price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String bookInfo() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price;
    }

}
