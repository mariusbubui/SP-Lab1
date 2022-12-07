package org.my_book.visitor;

import org.my_book.book.Book;
import org.my_book.book.element.Section;
import org.my_book.book.element.Table;
import org.my_book.book.element.TableOfContents;
import org.my_book.book.element.image.Image;
import org.my_book.book.element.image.ImageProxy;
import org.my_book.book.element.paragraph.Paragraph;

public interface Visitor {
    void visit(Book book);

    void visit(Section section);

    void visit(TableOfContents tableOfContents);

    void visit(Paragraph paragraph);

    void visit(Table table);

    void visit(Image image);

    void visit(ImageProxy imageProxy);
}
