package view;

import model.Toy;

import java.util.Deque;
import java.util.List;

public class ToyView {
    public void showWinnerToys(List<Toy> toyList){
        for(Toy toy: toyList){
            System.out.println(toy);
        }
    }

    public void showToy(Toy toy){
        System.out.println(toy.toString());
    }
    public void showMenu(){
        System.out.println("""
                Введите команду:
                script - демонстрация работы программы.
                add - добавить новую игрушку.
                list - посмотерь список всех игрушек.
                lottery - произвести розыгрышь лотереи.
                winner - посмотреть список выигранных игрушек.
                get - получить приз.
                quit - Выход.                                        \s
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
    public void showMessage4(){
        System.out.println("Лотерея разыграна!");
    }

    public void showWinnerToys(Deque<Toy> droppedToyList) {
        for (Toy toy: droppedToyList){
            System.out.println(toy);
        }
    }
}
