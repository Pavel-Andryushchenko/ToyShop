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


    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyCount() {
        return toyCount;
    }

    public void setToyCount(int toyCount) {
        this.toyCount = toyCount;
    }

    public int getDropChance() {
        return dropChance;
    }

    public void setDropChance(int dropChance) {
        this.dropChance = dropChance;
    }

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }
}
