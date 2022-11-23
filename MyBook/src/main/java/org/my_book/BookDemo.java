package org.my_book;

import org.my_book.book.element.Section;
import org.my_book.book.element.paragraph.Paragraph;
import org.my_book.book.element.paragraph.align_strategy.AlignCenter;
import org.my_book.book.element.paragraph.align_strategy.AlignLeft;
import org.my_book.book.element.paragraph.align_strategy.AlignRight;

public class BookDemo {
    public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.addElement(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.addElement(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.addElement(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.addElement(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}
