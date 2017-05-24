package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Piotr Czubkowski on 2017-05-24.
 *
 * Stwórz aplikację, która pozwoli użytkownikowi na tworzenie plików i katalogów przez niego wybranych.
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 - katalog
        // 2 - plik
        // 3 - exit
        System.out.println("1 - aby utworzyć katalog");
        System.out.println("2 - aby utworzyć plik");
        System.out.println("3 - aby wyjść");
        int option = 0;
        do {
            
            System.out.print("Wybierz opcje: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1: {
                    System.out.print("Podaj adres do katalogu: ");
                    String catalog = scanner.nextLine();
                    File file = new File(catalog);
                    if(file.mkdirs()) {
                        System.out.println("Udało się utworzyć katalog");
                    }else {
                        System.out.println("Wystąpił błąd lub katalog już istnieje");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Podaj sciężkę do pliku: ");
                    String catalog = scanner.nextLine();
                    File file = new File(catalog);
                    try{
                        if(file.createNewFile()) {
                            System.out.println("Udało się utworzyć plik");
                        }else {
                            System.out.println("Wystąpił błąd lub plik już istnieje");
                        }
                    }catch(IOException io){
                        io.printStackTrace();
                    }
                    break;
                }
            }


        }while(option != 3);
        scanner.close();
    }
}
