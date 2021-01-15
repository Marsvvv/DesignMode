package IteratorMode;

public interface Aggregate {

    /**
     * 用于生成一个用于遍历集合列表的迭代器
     *
     * @return Iterator
     */
    Iterator iterator();
}
