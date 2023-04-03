//10.Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
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