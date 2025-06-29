/*11_AbsoluteDifferenceCount */
/*You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

Example:
Input:

arr: {12, 3, 14, 56, 77, 13}
num: 13
diff: 2
Output:
3

Explanation:
Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.
 */


public class Absolute_Difference_Count {

    public static int checkAbsoluteDiff(int[] arr, int num, int diff){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(Math.abs(num - arr[i]) <= diff){
                count++;
            }
        }
        int result = count > 0 ? count : -1;

        return result;
    }
    public static void main(String[] args){
        int[] arr = {12,3,14,56,77,13};
        int num = 13;
        int diff = 2;
        System.out.println(checkAbsoluteDiff(arr, num, diff));
    }
}
