//2.Write a Java program to retrieve but does not remove, the first element of a linked list

import java.util.Scanner;
import java.util.LinkedList;
public class main_2 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Linkedlist: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l1 .add(i,sc.nextInt());
        }
        System.out.println("First element is: "+l1.peek());
    }
}
