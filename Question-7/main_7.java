//7.Write a Java program to convert a Priority Queue elements to a string representation.

import java.util.PriorityQueue;
import java.util.Scanner;

public class main_7 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the queue: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
        }
        System.out.println("Before conversion: ");
        System.out.println(pq);
        String str;
        str=pq.toString();
        System.out.println("String representation of Priority Queue: ");
        System.out.println(str);
    }
}
