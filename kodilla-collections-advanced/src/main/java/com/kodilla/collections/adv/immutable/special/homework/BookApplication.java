package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book = BookManager.createBook("title1", "author1");
        Book book2 = BookManager.createBook("title2", "author2");
        Book book3 = BookManager.createBook("title1", "author1");

        System.out.println(book.equals(book3));
        System.out.println(book.equals(book2));
    }
}
