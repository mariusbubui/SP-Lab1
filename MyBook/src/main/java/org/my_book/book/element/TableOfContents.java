package org.my_book.book.element;

import org.my_book.visitor.Visitor;

public class TableOfContents implements Element {
    private final String content;

    public TableOfContents(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void print() {
        System.out.println("Table of contents:");
    }
}
