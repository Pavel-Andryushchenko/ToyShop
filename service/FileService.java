package service;

import model.Toy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public boolean checkFileForExists(String fileName){
        File file = new File(fileName);
        return file.exists();
    }
    public List<String> readFile(String fileName){
        List<String> result = new ArrayList<>();
        try (BufferedReader bF = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            while ((line = bF.readLine()) != null){
                result.add(line);
            }
        } catch (IOException e) {
            System.out.println("Файл не найден!");
        }
        return result;
    }

    public void writeFile(List<Toy> toyList){
        try(BufferedWriter bR = new BufferedWriter(new FileWriter("toys"))) {
            for (Toy toy: toyList){
                bR.write(toy.getToyName() + " " + toy.getToyCount() + " " + toy.getDropChance() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
