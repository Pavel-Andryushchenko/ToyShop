package model;

public class Toy extends AbstractToy
{
    public Toy(String toyName, int toyCount, int dropChance, int toyId) {
        super(toyName, toyCount, dropChance, toyId);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "Id=" + toyId +
                ", Name=" + toyName +
                ", Count=" + toyCount +
                ", dropChance=" + dropChance +
                '}';
    }

    @Override
    public String getToyName() {
        return super.getToyName();
    }

    @Override
    public void setToyName(String toyName) {
        super.setToyName(toyName);
    }

    @Override
    public int getToyCount() {
        return super.getToyCount();
    }

    @Override
    public void setToyCount(int toyCount) {
        super.setToyCount(toyCount);
    }

    @Override
    public int getDropChance() {
        return super.getDropChance();
    }

    @Override
    public void setDropChance(int dropChance) {
        super.setDropChance(dropChance);
    }

    @Override
    public int getToyId() {
        return super.getToyId();
    }

    @Override
    public void setToyId(int toyId) {
        super.setToyId(toyId);
    }
}
