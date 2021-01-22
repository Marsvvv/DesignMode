package CompositeMode;

public abstract class Entry {

    /**
     * 获取名字
     *
     * @return String
     */
    public abstract String getName();

    /**
     * 获取大小
     *
     * @return int
     */
    public abstract int getSize();

    /**
     * 加入目录条目
     *
     * @param entry entry
     * @return Entry
     * @throws FileTreatMentException FileTreatMentException
     */
    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    /**
     * 显示目录一览
     */
    public void printList() {
        printList("");
    }

    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
