import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> list = new ArrayList<>();
       for(int i =0; i<s.length()-2; i++) { 
       String temp = s.substring(i, 3+i);
       list.add(temp);
       }
       Collections.sort(list);
        System.out.println("List is "+list);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(s+" "+k);
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}