//8.Write a Java program to get a collection view of the values contained in this map.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main_8 {
    public static void main(String[] args) {
        Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            mp.put(sc.nextInt(),sc.nextInt());
        }
        System.out.println("Collection view of values: "+mp.values());

    }
}
