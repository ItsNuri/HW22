package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        FileWriter files = new FileWriter("Alphabets and numbers.txt");
        for (char a = 'A'; a < 'Z'; a++) {
            files.append(a);
        }
        for (char b = 'a'; b < 'z'; b++) {
            files.append(b);
        }
        for (char c = '0'; c <= '9'; c++) {
            files.append(c);
        }
        files.close();

        FileReader reader = new FileReader("Alphabets and numbers.txt");
        Scanner scanner = new Scanner(reader);

        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }


    }
}
//  try {
//            FileWriter fileWriter = new FileWriter("Nurzhan.txt");
//            fileWriter.write("Aa ");
//            fileWriter.write("Bb ");
//            fileWriter.write("Cc ");
//            fileWriter.close();
//            System.out.println("Successfully wrote to the file.");
//
//        }catch (Exception e) {
//            System.out.println("An erroe occurred.");
//            e.printStackTrace();
//
//        }
//        try {
//        FileReader reader = new FileReader("Nurzhan.txt");
//        Scanner scanner = new Scanner(reader);
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
//        reader.close();
//        }catch (Exception e){
//
//        }
