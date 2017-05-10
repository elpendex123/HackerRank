package com.coello.enrique;

import java.util.Scanner;

public class FindTheBug {

    static int[] findTheBug(String[] grid){
        // Complete this function
    	int [] array = new int[2];
    	array[0] = 0;
    	array[1] = 0;
    	return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n=3;
        String[] grid = new String[n];
        
//        for(int grid_i=0; grid_i < n; grid_i++){
//            grid[grid_i] = in.next();
//        }
        
        grid[0] = "OOO";
        grid[1] = "O1O";
        grid[2] = "OOO";
        
        // Return an array containing [r, c]
        int[] result = findTheBug(grid);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "," : ""));
        }
        
        System.out.println("");
        in.close();
    }
}
