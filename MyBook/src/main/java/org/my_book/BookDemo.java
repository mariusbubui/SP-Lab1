package org.my_book;

import org.my_book.book.element.Section;
import org.my_book.book.element.Table;
import org.my_book.book.element.image.Image;
import org.my_book.book.element.image.ImageProxy;
import org.my_book.book.element.paragraph.Paragraph;
import org.my_book.visitor.BookSaveVisitor;
import org.my_book.visitor.BookStatistics;

import java.io.IOException;

public class BookDemo {
    public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        Section scap1 = new Section("Subcapitolul 1");
        Section scap2 = new Section("Subcapitolul 2");
        Paragraph p1 = new Paragraph("Paragraph 1");
        Paragraph p2 = new Paragraph("Paragraph 2");
        Paragraph p3 = new Paragraph("Paragraph 3");
        Paragraph p4 = new Paragraph("Paragraph 4");

        cap1.addElement(scap1);
        cap1.addElement(scap2);
        cap1.addElement(p1);
        cap1.addElement(p2);
        cap1.addElement(p3);
        cap1.addElement(new ImageProxy("ImageOne"));
        cap1.addElement(new Image("ImageTwo"));
        cap1.addElement(new Image("ImageThree"));
        cap1.addElement(new Table("Table 1"));
        cap1.addElement(new Table("Table 2"));

        scap2.addElement(p4);
        scap2.addElement(new Paragraph("Some text"));
        scap2.addElement(new Table("Table 3"));

        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();

        BookSaveVisitor save = new BookSaveVisitor();
        cap1.accept(save);
        try {
            save.writeBookJSONToFile("book.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
