package controller;

import service.DataService;
import view.ToyView;

import java.util.Scanner;

public class Controller {
    private final Scanner scanner = new Scanner(System.in);
    private final ToyView toyView = new ToyView();
    private final DataService dataService = new DataService();

    public void showMenu(){
        toyView.showMenu();
    }

    public void inputNewToy(){
        toyView.showMessage1();
        String toyName = scanner.nextLine();
        toyView.showMessage2();
        int toyCount = scanner.nextInt();
        toyView.showMessage3();
        int dropChance = scanner.nextInt();
        dataService.createToy(toyName, toyCount, dropChance);
    }

    public void showAllToy(){
        toyView.showAllToys(dataService.getAllToyList());
    }
}
