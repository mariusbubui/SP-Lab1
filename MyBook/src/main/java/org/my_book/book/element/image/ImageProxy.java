package org.my_book.book.element.image;

import org.my_book.book.element.Element;
import org.my_book.visitor.Visitor;

public class ImageProxy implements Element {
    private final String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    private Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
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
}
