package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader();
        fileReader.FileRead("src/main/resources/contacts.txt");
    }
}