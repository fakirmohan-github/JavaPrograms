package com.ps.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteExample {
    public static void main(String[] args) throws IOException {

        //With Java 11 File Read and Write is more easier using readString and writeString

        //Path path= Paths.get("./resources/sample.txt");
        Path path = Paths.get("/Users/fakirmohan/IdeaProjects/JavaPrograms/resources/sample.txt");
        System.out.println("Path :: "+path);
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        String content=Files.readString(path);
        System.out.println(content);

        Path newPath = Paths.get("/Users/fakirmohan/IdeaProjects/JavaPrograms/resources/sample1.txt");
        String newContent=content.replace("beautiful","fabulus");
        Files.writeString(newPath,newContent);

    }
}
