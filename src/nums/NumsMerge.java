/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
import java.util.*;
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        intervals.sort((a, b) -> (a.start - b.start));//按照区间的左端点排序
        ArrayList<Interval> res = new ArrayList<Interval>();
        int i = 0,n = intervals.size();
        int l,r;
        while(i < n){
             l = intervals.get(i).start;//用来存储当前区间的左端
             r = intervals.get(i).end;//用来存储当前区间的右端
              //合并区间
             while(i < n-1 && r >= intervals.get(i + 1).start){
                 i ++;
                 r = Math.max(r,intervals.get(i).end);
             }
             //将当前合并完的区间进行插入
             res.add(new Interval(l, r));
             i ++;
         }
         return res;

    }
}