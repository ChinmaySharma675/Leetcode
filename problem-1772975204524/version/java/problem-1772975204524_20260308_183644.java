// Last updated: 3/8/2026, 6:36:44 PM
1class Solution {
2    public double average(int[] salary) {
3        int max=salary[0];
4        int min=salary[0];
5        int sum=0;
6        for(int i=0;i<salary.length;i++){
7            sum+=salary[i];
8            if(salary[i]>max)max=salary[i];
9            if(salary[i]<min)min=salary[i];
10        }
11        sum=sum-max-min;
12        double avg=(double) sum/(salary.length-2);
13        return avg;
14
15        
16    }
17}