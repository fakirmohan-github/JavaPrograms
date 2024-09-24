package com.ps.java11;

public class LinesInString {
    public static void main(String[] args) {
        "Java\nis\na\npowerful\nlanguage".lines().forEach(System.out::println);
    }
}
