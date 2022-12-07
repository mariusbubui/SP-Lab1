package org.my_book.book.element.paragraph;

import org.my_book.book.element.Element;
import org.my_book.book.element.paragraph.align_strategy.AlignStrategy;
import org.my_book.visitor.Visitor;

public class Paragraph implements Element {
    private final String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print() {
        if (alignStrategy == null) {
            System.out.println("Paragraph: " + text);
        } else {
            System.out.println("Paragraph: " + alignStrategy.render(this));
        }
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

    public String getText() {
        return text;
    }
}
