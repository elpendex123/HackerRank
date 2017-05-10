package com.coello.enrique;

import java.util.Scanner;

public class FindTheBug {

    static int[] findTheBug(String[] grid){
    	int [] array = new int[2];
    	int row = 0;
    	int column = 0; 
    	
    	for (row = 0; row < grid.length; row++)
    	{
    		if (grid[row].contains("X"))
    		{
    			column = grid[row].lastIndexOf("X");
    			break;
    		}
    	}

    	array[0] = row;
    	array[1] = column;
    	
    	return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }

        int[] result = findTheBug(grid);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "," : ""));
        }
        
        in.close();
    }
}
