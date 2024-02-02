package model;

public class Toy extends AbstractToy
{
    public Toy(String toyName, int toyCount, int dropChance, int toyId) {
        super(toyName, toyCount, dropChance, toyId);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyName='" + toyName + '\'' +
                ", toyCount=" + toyCount +
                ", dropChance=" + dropChance +
                ", toyId=" + toyId +
                '}';
    }
}
