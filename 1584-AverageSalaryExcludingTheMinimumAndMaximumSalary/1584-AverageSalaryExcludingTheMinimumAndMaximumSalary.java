// Last updated: 3/8/2026, 8:50:03 PM
class Solution {
    public double average(int[] salary) {
        int max=salary[0];
        int min=salary[0];
        int sum=0;
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
            if(salary[i]>max)max=salary[i];
            if(salary[i]<min)min=salary[i];
        }
        sum=sum-max-min;
        double avg=(double) sum/(salary.length-2);
        return avg;

        
    }
}