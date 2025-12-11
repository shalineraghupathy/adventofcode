import java.io.*;

public class main {

    static boolean isDouble(String s){
        int l = s.length();
        if(l%2 != 0) return false;
        String right = s.substring(0,l/2);
        String left = s.substring(l/2);
        return right.equals(left);
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
                if(isDouble(Long.toString(i))){
                    count+=i;
                }
            }
        }
        System.out.println("total count " +count);
    }
    
}
