import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {
        System.out.println("Working dir: " + System.getProperty("user.dir"));

        BufferedReader br = new BufferedReader(new FileReader("./input.txt"));

        int start = 50;   
        int count = 0;   

        String line;
        while ((line = br.readLine()) != null) {
            char dir = line.charAt(0);                
            int value = Integer.parseInt(line.substring(1));

            if (dir == 'L') {
                start = (start - value) % 100;
            } else {
                start = (start + value) % 100;
            }

            if (start < 0) start += 100; //negative wrap

            if (start == 0) count++;
        }

        br.close();
        System.out.println(count);
    }
}
