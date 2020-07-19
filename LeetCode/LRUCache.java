class LRUCache {

    private int[][] cache;
    private int capacity;
    private int counter = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new int[capacity][3];
    }

    public int get(int key) {
        int result = -1;
        for (int i = 0; i < this.cache.length; i++) {
            if (this.cache[i][0] == key) {
                this.cache[i][2] = this.cache[i][2];
                result = this.cache[i][1];
            }
        }
        return result;
    }

    public void put(int key, int value) {
        int tempCounter = counter;
        int min = Integer.MAX_VALUE;
        int removeKey = -1;
        if (tempCounter == this.capacity) {
            for (int i = 0; i < this.cache.length; i++) {
                if (this.cache[i][2] < min) {
                    min = this.cache[i][2];
                    removeKey = this.cache[i][0];

                }
            }
            System.out.println(this.cache[removeKey][0]);
            System.out.println(this.cache[removeKey][1]);
            System.out.println(this.cache[removeKey][2]);
            this.cache[removeKey][0] = key;
            this.cache[removeKey][1] = value;
            this.cache[removeKey][2] = 0;

        } else {
            this.cache[counter][0] = key;
            this.cache[counter][1] = value;
            this.cache[counter][2] = 0;
            counter++;
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */