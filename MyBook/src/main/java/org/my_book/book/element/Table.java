package org.my_book.book.element;

public class Table implements Element {
    private final String title;

    public Table(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Table with title: " + title);
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
