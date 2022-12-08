package org.my_book.book.element;

import org.my_book.visitor.Visitor;

public interface Element {
    void print();
    String getContent();
    void addElement(Element element);
    void removeElement(Element element);
    Element getElement(int index);
    void accept(Visitor visitor);
}
