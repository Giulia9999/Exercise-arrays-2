package it.develhope.arrays;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] aliceToDos = new String[]{"Coding", "Reading", "Learning"};
        String[] bobToDos = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        String[] timToDos = new String[]{"Reading", "Learning", "Coding"};

        arrayEquals(aliceToDos, bobToDos, timToDos);
        System.out.println("---------------------------------------------------");
        arrayLength(aliceToDos, bobToDos, timToDos);
        System.out.println("---------------------------------------------------");
        sortComparison(aliceToDos,bobToDos,timToDos);
        System.out.println("---------------------------------------------------");
    }

    public static void arrayEquals(String[] aliceToDos,String[] bobToDos, String[] timToDos){
        System.out.printf("Is Alice's array equal to Bob array? %s %n", Arrays.equals(aliceToDos, bobToDos));
        System.out.printf("Is Alice's array equal to Tim array? %s %n", Arrays.equals(aliceToDos, timToDos));
    }

    public static void arrayLength(String[] aliceToDos,String[] bobToDos, String[] timToDos){
        System.out.printf("Is Alice's array having the same length of Bob's array? %s %n", (aliceToDos.length == bobToDos.length));
        System.out.printf("Is Alice's array having the same length of Tim's array? %s %n", (aliceToDos.length == timToDos.length));
    }

    public static void sortComparison(String[] aliceToDos,String[] bobToDos, String[] timToDos){
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);

        System.out.printf("Is Alice having the same tasks of Bob? %s %n", Arrays.equals(aliceToDos, bobToDos));
        System.out.printf("Is Alice having the same tasks of Tim? %s %n", Arrays.equals(aliceToDos, timToDos));

    }

}
