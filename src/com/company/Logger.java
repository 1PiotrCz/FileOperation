package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Piotr Czubkowski on 2017-05-24.
 */
public class Logger {
    public static void main(String[] args) {

        File f = new File("D:\\Ak\\logger.txt");

        Logger logger = new Logger(f, "pozycja");
        logger.log("Witaj świecie, jestem pierwszym logiem");
        System.out.println("DODANO DO LOGGERA");
    }

    private File file;
    private String prefix;


    public Logger(File f, String prefix) {
        this.file = f;
        this.prefix = prefix;
    }

    public void log(String message) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String i = formatter.format(LocalDateTime.now());
        String allPrefix = i + " <" + prefix + ">: " + message + "\r\n";
        System.out.println(i);
        try {
            Files.write(file.toPath(), allPrefix.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}