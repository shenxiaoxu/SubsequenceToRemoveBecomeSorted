/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author XiaoxuShen
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Given an array find the subsequence that needs to be removed so that the array becomes sorted. 
        //There can be many resultant sorted arrays. Need to find longest. Expected time complexity O(n). 
        //e.g. 9 9 6 1 3 4 4 5 1 7 => 1 3 4 4 5 7 so need to remove 9 9 6 1
        /* first method 
         * you can use dynamic programming length[i] represents from 1 to i, longest increasing subsequence.
         * length[n] = max{length[i] + 1, if s[i] < s[n]} 1<= i <= n }
         * second method
         * 
        */
        int[] array = {1,2,2,2,2,2,2};
        System.out.println(lis(array));
        
    }
    public static int lis(int[] array){
        int[] length = new int[array.length];
        int max = 0;
        for(int k = 0; k < array.length; k++){
            length[k] = 1;
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < i; j++){
                if(array[j] <= array[i]){
                    length[i] = Math.max(length[i], length[j] + 1);
                }
            }
        }
        for(int g = 0; g < array.length; g++){
            if(length[g] >= max){
                max = length[g];
            }           
        } 
        return max;
    }
}
