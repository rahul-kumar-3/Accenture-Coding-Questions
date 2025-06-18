/*05_EnchantedGardenPoints*/

/*5. In an enchanted garden, flowers bloom in various colors, and each color has a specific point value. Your task is to calculate the total points based on the flowers picked by a gardener.
 

Input Format
A list of integers representing the points for each flower.

Output Format
An integer representing the total points earned from the flowers.


Example
Input: [5, 3, 8, 2]
Output: 18


 */

public class Enchanted_Garden_Points {
    public static int getTotalPoint(int[] points){
        int totalPoints = 0;
        for(int point : points){
            totalPoints += point;
        }
        return totalPoints;
    }
    public static void main(String[] args){
        int[] points = {5, 3, 8, 2};
        System.out.println("Total points : "+getTotalPoint(points));
    }
}
