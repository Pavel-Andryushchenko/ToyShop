import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        while (true){
            controller.showMenu();
            String enteredData = scanner.next();
            switch (enteredData){
                case ("add"):
                    controller.inputNewToy();
                    break;
                case ("list"):
                    controller.showAllToy();
                    break;
                case ("quit"):
                    break;
                default:
                    System.out.println("Повторите попытку");
                    break;
            }
            if(enteredData.equals("quit")) {break;}
        }
    }
}
