package org.my_book.visitor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.my_book.book.Book;
import org.my_book.book.element.Element;
import org.my_book.book.element.Section;
import org.my_book.book.element.Table;
import org.my_book.book.element.TableOfContents;
import org.my_book.book.element.image.Image;
import org.my_book.book.element.image.ImageProxy;
import org.my_book.book.element.paragraph.Paragraph;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookSaveVisitor implements Visitor {
    private final JSONObject json = new JSONObject();

    @Override
    public void visit(Book book) {
        json.put("Author", book.getAuthors());
        visit((Section) book);
    }

    @Override
    public void visit(Section section) {
        BookSaveVisitor bookSaveVisitor = new BookSaveVisitor();
        section.getElements().forEach(element -> element.accept(bookSaveVisitor));
        bookSaveVisitor.json.put("Title", section.getContent());

        try {
            if (!(json.get("Section") instanceof List)) {
                json.put("Section", new JSONArray(new ArrayList<>() {{
                    add(json.get("Section"));
                    add(bookSaveVisitor.json);
                }}));
            } else {
                json.put("Section", json.getJSONArray("Section").put(bookSaveVisitor.json));
            }
        } catch (JSONException e) {
            json.put("Section", bookSaveVisitor.json);
        }
    }

    @Override
    public void visit(TableOfContents tableOfContents) {
        addElementToJSON(tableOfContents, "TableOfContents");
    }

    @Override
    public void visit(Paragraph paragraph) {
        addElementToJSON(paragraph, "Paragraph");
    }

    @Override
    public void visit(Table table) {
        addElementToJSON(table, "Table");
    }

    @Override
    public void visit(Image image) {
        addElementToJSON(image, "Image");
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        addElementToJSON(imageProxy, "Image");
    }

    private void addElementToJSON(Element element, String key) {
        try {
            if (json.get(key) instanceof String) {
                json.put(key, new JSONArray(new ArrayList<>() {{
                    add(json.get(key));
                    add(element.getContent());
                }}));
            } else {
                json.put(key, json.getJSONArray(key).put(element.getContent()));
            }
        } catch (JSONException e) {
            json.put(key, element.getContent());
        }
    }

    public void writeBookJSONToFile(String path) throws IOException {
        try (FileWriter file = new FileWriter(path)) {
            file.write(json.toString(4));
        } catch (IOException e) {
            throw e;
        }
    }
}
