/*Time_Traveler_Artifact_Range */

/*6. A time traveler collects artifacts from different years. Each artifact has a year associated with it. Your task is to find the range of years from the earliest to the latest artifact collected.
 
Input Format
A list of integers representing the years.

Output Format
An integer representing the range of years (latest year - earliest year).

Input: [1995, 2001, 1985, 2010]
Output: 25

 */

import java.util.Arrays;

public class Time_Traveler_Artifact_Range {

    public static int getRangeOfYear(int[] year){
        Arrays.sort(year);

        return year[year.length-1]-year[0];
    }
    public static void main(String[] args){
        int [] year = {1995, 2001, 1985, 2010};

        System.out.println("Result : "+getRangeOfYear(year));
    }
}
