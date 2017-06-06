/**
 * Date 06/06 
 * @author venkat
 * 
 * Given an array of non negative integers where each element represents the max 
 * number of steps that can be made forward from that element. Write a function to 
 * return the minimum number of jumps to reach the end of the array from first element
 * 
 * Solution 
 * Have 2 for loop. j trails i. If arr[j] + j >= i then you calculate new jump
 * and result.
 * 
 * Space complexity O(n) to maintain result and min jumps
 * Time complexity O(n^2)
 * 
 * Reference
 * http://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-given-array/
 */


public Class JumpArray {
  public int minJump(int arr[],int a[]){
    int []jump = new int[arr.lenth];
    jump[0] = 0;
    
    for (int i = 1; i < jump.length;i++){
      jump[i] = Integer.MAX_VALUE - 1;
    }
    
    for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < i ; j++) {
        if (arr[j] +j > i) {
          jump[i] = jump[j] + 1;
          //result[i] = j; we need this if we are also interested in the sequence of indices where the jump happened!
        }
      }
    }
    return jump[jump.length - 1]
  }
}
