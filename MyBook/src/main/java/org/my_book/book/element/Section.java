package org.my_book.book.element;

import org.my_book.book.Book;
import org.my_book.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    protected final String title;
    private final List<Element> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public String getContent() {
        return title;
    }

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void addElement(Element element) {
        elements.add(element);
    }

    @Override
    public void removeElement(Element element) {
        elements.remove(element);
    }

    @Override
    public Element getElement(int index) {
        return elements.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void print() {
        if (!(this instanceof Book)) {
            System.out.println(title);
        }
        elements.forEach(Element::print);
    }
}
