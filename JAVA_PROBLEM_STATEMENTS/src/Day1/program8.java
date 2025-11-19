// Co-Partners in Train 
// Tim and Bob are off to a famous Education Fair "Knowledge Forum 2017" at Uzhlanda. This 
// time they have to travel without their guardians. Tim got very interested in the arrangement of 
// seats inside the train coach. 
// The entire coach could be viewed as an arrangement of consecutive blocks of size 8. 
// BerthNumber Compartment 
// 1-8 1 
// 9-16 2 
// 17-24 3 
// ... and so on 
// Each of these size-8 blocks are further arranged as: 
// 1LB, 2MB, 3UB, 4LB, 5MB, 6UB, 7SL, 8SU 
// 9LB, 10MB, ... 
// Here LB denotes lower berth, MB middle berth and UB upper berth. 
// The following berths are called Co-Partners in Train: 
// 3 UB 6 UB 
// 2 MB 5 MB 
// 1 LB 4 LB 
// 7 SL 8 SU 
// Given a berth number, you are to determine the berth number of its Co-Partner in Train.
import java.io.*;
public class program8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        // partner position inside block of 8 (index 1..8)
        int[] partnerPos = {0,4,5,6,1,2,3,8,7};
        String[] berth = {"", "LB", "MB", "UB", "LB", "MB", "UB", "SL", "SU"};
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int pos = ((n - 1) % 8) + 1;              // position in block 1..8
            int ppos = partnerPos[pos];              // partner position in block
            int partnerSeat = n + (ppos - pos);      // compute absolute partner seat number
            out.append(partnerSeat).append(" ").append(berth[ppos]).append("\n");
        }
        System.out.print(out.toString());
    }
}

