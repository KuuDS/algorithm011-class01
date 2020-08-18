class LRUCache {

    private final Map<Integer, Node> cache;
    private final Integer capacity;
    private final Node HEAD = new Node(-1, -1);
    private Node cur = HEAD;
    private int size = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
            if (cur != node) {
                // 移动节点到队尾
                // p -> node -> n
                // p -> n     cur -> node
                Node prev = node.prev;
                Node next = node.next;
                // p.next = next

                prev.next = next;
                next.prev = prev;

                cur.next = node;
                node.prev = cur;
                node.next = null;
                // cur = n;
                cur = node;
            }
        return node.val;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            // 修改val
            Node node = cache.get(key);
            node.val = value;
            if (cur != node) {
                // 移动节点到队尾
                // p -> node -> n
                // p -> n     cur -> node
                Node prev = node.prev;
                Node next = node.next;
                // p.next = next

                prev.next = next;
                next.prev = prev;

                cur.next = node;
                node.prev = cur;
                node.next = null;
                // cur = n;
                cur = node;
            }
            return;
        } else {
            // new instance
            Node node = new Node(key, value);
            // insert
            cur.next = node;
            node.prev = cur;
            cur = node;
            cache.put(key, node);
            if (size < capacity) {
                size++;
            } else {
                // 移除队首元素
                Node removed = HEAD.next;
                Node newHead = removed.next;
                HEAD.next = newHead;
                newHead.prev = HEAD;
                removed.next = null;
                removed.prev = null;
                // remove frome cache
                cache.remove(removed.key);
            }
        }
    }

    class Node {
        Node prev;
        Node next;
        private int key;
        private int val;

        public Node(int key, int value) {
            this.key = key;
            this.val = value;
        }
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */