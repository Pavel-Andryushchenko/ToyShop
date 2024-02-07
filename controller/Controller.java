package controller;

import model.Toy;
import service.DataService;
import service.FileService;
import view.ToyView;

import java.util.Scanner;

public class Controller {
    private final Scanner scanner = new Scanner(System.in);
    private final ToyView toyView = new ToyView();
    private final DataService dataService = new DataService();
    private final FileService fileService = new FileService();

    public void showMenu(){
        toyView.showMenu();
    }

    public void loadInfo(){
        if (fileService.checkFileForExists("toys")){
            dataService.procInfoFromFile(fileService.readFile("toys"));
        }
    }

    public void writeInfoToFile(){
        fileService.writeFile(dataService.getAllToyList());
    }

    public void inputNewToy(){
        toyView.showMessage1();
        String toyName = scanner.next();
        toyView.showMessage2();
        int toyCount = scanner.nextInt();
        toyView.showMessage3();
        int dropChance = scanner.nextInt();
        dataService.createToy(toyName, toyCount, dropChance);
    }

    public void showAllToy(){
        if (dataService.getAllToyList().isEmpty()){
            System.out.println("Игрушек нет!");
        }
        else {
            toyView.showWinnerToys(dataService.getAllToyList());
        }

    }
    public void showWinner(){
        toyView.showWinnerToys(dataService.getDroppedToyList());
    }
    public void playLottery(){
        if (dataService.getAllToyList().isEmpty()) {System.out.println("Извините, но все призы разыграны");}
        else {
            Toy droppedToy = dataService.playTheLottery();
            toyView.showMessage4();
            dataService.reduceCountToy(droppedToy);
        }
    }

    public void getPrize(){
        if (dataService.getDroppedToyList().isEmpty()){
            System.out.println("Все призы выданы!");
        }
        else {
            System.out.println(dataService.getDroppedToyList().pop());
        }
    }
    public void script(){
        showAllToy();
        playLottery();
        playLottery();
        playLottery();
        System.out.println("Победители: ");
        showWinner();
        System.out.println("Выдача призов: ");
        getPrize();
        getPrize();
        getPrize();
        getPrize();
    }
}
