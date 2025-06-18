/*03_TreasureChestMaxSum */
/*3. In a small village, there are treasure chests scattered around. Each chest has a certain number of coins, and some chests have been cursed, causing them to give negative coins. Your task is to find the maximum sum of coins you can collect from a consecutive series of chests.
 

Input Format
A list of integers representing the coins in each chest.

Output Format
An integer representing the maximum sum of coins from consecutive chests.

Example
Input: [2, -3, 4, -1, 2, 1, -5, 4]
Output: 6
 */

public class Treasure_Chest_Max_Sum {
    public static int findMaxSum(int [] chestID){
        int maxSum = 0;
        int currentSum = 0;
        for(int coins : chestID){
            currentSum += coins;
            if(currentSum < 0) currentSum = 0;
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] chestID = {2, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Sum : "+findMaxSum(chestID));
    }
}
