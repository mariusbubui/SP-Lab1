package org.my_book.book;

public class TableOfContents {
    private final Book book;

    public TableOfContents(Book book) {
        this.book = book;
    }

    public void print() {
        System.out.println("Table of contents:");
    }
}
