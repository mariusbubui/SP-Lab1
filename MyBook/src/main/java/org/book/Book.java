package org.book;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String title;
    private List<String> paragraphs = new ArrayList<>();
    private List<String> images = new ArrayList<>();
    private List<String> tables = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String text){
        paragraphs.add(text);
    }

    public void createNewImage(String text){
        images.add(text);
    }

    public void createNewTable(String text){
        tables.add(text);
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Title: ");
        stringBuilder.append(title).append("\nParagraphs:\n");
        paragraphs.forEach(paragraph -> stringBuilder.append(paragraph).append("\n"));
        stringBuilder.append("Images:\n");
        images.forEach(image -> stringBuilder.append(image).append("\n"));
        stringBuilder.append("Tables:\n");
        tables.forEach(table -> stringBuilder.append(table).append("\n"));

        return stringBuilder.toString();
    }
}
