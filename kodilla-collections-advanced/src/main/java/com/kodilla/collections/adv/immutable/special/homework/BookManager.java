package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    public static Book createBook(String title, String author){
       Set<Book> books = new HashSet<>();
       books.add(new Book("title1", "author1"));
       books.add(new Book("title2", "author2"));
       books.add(new Book("title1", "author1"));
        return new Book(title, author);
    }

}
