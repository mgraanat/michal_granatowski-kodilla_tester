package com.kodilla.rest.service;

import com.kodilla.rest.controller.BookController;
import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceTestSuite {

    @Test
    void addBookTest(){
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Test1", "Test1"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        List<BookDto> result = bookServiceMock.getBooks();
        //then
        assertThat(result).hasSize(1);
    }

}