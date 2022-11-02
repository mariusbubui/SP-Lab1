package org.my_book;

import org.my_book.author.Author;
import org.my_book.book.Book;
import org.my_book.book.element.Image;
import org.my_book.book.element.Paragraph;
import org.my_book.book.element.Section;

public class BookDemo {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);
        cap1.addElement(new Paragraph("Moto capitol"));
        cap1.addElement(cap11);
        cap11.addElement(new Paragraph("Text from subchapter 1.1"));
        cap11.addElement(cap111);
        cap111.addElement(new Paragraph("Text from subchapter 1.1.1"));
        cap111.addElement(cap1111);
        cap1111.addElement(new Image("Image subchapther 1.1.1.1"));

        noapteBuna.print();
    }
}
