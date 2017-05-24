package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Created by Piotr Czubkowski on 2017-05-24.
 * <p>
 * W programie stwórz plik test.txt, jeżeli istnieje nie nadpisuj,  następnie zapisuj do niego to,
 * co użytkownik wpisze do konsoli.
 */
public class Ex2 {

    public static void main(String[] args) {

        File myFile = new File("D:\\Ak\\", "test.txt");
        Scanner scanner = new Scanner(System.in);
        if (!myFile.exists()) {
            try {
                myFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj tekst: ");
            try {
                Files.write(myFile.toPath(), (scanner.nextLine() + "\r\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

