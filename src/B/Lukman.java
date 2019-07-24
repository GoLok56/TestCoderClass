import java.util.HashMap;
import java.util.Scanner;

public class Lukman {
     public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        HashMap<Long, String> maps = new HashMap();
        maps.put(2L, "1");
        maps.put(8L, "7");
        maps.put(10L, "9");
        maps.put(16L, "15");

        for(int i=0;i<T;i++) {
            String[] input_str = input.nextLine().split(" ");
            int B = Long.parseLong(input_str[1]), 
                    N = Long.parseLong(input_str[0], B),
                    D = Long.parseLong(input_str[2]);
            
            String x = "";
            for (int j=0;j<(N/2);j++) {
                x += maps.get(B);
            }
            
            int x_int = Long.parseLong(x);
            String result = String.valueOf(x_int*x_int);
            result = D>N ? result : result.substring(result.length()-D);
            System.out.println(result);
        }        
    }
}