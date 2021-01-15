package IteratorMode;

/**
 * 书架类，与书是一对多关系
 * 实现获取迭代器的接口
 * 对书的数据简单操作的方法
 *
 * @author asus
 */
public class BookShelf implements Aggregate {

    private Book[] books;

    private Integer last = 0;

    public BookShelf(int maxSize) {
        books = new Book[maxSize];
    }

    public Book getBookAt(Integer index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
