import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c=0;
        StringBuilder[] b = new StringBuilder[a];
        for(int i=0;i<a;i++){
            b[i]= new StringBuilder(s.next());
        }
        for(int i=1;i<a-1;i++){
            for(int j=1;j<a-1;j++){
                if((Character.getNumericValue(b[i].charAt(j))>Character.getNumericValue(b[i-1].charAt(j))) && (Character.getNumericValue(b[i].charAt(j))>Character.getNumericValue(b[i].charAt(j-1))) && (Character.getNumericValue(b[i].charAt(j))>Character.getNumericValue(b[i+1].charAt(j))) && (Character.getNumericValue(b[i].charAt(j))>Character.getNumericValue(b[i].charAt(j+1)))) {
                    b[i].setCharAt(j, 'X');
                }
            }
        }
        for(int i=0;i<a;i++){
            System.out.println(b[i]);
        }

    }
}
