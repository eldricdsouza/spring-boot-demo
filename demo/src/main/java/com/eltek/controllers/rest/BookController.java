package com.eltek.controllers.rest;

import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("books-rest")
public class BookController {

    @GetMapping(value = "/{id}", produces = "application/json")
    public Book getBook(@PathVariable int id) {
        return findBookById(id);
    }

    @PostMapping (value = "/book", produces = "application/json")
    public void saveBook(@RequestBody Book book) {
         System.out.print(book);
    }


    private Book findBookById(int id) {
        return new Book();
    }
}
