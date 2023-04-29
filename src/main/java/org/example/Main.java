package org.example;
import chapters.ch1.Binary_Search;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 15, 44, 65, 77, 80, 99, 101};
        int find_me = 15;

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();

        int value_is = Binary_Search.bin_search(arr, find_me);
        System.out.println(value_is);
    }
}