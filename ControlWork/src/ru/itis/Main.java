package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strInput = scanner.next();
        Analyzer analyzer = new Analyzer();
        analyzer.analyze(strInput);
    }
}
