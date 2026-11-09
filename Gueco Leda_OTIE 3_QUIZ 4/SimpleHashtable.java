package com.gdstruc.module5;

public class SimpleHashtable {

    private StoredPlayer[] hashtable;

    // Creates a hashtable with 10 slots
    public SimpleHashtable() {
        hashtable = new StoredPlayer[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void put(String key, Player value) {
        int hashedKey = hashKey(key);

        if (isOccupied(hashedKey)) {
            int stoppingIndex = hashedKey;

            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            }
            else {
                hashedKey++;
            }

            while (isOccupied(hashedKey) && hashedKey != stoppingIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (isOccupied(hashedKey)) {
            System.out.println("Sorry, the hashtable is full!");
        }
        else {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }

    public Player get(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        return hashtable[hashedKey].value;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        int stoppingIndex = hashedKey;

        while (hashtable[hashedKey] != null) {

            if (hashtable[hashedKey].key.equals(key)) {
                return hashedKey;
            }

            hashedKey = (hashedKey + 1) % hashtable.length;

            if (hashedKey == stoppingIndex) {
                break;
            }
        }

        return -1;
    }

    // Removes a player using the given key
    public Player remove(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        Player removedPlayer = hashtable[hashedKey].value;
        hashtable[hashedKey] = null;

        // Reinsert the following players to preserve linear probing
        int nextIndex = (hashedKey + 1) % hashtable.length;

        while (hashtable[nextIndex] != null) {
            StoredPlayer storedPlayer = hashtable[nextIndex];
            hashtable[nextIndex] = null;

            put(storedPlayer.key, storedPlayer.value);

            nextIndex = (nextIndex + 1) % hashtable.length;
        }

        return removedPlayer;
    }

    private boolean isOccupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] != null) {
                System.out.println("Element " + i + " " + hashtable[i].value);
            }
            else {
                System.out.println("Element " + i + " null");
            }
        }
    }
}
