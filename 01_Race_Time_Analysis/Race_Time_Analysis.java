/*Race Time Analysis */
/*1. In a race, each participant's finish time is recorded. You need to find out who finished first and how long it took them. Additionally, you need to find the average finish time of all participants.
 
Input Format
A list of floating-point numbers representing finish times.

Output Format
Two floating-point numbers: the first-place time and the average time.

Example
Input: [12.5, 10.0, 11.2, 13.3]
Output: (10.0, 11.5)
 */


public class Race_Time_Analysis{

    public static double[] raceResult(double[] time){
        if(time.length == 0) return new double[]{-1.0, 0.0};
        double firstWinner = time[0];
        double totalTime = 0;
        for(int i = 0; i < time.length; i++){
            totalTime += time[i];
            if(time[i] < firstWinner){
                firstWinner = time[i];
            }
        } 
        return new double[]{firstWinner, totalTime/time.length};

    }
    public static void main(String[] args){
        double [] time = {12.5, 10.0, 11.2, 13.3};
        double [] result = raceResult(time);
        System.out.println("first winner time: "+ String.format("%.1f", result[0])+" total avg time: "+String.format("%.1f", result[1]));
    }
}