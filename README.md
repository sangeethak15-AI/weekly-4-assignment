# weekly-4-assignment
### 1.Write a Java program to join two array lists.  
```

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
```
###  2.Write a Java program to retrieve but does not remove, the first element of a linked list.
```
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
```
###  3.Write a Java program to check if a particular element exists in a linked list. 
```
import java.util.Scanner;
import java.util.LinkedList;
public class main_3 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Linkedlist: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l1 .add(i,sc.nextInt());
        }
        System.out.println("Enter the element to check: ");
        int check=sc.nextInt();
        System.out.println(l1.contains(check));
    }
}
```
###  4.Write a Java program to remove all of the elements from a hash set. 
```
import java.util.HashSet;
import java.util.Scanner;

public class main_4 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Hashlist: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            hs.add(sc.nextInt());
        }
        System.out.println("Before removing all elements: "+hs);
        hs.clear();
        System.out.println("After removing all elements: "+hs);
    }
}
```
### 5.Write a Java program to compare two hash set. 
```
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
```
### 6.Write a Java program to retrieve and remove the last element of a tree set. 
```
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
```
### 7.Write a Java program to convert a Priority Queue elements to a string representation. 
```
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
```
###  8.Write a Java program to get a collection view of the values contained in this map.
```
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
```
### 9.Write a Java program to get a set view of the keys contained in this map. 
```
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class main_9 {

    public static void main(String[] args) {
        Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            mp.put(sc.nextInt(),sc.nextInt());
        }
        Set<Integer> set=mp.keySet();
        System.out.println("Set view of keys: "+set);
    }
}
```
### 10.Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key. 

```
import java.util.*;
public class main_10 {
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
        String [] str_values=new String[n];
        str_values=map.values().toArray(new String[0]);
        for(j=check;j<=n;j++) {
            int k=j;
            if (set_keys.contains(check)) {
                System.out.println("Key: " + j + " Value: " + str_values[k-1]);
            }
            else {
                System.out.println("No key found!!");
                break;
            }
        }
    }
}
```
### 11. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
```
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
```






