package me.qzi.controller;

import me.qzi.entity.Book
import me.qzi.services.BookService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.annotation.Resource

@RestController
class BookController {

    @Resource
    BookService service;

    @RequestMapping('/books')
    List<Book> getBooks() {
        service.getBooks()
    }

    @RequestMapping('/book/{id}')
    Book getBook(@PathVariable(name = 'id')int id) {
        service.getBook(id)
    }
}