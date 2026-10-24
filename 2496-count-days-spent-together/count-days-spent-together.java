class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] daysInMonth = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};   
        int[] daysSpent = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        int arrivalAliceDay = Integer.parseInt(arriveAlice.substring(3)); 
        int arrivalAliceMonth = Integer.parseInt(arriveAlice.substring(0,2)); 
        int leaveAliceDay = Integer.parseInt(leaveAlice.substring(3)); 
        int leaveAliceMonth = Integer.parseInt(leaveAlice.substring(0,2)); 

        
        int arrivalBobDay = Integer.parseInt(arriveBob.substring(3)); 
        int arrivalBobMonth = Integer.parseInt(arriveBob.substring(0,2)); 
        int leaveBobDay = Integer.parseInt(leaveBob.substring(3)); 
        int leaveBobMonth = Integer.parseInt(leaveBob.substring(0,2)); 
        
        int aliceStart = daysSpent[arrivalAliceMonth-1] + arrivalAliceDay;
        int aliceEnd = daysSpent[leaveAliceMonth-1] + leaveAliceDay;

        int bobStart = daysSpent[arrivalBobMonth-1] + arrivalBobDay;
        int bobEnd = daysSpent[leaveBobMonth-1] + leaveBobDay;

        System.out.printf("%d %d\n", aliceStart, aliceEnd);
        System.out.printf("%d %d", bobStart, bobEnd);
        
        int res=0;
        for(int i=1;i<=365;i++){
            if((i >= aliceStart && i<= aliceEnd) && (i >= bobStart && i <= bobEnd)){
                res += 1;
            }
        }

        return res;
    }
}