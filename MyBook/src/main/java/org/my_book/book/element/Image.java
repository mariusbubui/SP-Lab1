package org.my_book.book.element;

public class Image implements Element{
    private final String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + imageName);
    }
}
