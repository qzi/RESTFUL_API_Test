package me.qzi.dao

import me.qzi.entity.Book
import org.springframework.stereotype.Repository

@Repository
interface IBookDao {
    List<Book> getBooks()
    Book getBook(int id)
}