import java.util.Stack;

class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        inStack.push(x);
    }

    // Removes the element from in front of queue and returns that element.
    public int pop() {
        moveInToOut();
        return outStack.pop();
    }

    // Get the front element.
    public int peek() {
        moveInToOut();
        return outStack.peek();
    }

    // Returns whether the queue is empty.
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Helper function to move elements from inStack to outStack if needed
    private void moveInToOut() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */