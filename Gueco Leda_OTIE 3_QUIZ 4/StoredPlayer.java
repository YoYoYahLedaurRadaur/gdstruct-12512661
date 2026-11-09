package com.gdstruc.module5;

public class StoredPlayer {

    String key;
    Player value;

    // Creates a stored player with a key and player value
    public StoredPlayer(String key, Player value) {
        this.key = key;
        this.value = value;
    }
}