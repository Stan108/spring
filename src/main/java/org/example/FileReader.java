package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public void FileRead(String path) throws IOException {
        StringBuilder content = new StringBuilder();
        String line = "";
        BufferedReader reader = Files.newBufferedReader(Paths.get(path));
        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }
        System.out.println(content);
    }


}
