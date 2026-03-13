package Lab7_300494305.Ex1;

public class ArrayStack<E> implements Stack<E> {

    private final E[] items;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack(int size) {
        items = (E[]) new Object[size];
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public E peek() {
        return items[top - 1];
    }

    public E pop() {
        top--;
        E item = items[top];
        items[top] = null;
        return item;
    }

    public void push(E item) {
        items[top] = item;
        top++;
    }

    public void clear() {
        while (!isEmpty()) {
            pop();
        }
    }
}
