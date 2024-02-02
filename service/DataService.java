package service;

import model.Toy;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    List<Toy> allToyList = new ArrayList<>();
    List<Toy> dropedToyList = new ArrayList<>();

    public void createToy(String toyName, int toyCount, int dropChance){
        allToyList.add(new Toy(toyName, toyCount, dropChance, getLastId()));
    }

    public int getLastId(){
        if(allToyList.isEmpty()){
            return 1;
        }
        else return allToyList.size() + 1;
    }



    public List<Toy> getAllToyList() {
        return allToyList;
    }

    public void setAllToyList(List<Toy> allToyList) {
        this.allToyList = allToyList;
    }

    public List<Toy> getDropedToyList() {
        return dropedToyList;
    }

    public void setDropedToyList(List<Toy> dropedToyList) {
        this.dropedToyList = dropedToyList;
    }
}
