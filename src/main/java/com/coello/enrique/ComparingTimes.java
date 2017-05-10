package com.coello.enrique;

import java.util.Scanner;

public class ComparingTimes 
{
    static String timeCompare(String t1, String t2)
    {
        // Complete this function
    	return null;
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        
        for (int a0 = 0; a0 < q; a0++)
        {
            String t1 = in.next();
            String t2 = in.next();
            String result = timeCompare(t1, t2);
            System.out.println(result);
        }
        
        in.close();
    }
}
