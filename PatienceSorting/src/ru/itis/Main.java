package ru.itis;

import java.io.File;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) throws Exception {
                String [] elements;
                int array[];

                Scanner sc = new Scanner(new File("arrays100.txt"));
                while (sc.hasNextLine()) {
                    elements = sc.nextLine().split(" ");
                    array = new int[15];
                    for (int i = 0; i < 15; i++) {
                        array[i] = Integer.parseInt(elements[i]);
                    }
                    try {
                        PatienceSort.sort(array);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        }

