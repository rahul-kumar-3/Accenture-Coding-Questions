/*04_IngredientWeightAnalysis */
/*4. The royal baker needs to prepare a special cake. Each ingredient has a specific weight. The baker wants to know the total weight of the ingredients and the heaviest ingredient used.
 
Input Format
A list of floating-point numbers representing the weights of the ingredients.

Output Format
Two floating-point numbers: the total weight and the heaviest ingredient.

Example
Input: [1.2, 0.5, 2.3, 1.8]
Output: (5.8, 2.3)
 */

//import java.util.ArrayList;

public class Ingredient_Weight_Analysis {

    public static double [] result(double [] weight){
        double maxWeight = 0.0;
        double totalWieght = 0.0;
       // ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < weight.length; i++){
            totalWieght += weight[i];
            if(weight[i] > maxWeight){
                maxWeight = weight[i];
            }
        }
        return new double[]{totalWieght, maxWeight};
    }
    public static void main(String[] args){
        double [] weight = {1.2, 0.5, 2.3, 1.8};
        double [] ans = result(weight);
        System.out.println("Total Weight : "+ans[0]+ " ,Max Weight : "+ans[1]);
    }
}
