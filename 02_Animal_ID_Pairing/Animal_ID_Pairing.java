/*AnimalIDPairing*/
/*2. In a magical forest, each animal has a unique identifier (ID). Some animals have decided to form pairs based on their IDs. Your task is to find all the unique pairs of animal IDs that can be formed.
 
Input Format
A list of integers representing animal IDs.

Output Format
A list of unique pairs of animal IDs.

Input: [1, 2, 3]
Output: [(1, 2), (1, 3), (2, 3)]
 */

import java.util.ArrayList;
import java.util.List;

public class Animal_ID_Pairing {
    public static List<int []> uniquePair(int [] id){
        List<int []> pairs = new ArrayList<>();
        for(int i = 0; i < id.length; i++){
            for(int j = i+1; j < id.length; j++){
                pairs.add(new int[] {id[i], id[j]});
            }
        }
        return pairs;
    }
    public static void main(String[] args){
        int [] id = {1, 2, 3};
        List<int []> result = uniquePair(id);
       for(int [] pair : result){
        System.out.println("Pairs: ("+pair[0]+" ,"+pair[1]+ ")");
       }
    }
}
