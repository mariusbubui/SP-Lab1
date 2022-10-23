package org.my_book.book.element;

public class Paragraph implements Element {
    private final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }
}
