package pl.dan.controllers;

import org.springframework.web.bind.annotation.*;
import pl.dan.exceptions.BookNotFoundException;
import pl.dan.model.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private List<Book> books;

    public BookController() {
        this.books = new ArrayList<>();
    }

    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException(id));
    }

    @PostMapping
    public boolean addBook(@RequestBody Book book) {
        return books.add(book);
    }
}
