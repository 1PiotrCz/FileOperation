package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Piotr Czubkowski on 2017-05-24.
 * <p>
 * Stwórz program, który wyświetli wszystkie linie zapisane w pliku test.txt z zadania 2.
 */
public class Ex3 {

    public static void main(String[] args) {
        try {
            List<String> linesOfText = Files.readAllLines(Paths.get("D:\\Ak\\test.txt"));
            for (String line : linesOfText) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

