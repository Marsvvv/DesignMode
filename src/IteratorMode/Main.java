package IteratorMode;

/**
 * Iterator模式最重要的四个类
 * 迭代器      Iterator            定义基本的迭代接口
 * 迭代器实现   BookShelfIterator   实现迭代方法
 * 集合        Aggregate           获取迭代器的接口
 * 集合实现     BookShelf           获取迭代器的接口的实现，以及与单体的关联关系
 * 单体        Book                 基本的单体数据
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-legs"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }
}