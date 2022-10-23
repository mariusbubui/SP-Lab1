package org.my_book.book;

import org.my_book.book.element.Element;
import org.my_book.book.element.Image;
import org.my_book.book.element.Paragraph;
import org.my_book.book.element.Table;

import java.util.LinkedList;
import java.util.List;

public class SubChapter {
    private final String name;
    private final List<Element> elements = new LinkedList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String paragraphName) {
        elements.add(new Paragraph(paragraphName));
    }

    public void createNewImage(String imageName) {
        elements.add(new Image(imageName));
    }

    public void createNewTable(String tableName) {
        elements.add(new Table(tableName));
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        elements.forEach(Element::print);
    }
}
