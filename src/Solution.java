
import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int len=nums1.length;
        int[][]total=new int[len][2];
        for (int i=0;i<len;i++)
        {
            total[i][0]=nums2[i];
            total[i][1]=nums1[i];
        }
        Arrays.sort(total,(a,b)->b[0]-a[0]);
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        long totalsum=0;
        for (int i=0;i<k;i++)
        {
            heap.add(total[i][1]);
            totalsum+=total[i][1];
        }
        long maxvalue=totalsum*(total[k-1][0]);
        for (int i=k;i<len;i++)
        {
           totalsum+=total[i][1] -heap.poll();
           heap.add(total[i][1]);
           maxvalue=Math.max(maxvalue,totalsum*total[i][0]);
        }
        return maxvalue;


    }
}
