package com.github.mohamedeissa.testingissa2022;

import java.util.ArrayList;

import javax.naming.Context;

public class TestingIssa2022 {
    public static String name;
    public static String mAge;
    public static final int loop = 100;
    public Context context;

    public TestingIssa2022(Context context) {
        this.context = context;
    }

    public static int numbersAvg(int number[], int searcher) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] == searcher) {
                System.out.println("num:- " + number[i]);
                return number[i];
            } else {
                return -1;
            }
        }
        return 0;
    }

    public static void Table(int n1, char op, int n2) {
        // int[][] nTable = new int[0][0];
        ArrayList<model> tables = new ArrayList<>();
        switch (op) {
            case '+': {
                for (int t1 = 0; t1 < n1; t1++) {
                    for (int t2 = 0; t2 < n2; t2++) {
//                      nTable[t1][t2]=t1+t2;
                        tables.add(new model(t1, t2));
                    }
                }
                for (int i = 0; i < tables.size(); i++) {
                    System.out.println("( " + tables.get(i).n1 + " + " + tables.get(i).n2 + " ) =  " + "( " + (tables.get(i).n1 + tables.get(i).n2) + " )");
                }
            }

            case '*': {
                for (int t1 = 0; t1 < n1; t1++) {
                    for (int t2 = 0; t2 < n2; t2++) {
//                      nTable[t1][t2]=t1+t2;
                        tables.add(new model(t1, t2));
                    }
                }
                for (int i = 0; i < tables.size(); i++) {
                    System.out.println("( " + tables.get(i).n1 + " + " + tables.get(i).n2 + " ) =  " + "( " + (tables.get(i).n1 * tables.get(i).n2) + " )");
                }
            }


            case '-': {
                for (int t1 = 0; t1 < n1; t1++) {
                    for (int t2 = 0; t2 < n2; t2++) {
//                      nTable[t1][t2]=t1+t2;
                        tables.add(new model(t1, t2));
                    }
                }
                for (int i = 0; i < tables.size(); i++) {
                    System.out.println("( " + tables.get(i).n1 + " + " + tables.get(i).n2 + " ) =  " + "( " + (tables.get(i).n1 - tables.get(i).n2) + " )");
                }
            }


            case '/': {
                for (int t1 = 0; t1 < n1; t1++) {
                    for (int t2 = 0; t2 < n2; t2++) {
//                      nTable[t1][t2]=t1+t2;
                        tables.add(new model(t1, t2));
                    }
                }
                for (int i = 0; i < tables.size(); i++) {
                    System.out.println("( " + tables.get(i).n1 + " + " + tables.get(i).n2 + " ) =  " + "( " + (tables.get(i).n1 / tables.get(i).n2) + " )");
                }
            }


            case '%': {
                for (int t1 = 0; t1 < n1; t1++) {
                    for (int t2 = 0; t2 < n2; t2++) {
//                      nTable[t1][t2]=t1+t2;
                        tables.add(new model(t1, t2));
                    }
                }
                for (int i = 0; i < tables.size(); i++) {
                    System.out.println("( " + tables.get(i).n1 + " + " + tables.get(i).n2 + " ) =  " + "( " + (tables.get(i).n1 % tables.get(i).n2) + " )");
                }
            }
        }
    }

}