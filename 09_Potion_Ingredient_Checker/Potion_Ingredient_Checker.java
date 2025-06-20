/*09_PotionIngredientChecker */
/*9. A wizard brews a secret potion using various magical ingredients, each represented by a unique integer ID. Your task is to identify if a specific ingredient ID is used in the potion.

Input Format
A list of integers representing the ingredient IDs and an integer representing the ID to check.

Output Format
A string indicating whether the ingredient ID is used ("Yes" or "No").


Example

Input: [101, 102, 103, 104], 102
Output: Yes


 */


public class Potion_Ingredient_Checker {
    public static boolean getResult(int[] gradientID, int idToCheck){
        for(int i = 0; i< gradientID.length; i++){
            if(gradientID[i] == idToCheck){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] gradientID = {101, 102, 103, 104};
        int idToCheck = 102;
        String ans = getResult(gradientID, idToCheck) == true ? "Yes":"No";

        System.out.println(ans);
    }
}
