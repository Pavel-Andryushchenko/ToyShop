package view;

import model.Toy;

import java.util.List;

public class ToyView {
    public void showAllToys(List<Toy> toyList){
        for(Toy toy: toyList){
            System.out.println(toy);
        }

    }
    public void showMenu(){
        System.out.println("""
            Введите команду:
            add - Добавить новую игрушку.
            list - Посмотерь список всех игрушек.
            quit - Выход.                                       \s
            """);
    }

    public void showMessage1(){
        System.out.println("Введите название игрушки: ");
    }

    public void showMessage2(){
        System.out.println("Введите колличество игрушек данного вида: ");
    }

    public void showMessage3(){
        System.out.println("Введите шанс выпадения: ");
    }
}
