//6.Write a Java program to retrieve and remove the last element of a tree set.

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.TreeSet;
public class main_6 {

    public static void main(String[] args) {
        TreeSet<Integer> Ts=new TreeSet<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Ts.add(sc.nextInt());
        }
        System.out.println("Before removing last element: ");
        System.out.println(Ts);
        System.out.println("After removing last element: ");
        int last=Ts.pollLast();
        Ts.remove(last);
        System.out.println(Ts);
    }
}