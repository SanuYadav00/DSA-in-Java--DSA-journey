
  /* You are given n activities with their start and end times. Select the maximum number of
 activities that can be performed by a single person, assuming
 that a person can only work on a single activity at a time.
Activities are not sorted.
 input: start=[10,12,20]
        end=[20,30,25]
  Output=2(A0 & A2)      
 */
// Time Complexity O(nlogn)
// Space Complexity
import java.util.*;
public class activity_selection_unsorted_data {
      public static int maximum(int stime[],int etime[]) {
         // end time basis sorted
            int max=0;
         ArrayList<Integer> ans=new ArrayList<>();
         int activities[][]=new int[stime.length][3];
         for (int i=0;i<stime.length;i++) {
            activities[i][0]=i;
            activities[i][1]=stime[i];
            activities[i][2]=etime[i];
         }
         Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

         // 1st activity sorted
         max=1;
         ans.add(activities[0][0]);
         int lastEnd=activities[0][2];
         for (int i=1;i<etime.length;i++) {
            if (activities[i][1]>=lastEnd) {
                  // activity select
                  ans.add(activities[i][0]);
                  max++;
                  lastEnd=activities[i][2];
            }
         }
         System.out.print("The activities that can be performed are:");
         for (int i=0;i<ans.size();i++) {
            System.out.print(" A"+ans.get(i)+",");
         }
         System.out.println();
         return max;

      }
      public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the total no. of activities:");
            int n=sc.nextInt();
            int start_time[]=new int[n];
            int end_time[]=new int[n];
            System.out.print("Enter the start time of all the activities:");
            for (int i=0;i<n;i++) {
                  start_time[i]=sc.nextInt();
            }
            System.out.print("Enter the end time of all the activities:");
            for (int i=0;i<n;i++) {
                  end_time[i]=sc.nextInt();
            }
            System.out.println("The maximum number of activities that can be performed is:"+maximum(start_time,end_time));
            sc.close();

      }
}
  

