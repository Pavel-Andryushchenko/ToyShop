package service;

import model.Toy;

import java.util.*;

public class DataService {
    List<Toy> allToyList = new ArrayList<>();
    Deque<Toy> droppedToyList = new ArrayDeque<>();

    public void createToy(String toyName, int toyCount, int dropChance){
        allToyList.add(new Toy(toyName, toyCount, dropChance, getLastId()));
    }

    public void procInfoFromFile(List<String> fileInfo){
        for (String string: fileInfo){
            String[] arrStr = string.split(" ");
            if (arrStr.length == 3 && arrStr[1].matches("[0-9]+") && arrStr[2].matches("[0-9]+")){
                createToy(arrStr[0], Integer.parseInt(arrStr[1]), Integer.parseInt(arrStr[2]));
            }
        }
    }

    public int getLastId(){
        if(allToyList.isEmpty()){
            return 1;
        }
        else return allToyList.size() + 1;
    }


    public Toy playTheLottery(){
        int overall_chance = 0;                                       //сумма шансов на победу всех игрушек
        for (Toy toy: allToyList){
            overall_chance += toy.getDropChance();
        }
        Random rnd = new Random();
        int random = rnd.nextInt(overall_chance + 1);          //случайное число от 1 до суммы шансов
        int index = 0;
        int drop_chance = allToyList.get(index).getDropChance();      //шанс на победу первой игрушки
        while (random > drop_chance){                                 //если случайное число попало в диапозон от 1 до шанса на победу первой игрушки - значит она победила
            index += 1;                                               //иначе переходим к следующему диапозону
            drop_chance += allToyList.get(index).getDropChance();
        }
        droppedToyList.add(allToyList.get(index));
        return allToyList.get(index);
    }

    public void reduceCountToy(Toy toy){
        if (toy.getToyCount() == 1){
            allToyList.remove(toy);
        }
        else {
            toy.setToyCount(toy.getToyCount() - 1);
            }
        }

    public List<Toy> getAllToyList() {
        return allToyList;
    }

    public void setAllToyList(List<Toy> allToyList) {
        this.allToyList = allToyList;
    }

    public Deque<Toy> getDroppedToyList() {
        return droppedToyList;
    }

    public void setDroppedToyList(Deque<Toy> droppedToyList) {
        this.droppedToyList = droppedToyList;
    }
}
