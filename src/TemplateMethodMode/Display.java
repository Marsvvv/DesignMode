package TemplateMethodMode;

public abstract class Display {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    private final Integer COUNT = 5;

    public final void display() {
        open();
        for (int i = 0; i < COUNT; i++) {
            print();
        }
        close();
    }
}
