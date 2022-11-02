package org.my_book.book.element;

public class TableOfContents implements Element {
    private Object content;

    public TableOfContents(Object content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Table of contents:");
    }

    @Override
    public void addElement(Element element) {
    }

    @Override
    public void removeElement(Element element) {
    }

    @Override
    public Element getElement(int index) {
        return null;
    }
}
