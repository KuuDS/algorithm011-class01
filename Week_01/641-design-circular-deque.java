class MyCircularDeque {
    private Node head;
    private Node tail;

    private final int maxSize;
    private int current = 0;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.maxSize = k;
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is
     * successful.
     */
    public boolean insertFront(int value) {
        // if (!isValueValid(value)) {
        //     return false;
        // }
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            insertWhileEmpty(value);
        } else {
            Node n = new Node(value);
            n.next = head;
            head.prev = n;
            head = n;
        }
        current++;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is
     * successful.
     */
    public boolean insertLast(int value) {
        // if (!isValueValid(value)) {
        //     return false;
        // }
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            insertWhileEmpty(value);
        } else {
            Node n = new Node(value);
            n.prev = tail;
            tail.next = n;
            tail = n;
        }
        current++;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is
     * successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        if (current == 1) {
            deleteWhileOneLeft();
        } else {
            head = head.next;
            head.prev = null;
        }
        current--;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is
     * successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (current == 1) {
            deleteWhileOneLeft();
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        current--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        return isEmpty() ? -1 : head.value;

    }

    /** Get the last item from the deque. */
    public int getRear() {
        return isEmpty() ? -1 : tail.value;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return current == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return current == maxSize;
    }

    private void insertWhileEmpty(int value) {
        Node n = new Node(value);
        this.head = n;
        this.tail = n;
    }

    private void deleteWhileOneLeft() {
        this.head = null;
        this.tail = null;
    }

    private static class Node {
        private int value;
        private Node prev;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    // test case bug 允许插入0
    private boolean isValueValid(int value) {
        //return true;
        return value >= 1 && value <= 1000;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k); boolean param_1 =
 * obj.insertFront(value); boolean param_2 = obj.insertLast(value); boolean
 * param_3 = obj.deleteFront(); boolean param_4 = obj.deleteLast(); int param_5
 * = obj.getFront(); int param_6 = obj.getRear(); boolean param_7 =
 * obj.isEmpty(); boolean param_8 = obj.isFull();
 */