//1.Write a Java program to join two array lists.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr1.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            arr2.add(sc.nextInt());
        }
        System.out.println("Before adding: ");
        System.out.println("Array1: ");
        System.out.println(arr1);
        System.out.println("Array2: ");
        System.out.println(arr2);
        arr1.addAll(arr2);
        System.out.println("After adding: ");
        System.out.println(arr1);
    }
}