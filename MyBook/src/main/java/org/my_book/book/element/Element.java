package org.my_book.book.element;

public interface Element {
    void print();
    void addElement(Element element);
    void removeElement(Element element);
    Element getElement(int index);
}
