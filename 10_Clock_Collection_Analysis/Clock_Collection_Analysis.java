/*10_ClockCollectionAnalysis */
/*10. A timekeeper has a collection of clocks, each representing a specific hour. Your task is to calculate the total hours represented by the clocks and find the clock showing the highest hour.

Input Format
A list of integers representing the hours of the clocks.

Output Format
Two integers: the total hours and the highest hour.


Example
Input: [3, 7, 5, 9]
Output: (24, 9)

 */




public class Clock_Collection_Analysis {
    public static int[] getResult(int[] hours){
        int totalHours = 0;
        int highestHour = Integer.MIN_VALUE;
        for(int i = 0; i < hours.length; i++){
            totalHours += hours[i];             // Calculating total sum of hours
            if(hours[i] > highestHour){
                highestHour = hours[i];      // Identifying Max. Hours of clock
            }
        }
        return new int[] {totalHours, highestHour};
    }
    public static void main(String[] args) {
        int[] hours = {3, 7, 5, 9};

        int[] result = getResult(hours);
        System.out.println("("+result[0]+" ,"+result[1]+")");
    }
}
