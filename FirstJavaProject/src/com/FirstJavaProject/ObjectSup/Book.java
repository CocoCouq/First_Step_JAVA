package com.FirstJavaProject.ObjectSup;

import java.util.Arrays;

public abstract class Book {
    private String title;
    private  String authorName;
    private String authorFirstName;
    private String category;
    private int isbn;
    private String code;

    public Book(String title, String authorName, String authorFirstName, String category, int isbn) {
        this.title = title;
        this.authorName = authorName;
        this.authorFirstName = authorFirstName;
        this.category = category;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getCode() {
        return code;
    }

    public void displayBook() {
        System.out.printf("%s de %s %s, de la categorie %s.%nnº%d%n", this.getTitle(), this.getAuthorFirstName(), this.getAuthorName(), this.getCategory(), this.getIsbn());
        if (this.getCode() != null)
            System.out.printf("Code: %s%n", this.getCode());
    }

    public void calcCode() {
        String string = String.valueOf(
                this.title.charAt(0)) +
                this.title.charAt(1) +
                this.authorName.charAt(0) +
                this.authorName.charAt(1) +
                this.authorFirstName.charAt(0) +
                this.authorFirstName.charAt(1) +
                this.category.charAt(0) +
                this.category.charAt(1) +
                (this.isbn % 100) / 10 +
                this.isbn % 10;
        this.code = string.toUpperCase();
        System.out.println("|| Le code a été calculé avec succes ||");
    }

    public void showCode() {
        System.out.printf("Le code est : %s", this.code);
    }

}
