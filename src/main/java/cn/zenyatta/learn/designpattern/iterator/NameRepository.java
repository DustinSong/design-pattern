package cn.zenyatta.learn.designpattern.iterator;

/**
 * @author mingming.song
 */
public class NameRepository implements Container<String> {
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {

        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return this.hasNext() ? names[index++] : null;
        }
    }
}
