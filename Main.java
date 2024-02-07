import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        controller.loadInfo();
        controller.showMenu();
        while (true){
            String enteredData = scanner.next();
            switch (enteredData){
                case ("add"):
                    controller.inputNewToy();
                    break;
                case ("list"):
                    controller.showAllToy();
                    break;
                case ("lottery"):
                    controller.playLottery();
                    break;
                case ("winner"):
                    controller.showWinner();
                    break;
                case ("get"):
                    controller.getPrize();
                    break;
                case ("script"):
                    controller.script();
                    break;
                case ("quit"):
                    controller.writeInfoToFile();
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
            if(enteredData.equals("quit")) {break;}
        }
    }
}
