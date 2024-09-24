package com.ps.java15;

public class TextBlocksExample {
    public static void main(String[] args) {
        //Before Java 15
        String text="\"First Line\"\nSecond Line \nThird Line";
        System.out.println(text);

        //After Java 15 -- Using TextBlock feature
        System.out.println("Using Java 15 TextBlock");
        String text1= """
                "First Line"
                Second Line
                Third Line
                    Fourth Line
                          Fifth Line
                  Sixth Line
                """;
        System.out.println(text1);
        String textBlock= """
                Name : %s
                Age :: %d
                Line 3
                Line 4
                """.formatted("Fakir Mohan",31);
        System.out.println(textBlock);
    }
}
