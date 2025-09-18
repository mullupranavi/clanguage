import java.util.Arrays;

class HashTable {
    private Integer[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        this.table = new Integer[size];
        Arrays.fill(this.table, null); // initialize with nulls
    }

    private int hash(int key) {
        return key % size;
    }

    public void insert(int key) {
        int index = hash(key);
        int originalIndex = index;

        while (table[index] != null) {
            index = (index + 1) % size;
            if (index == originalIndex) {
                System.out.println("Table is full! Couldn't insert key: " + key);
                return;
            }
        }

        table[index] = key;
    }

    public boolean search(int key) {
        int index = hash(key);
        int originalIndex = index;

        while (table[index] != null) {
            if (table[index] == key) return true;
            index = (index + 1) % size;
            if (index == originalIndex) break;
        }

        return false;
    }

    public void delete(int key) {
        int index = hash(key);
        int originalIndex = index;

        while (table[index] != null) {
            if (table[index] == key) {
                table[index] = null;
                rehashFrom(index);
                return;
            }
            index = (index + 1) % size;
            if (index == originalIndex) break;
        }
    }

    private void rehashFrom(int start) {
        int index = (start + 1) % size;

        while (table[index] != null) {
            int keyToRehash = table[index];
            table[index] = null;
            insert(keyToRehash);
            index = (index + 1) % size;
        }
    }

    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + (table[i] == null ? "null" : table[i]));
        }
    }

    public int[] getDistribution() {
        int[] dist = new int[size];
        for (int i = 0; i < size; i++) {
            dist[i] = table[i] != null ? 1 : 0;
        }
        return dist;
    }
}
public class Mian {
    public static void main(String[] args) {
        int[] keys = {23, 44, 12, 39, 33, 56};

        System.out.println("=== Hash Table Size 10 ===");
        HashTable ht10 = new HashTable(10);
        for (int key : keys) ht10.insert(key);
        ht10.display();

        System.out.println("\nSearch in Size 10:");
        searchKeys(ht10, new int[]{12, 99, 44});

        System.out.println("\nAfter Deletion (39, 23):");
        ht10.delete(39);
        ht10.delete(23);
        ht10.display();

        System.out.println("\n=== Hash Table Size 7 ===");
        HashTable ht7 = new HashTable(7);
        for (int key : keys) ht7.insert(key);
        ht7.display();

        System.out.println("\nSearch in Size 7:");
        searchKeys(ht7, new int[]{12, 99, 44});

        System.out.println("\nAfter Deletion (39, 23):");
        ht7.delete(39);
        ht7.delete(23);
        ht7.display();

        System.out.println("\n=== Distribution Comparison ===");
        compareDistributions(ht10, ht7);
    }

    static void searchKeys(HashTable ht, int[] keysToSearch) {
        for (int key : keysToSearch) {
            boolean found = ht.search(key);
            System.out.println("Key " + key + ": " + (found ? "Found" : "Not Found"));
        }
    }

    static void compareDistributions(HashTable ht10, HashTable ht7) {
        int[] dist10 = ht10.getDistribution();
        int[] dist7 = ht7.getDistribution();

        int slots10 = 0, slots7 = 0;
        for (int v : dist10) slots10 += v;
        for (int v : dist7) slots7 += v;

        System.out.println("Size 10 - Used Slots: " + slots10 + "/" + dist10.length);
        System.out.println("Size 7  - Used Slots: " + slots7 + "/" + dist7.length);

        System.out.println("More Even Spread: " + (slots10 == slots7 ? "Equal Usage" : (slots10 > slots7 ? "Size 10" : "Size 7")));
    }
}
