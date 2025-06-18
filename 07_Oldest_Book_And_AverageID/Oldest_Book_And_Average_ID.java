/*07_OldestBookAndAverageID */

/*7. In a mysterious library, each book has a unique ID, and some books are quite old. Your task is to find the ID of the oldest book and the average ID of all the books.

Input Format
A list of integers representing book IDs.

Output Format
Two integers: the ID of the oldest book and the average ID (rounded down).

Example
Input: [1001, 1002, 999, 1003]
Output: (999, 1001)


 */



public class Oldest_Book_And_Average_ID {

    public static int[] getOldAndAvgOfId(int[] bookId){
        int oldBookId = Integer.MAX_VALUE;
        int idAvg = 0;
        for(int id : bookId){
            idAvg += id;
            if(id < oldBookId){
                oldBookId = id;
            }
        }
        
        return new int[]{oldBookId, idAvg/bookId.length};
    }
    public static void main(String[] args){
        int [] bookId = {1001, 1002, 999, 1003};

        int[] result = getOldAndAvgOfId(bookId);
        System.out.println("("+result[0]+","+result[1]+")");
    }
}
