package org;

import org.book.Book;

public class BookDemo {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraph("Paragraph 1");
        discoTitanic.createNewParagraph("Paragraph 2");
        discoTitanic.createNewParagraph("Paragraph 3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewParagraph("Paragraph 4");
        discoTitanic.createNewTable("Table 1");
        discoTitanic.createNewParagraph("Paragraph 5");
        discoTitanic.print();
    }
}
