import java.util.*;

class Node {
    int appName;
    int state;
    Node next;
    Node prev;

    Node(int appName, int state) {
        this.appName = appName;
        this.state = state;
        next = prev = null;
    }
}

class LRUCache {

    Node front, back;   // front = MRU, back = LRU
    int size, capacity;
    Map<Integer, Node> hm;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        front = back = null;
        hm = new HashMap<>();
    }

    // Move node to front (MRU)
    private void moveToFront(Node app) {

        if (app == front) return;

        // remove from current position
        if (app == back) {
            back = back.next;
        }

        Node nextApp = app.next;
        Node prevApp = app.prev;

        if (nextApp != null) nextApp.prev = prevApp;
        if (prevApp != null) prevApp.next = nextApp;

        // insert at front
        app.next = null;
        app.prev = front;

        if (front != null) front.next = app;

        front = app;

        if (back == null) back = app;
    }

    public int get(int appName) {
        if (hm.containsKey(appName)) {
            Node app = hm.get(appName);
            moveToFront(app);
            return app.state;
        }
        return -1;
    }

    // Add new node at front
    private void addAtFront(Node app) {
        if (front == null) {
            front = back = app;
        } else {
            front.next = app;
            app.prev = front;
            app.next = null;
            front = app;
        }
    }

    // Remove LRU (back)
    private int removeBack() {
        if (back == null) return -1;

        int key = back.appName;

        Node nextApp = back.next; // because back → ... → front

        if (nextApp != null) {
            nextApp.prev = null;
        }

        back.next = null;
        back = nextApp;

        if (back == null) front = null;

        return key;
    }

    public void put(int appName, int state) {

        if (hm.containsKey(appName)) {
            Node app = hm.get(appName);
            app.state = state;
            moveToFront(app);
        } else {
            Node app = new Node(appName, state);
            hm.put(appName, app);
            addAtFront(app);
            size++;
        }

        if (size > capacity) {
            int key = removeBack();
            hm.remove(key);
            size--;
        }
    }
}