package IteratorMode;

public interface Iterator {

    /**
     * 是否存在下一个元素
     *
     * @return Boolean
     */
    Boolean hasNext();

    /**
     * 返回下一个元素
     *
     * @return Object
     */
    Object next();
}
