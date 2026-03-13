package Lab7_300494305.Ex2;

public interface Stack<E> {
    // Returns true if stack is empty, returns false otherwise
    boolean isEmpty();

    // Returns a reference to the top element of the stack without removing it
    E peek();

    // Returns and removes the top element of the stack
    E pop();

    // puts an element on top of the stack
    void push(E element);

    // Clears the stack
    void clear();
}
