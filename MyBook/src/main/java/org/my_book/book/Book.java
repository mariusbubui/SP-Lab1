package org.my_book.book;

import org.my_book.author.Author;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Book {
    private final String title;
    private final List<Author> authors = new LinkedList<>();
    private final List<Chapter> chapters = new ArrayList<>();
    private TableOfContents tableOfContents;

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void setTableOfContents(TableOfContents tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

    public int createChapter(String chapterName) {
        Chapter chapter = new Chapter(chapterName);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void print() {
        System.out.println("Book: " + title);
        authors.forEach(Author::print);
        tableOfContents.print();
        chapters.forEach(Chapter::print);
    }
}
