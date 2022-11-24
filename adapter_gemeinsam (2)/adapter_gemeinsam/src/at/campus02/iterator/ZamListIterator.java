package at.campus02.iterator;

import java.util.Iterator;

public class ZamListIterator implements Iterator<String> {
    private String[] words;
    private int position;

    public ZamListIterator(String[] text) {
        this.words = text;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position < words.length) { // bin ich noch nicht am Ende?
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String next() {
        String tempString = words[position];
        position++;
        return tempString;
    }
}
