package ru.sergey_gusarov.hw7_8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Main.class);

/*
        BookRepository bookRepository = context.getBean(BookRepository.class);
        BookCommentRepository bookCommentsRepository = context.getBean(BookCommentRepository.class);
        DictGenreRepository dictGenreRepository = context.getBean(DictGenreRepository.class);
        CommentsService commentsService = context.getBean(CommentsService.class);

        List<Book> books = null;
        books = bookRepository.findAll();

        Set<Genre> genres = new HashSet<>(1);
        genres.add(new Genre( "Genre1"));
        Set<Author> authors = new HashSet<>(2);
        authors.add(new Author("Author1"));
        authors.add(new Author("Author2"));
        Book book = new Book("Title1Update", genres, authors);

        bookRepository.insert(book);


        Book testBook1 = bookRepository.getById(2);
        Book testBook2 = bookRepository.getById(1);
        Book testBook3 = bookRepository.getById(3);
        System.out.println("Book count " + bookRepository.count());

        testBook2.setTitle("NEW TITLE");
        bookRepository.update(testBook2);
        Set<Author> authorSetBook2 = testBook2.getAuthors();
        authorSetBook2.add(new Author("New Author"));
        testBook2 = bookRepository.update(testBook2);

        BookComment bookComment = new BookComment();
        bookComment.setText("some comment");
        bookComment.setBook(testBook2);
        testBook2.getBookComments().add(bookComment);
        testBook2 = bookRepository.update(testBook2);
        testBook2.getBookComments().stream().forEach(e -> {
            System.out.println(e.getText());});

        Genre genre = new Genre("Genre OK");
        genre = dictGenreRepository.save(genre);
        genre = dictGenreRepository.save(genre);
        testBook2.getGenres().add(genre);
        testBook2 = bookRepository.update(testBook2);
        testBook2.getGenres().stream().forEach(System.out::println);

        commentsService.AddBookComments(testBook2, "SOME new comment" );
        testBook2 = bookRepository.getById(1);
        testBook2.getBookComments().stream().forEach(e -> {
            System.out.println(e.getText());});

        Console.main(args);
        */
    }
}
