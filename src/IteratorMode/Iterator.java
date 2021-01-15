package IteratorMode;

/**
 * Iterator模式用于数据集合中按照顺序遍历集合
 * 这个类是用来定义
 *
 * @author asus
 */
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
