package model;

public abstract class AbstractToy {
    String toyName;
    int toyCount;
    int dropChance;
    int toyId;

    public AbstractToy(String toyName, int toyCount, int dropChance, int toyId) {
        this.toyName = toyName;
        this.toyCount = toyCount;
        this.dropChance =  dropChance;
        this.toyId = toyId;
    }
}
