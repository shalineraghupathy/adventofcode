import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    // static boolean isDouble(String s){
    //     int l = s.length();
    //     if(l%2 != 0) return false;
    //     String right = s.substring(0,l/2);
    //     String left = s.substring(l/2);
    //     return right.equals(left);
    // }

    static boolean isInvalid(String s) {
    int L = s.length();
    for (int k = 1; k <= L/2; k++) { 
        if (L % k != 0) continue;
        String segment = s.substring(0, k);
        boolean valid = true;
        for (int i = k; i < L; i += k) {
            if (!s.substring(i, i + k).equals(segment)) {
                valid = false;
                break;
            }
        }
        if (valid) return true; 
    }
    return false;
}


    public static void main(String[] args) throws IOException {

        String input = new BufferedReader(new FileReader("./input.txt")).readLine();
        String[] ranges = input.split(",");
        long count = 0;
        for(String range : ranges){
            range.trim();
            String[] bounds = range.split("-");
            long lower = Long.parseLong(bounds[0]);
            long upper = Long.parseLong(bounds[1]);

            for(long i=lower;i<=upper;i++){
                // if(isDouble(Long.toString(i))){
                //     count+=i;
                // }

                if(isInvalid(Long.toString(i))){
                    count+=i;
                }
            }
        }
        System.out.println("total count " +count);
    }
    
}
