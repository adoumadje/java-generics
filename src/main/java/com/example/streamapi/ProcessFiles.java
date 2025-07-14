package com.example.streamapi;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProcessFiles {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String path = "src/main/resources/people.txt";
        Stream<String> players = Files.lines(Paths.get(path));
        players.filter(name -> name.contains("c") || name.contains("C")).forEach(System.out::println);
    }
}
