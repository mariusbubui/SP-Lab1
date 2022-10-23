package org.my_book.book;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private final String name;
    private final List<SubChapter> subchapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapterName) {
        SubChapter subchapter = new SubChapter(subChapterName);
        subchapters.add(subchapter);
        return subchapters.indexOf(subchapter);
    }

    public SubChapter getSubChapther(int index) {
        return subchapters.get(index);
    }

    public void print() {
        System.out.println("Chapther: " + name);
        subchapters.forEach(SubChapter::print);
    }
}
