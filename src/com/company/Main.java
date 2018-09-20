package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {


    public static void main(String[] args) {

        Scanner kbInput1 = new Scanner(System.in);
        Scanner kbInput2 = new Scanner(System.in);

        String firstWord, secondWord;

        System.out.println("Welcome to the Anagram Checker!");

        System.out.println("Enter your first word: ");

        firstWord = kbInput1.nextLine();

        System.out.println("Enter your second word: ");
        secondWord = kbInput2.nextLine();

        char[] firstArray = firstWord.toLowerCase().toCharArray();
        char[] secondArray = secondWord.toLowerCase().toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        int count = 0;
        for (int i = 0; i < firstArray.length; i++)
        {
            if (firstArray[i] == secondArray[i])
                count++;
        }
        if (count == secondArray.length){
            System.out.println(firstWord + " " + secondWord + " are anagrams!");
        }
        else {
            System.out.println(firstWord + " " + secondWord + " are not anagrams!");
        }
    }


    }








