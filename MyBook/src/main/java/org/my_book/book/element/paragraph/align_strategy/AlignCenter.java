package org.my_book.book.element.paragraph.align_strategy;

import org.my_book.book.element.paragraph.Paragraph;

public class AlignCenter implements AlignStrategy {
    @Override
    public String render(Paragraph paragraph) {
        return "## " + paragraph.getText() + " ##";
    }
}
