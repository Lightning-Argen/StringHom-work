package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("EnglishAlphabet.txt");
        writer.write(" Aa\n Bb\n Cc\n Dd\n Ee\n Ff\n Gg \n Hh\n Ii\n " +
                "Jj\n Kk\n Ll\n Mm\n Nn\n Oo\n Pp\n Qq\n" +
                " Rr\n Ss\n Tt\n Uu\n Vv\n Ww\n Xx\n Yy\n Zz\n" +
                " 1\n 2\n 3\n 4\n 5\n 6\n 7\n 8\n 9");
        writer.close();

        FileReader reader = new FileReader("EnglishAlphabet.txt");
        Scanner scanner = new Scanner(reader);
        int c = 0;
        while (scanner.hasNextLine()){
            System.out.println(c++ + ":" + scanner.nextLine());
        }
        reader.close();
    }
}