/*08_DragonTreasureAnalysis */
/*8. A dragon hoards treasures in different forms, each with a specific value. Your task is to calculate the total value of the treasures and find the highest value among them. 

Input Format
A list of integers representing the values of the treasures.

Output Format
Two integers: the total value and the highest value.


Example
Input: [200, 500, 1000, 300]
Output: (2000, 1000)


*/


public class Dragon_Treasure_Analysis {
    public static int[] getResult(int[] treasures){
        int totalValue = 0;
        int highestValue = Integer.MIN_VALUE;
        for(int i = 0; i < treasures.length; i++){
            totalValue += treasures[i];
            if(treasures[i]> highestValue){
                highestValue = treasures[i];
            }
        }
        return new int[] {totalValue, highestValue};
    }
    public static void main(String[] args){
        int[] treasures = {200, 500, 1000, 300};
        int[] result = getResult(treasures);
       System.out.println("Total Amount of Treasure : "+result[0]+ "\n Highest value of treasure : "+result[1]);
    }
}
