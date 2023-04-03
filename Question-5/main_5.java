//5.Write a Java program to compare two hash set.
import java.util.HashSet;
import java.util.Scanner;

public class main_5 {
    public static void main(String[] args) {
        HashSet<Integer> hs1=new HashSet<Integer>();
        HashSet<Integer> hs2=new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Hashlist: ");
        int n=sc.nextInt();
        System.out.println("Enter elements for hashset-1: ");
        for(int i=0;i<n;i++){
            hs1.add(sc.nextInt());
        }
        System.out.println("Enter elements for hashset-2: ");
        for(int i=0;i<n;i++){
            hs2.add(sc.nextInt());
        }
        for(int element: hs2){
            System.out.println(hs1.contains(element) ? "Yes" : "No");
        }
    }
}
