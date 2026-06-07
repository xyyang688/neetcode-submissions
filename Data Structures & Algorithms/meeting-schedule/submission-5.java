/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a,b)->a.start-b.start);

        if (intervals.size()==0){
            return true;
        }
        int e = intervals.get(0).end;

        for (int i = 1; i<intervals.size(); i++){
            if (intervals.get(i).start<e){
                return false;
            }
            else{
                e = Math.max(e, intervals.get(i).end);
            }
        }

        return true;
    }
}
