import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("./input.txt"));

        int start = 50;   
        int count = 0;   

        String line;
        while ((line = br.readLine()) != null) {
            char dir = line.charAt(0);                
            int value = Integer.parseInt(line.substring(1));
            int step = (dir == 'L') ? -1 : 1;

            for(int i=0;i<value;i++){
                start = (start+step)%100;

                if(start<0)start+=100;
                if(start == 0) count++;
            }

         
        }

        br.close();
        System.out.println(count);
    }
}
