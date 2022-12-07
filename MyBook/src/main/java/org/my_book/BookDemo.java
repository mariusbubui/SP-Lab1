package org.my_book;

import org.my_book.book.element.Section;
import org.my_book.book.element.Table;
import org.my_book.book.element.image.Image;
import org.my_book.book.element.image.ImageProxy;
import org.my_book.book.element.paragraph.Paragraph;
import org.my_book.visitor.BookStatistics;

public class BookDemo {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.addElement(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.addElement(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.addElement(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.addElement(p4);
        cap1.addElement(new ImageProxy("ImageOne"));
        cap1.addElement(new Image("ImageTwo"));
        cap1.addElement(new Paragraph("Some text"));
        cap1.addElement(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();
    }
}
