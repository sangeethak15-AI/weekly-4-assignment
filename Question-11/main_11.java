//11. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.

import java.util.*;
public class main_11 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer, String>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            map.put(sc.nextInt(),sc.next());
        }
        System.out.println("Enter the key to check: ");
        int check=sc.nextInt();
        int j=check;
        Set<Integer> set_keys=new HashSet<Integer>();
        set_keys= map.keySet();
        Object[] arr=set_keys.toArray();
        if(set_keys.contains(check)){
            for(int i=0;i<check;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("Null");
        }
    }
}