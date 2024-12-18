/* Given an array of jobs where every job has a deadline and profit if the job is finished 
 before the deadline. It is also given that every job takes a single unit of time, so the 
 minimum possible deadline for any job is 1.Maximize the total profit if only one job can be 
 scheduled at a time.
 Input:Job A=4,20
       Job B=1,10
       Job C=1,40
       JOb D=1,30
 Output: ans=C,A      
*/
import java.util.*;
public class job_sequencing_problem {
  static class Job {
    int deadline;
    int profit;
    int id; // 0(A), 1(B), 2(C)

    public Job (int i,int d, int p) {
      id=i;
      deadline=d;
      profit=p;
    }
  }
 
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of jobs:");
    int n=sc.nextInt();
    int jobs[][]=new int[n][2];
    System.out.print("Enter the deadline and profit of each job respectively:");
    for (int i=0;i<n;i++) {
      jobs[i][0]=sc.nextInt();
      jobs[i][1]=sc.nextInt();
    }
    ArrayList<Job> jo=new ArrayList<>();
    for (int i=0;i<n;i++) {
      jo.add(new Job(i,jobs[i][0],jobs[i][1]));
    }
    Collections.sort(jo,(obj1, obj2)->obj2.profit-obj1.profit);
    ArrayList<Integer> seq=new ArrayList<>();
    int time=0;
    for (int i=0;i<jo.size();i++) {
      Job curr=jo.get(i);
      if (curr.deadline > time) {
        seq.add(curr.id);
        time++;
      }
    }
    System.out.println("max jobs="+seq.size());
    for (int i=0;i<seq.size();i++) {
       System.out.print(seq.get(i)+" ");
    }
    System.out.println();
    sc.close();
  }
  
}
