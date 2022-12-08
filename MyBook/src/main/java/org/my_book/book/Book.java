package org.my_book.book;

import org.my_book.author.Author;
import org.my_book.book.element.Element;
import org.my_book.book.element.Section;

import java.util.LinkedList;
import java.util.List;

public class Book extends Section {
    private final List<Author> authors = new LinkedList<>();

    public Book(String title) {
        super(title);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        super.addElement(element);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title + '\n');
        System.out.println("Authors:");
        authors.forEach(Author::print);
        System.out.println();
        super.print();
    }
}
