package Kegiatan1;

public class Stack {
    private int top;
    private Object[] elements;

    public Stack(int capacity) {
        elements = new Object[capacity];
        top = -1;
    }

    public void push(Object item) {
        if (top == elements.length - 1) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        elements[top] = item;
    }

    public Object pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        Object item = elements[top];
        top--;
        return item;
    }

    public Object peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[top];
    }

    public boolean empty() {
        return top == -1;
    }

    public int search(Object item) {
        for (int i = top; i >= 0; i--) {
            if (elements[i].equals(item)) {
                return top - i + 1;
            }
        }
        return -1;
    }
}