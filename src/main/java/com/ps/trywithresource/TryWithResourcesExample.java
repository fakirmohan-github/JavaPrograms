package com.ps.trywithresource;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("input.txt"))){




































































































            

        }catch (IOException e){
            System.out.println("Some Issue Occured while fetching the data");
        }
    }
}
