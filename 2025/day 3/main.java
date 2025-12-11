import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("./input.txt"));
        int totalCount =0;
        String line;
        
        while ((line = br.readLine()) != null) {   
              
            int[] digits = new int[line.length()];
            for (int i = 0; i < line.length(); i++) {
                digits[i] = line.charAt(i) - '0';
            }
          
            int max = 0;
            for (int i = 0; i < digits.length; i++) {
                for (int j = i + 1; j < digits.length; j++) {
                    int num = digits[i] * 10 + digits[j];
                    if (num > max) max = num;
                }
            }

            totalCount += max;
            
        }
        System.out.println(totalCount);
        br.close();
    

    }  
}
