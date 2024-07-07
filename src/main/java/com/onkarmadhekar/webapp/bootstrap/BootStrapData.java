package com.onkarmadhekar.webapp.bootstrap;

import com.onkarmadhekar.webapp.entity.Author;
import com.onkarmadhekar.webapp.entity.Book;
import com.onkarmadhekar.webapp.entity.Publisher;
import com.onkarmadhekar.webapp.repositories.AuthorRepository;
import com.onkarmadhekar.webapp.repositories.BookRepository;
import com.onkarmadhekar.webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author("James","Clear");
        Book book1 = new Book("Atomic Habits","ISBN1");
        Publisher publisher1 = new Publisher("Rockwood Publisher","Address 1","Manhattan","New York","ZIP001");

        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        book1.setPublisher(publisher1);
        publisher1.getBooks().add(book1);


        authorRepository.save(author1);
        bookRepository.save(book1);
        publisherRepository.save(publisher1);

    }
}
