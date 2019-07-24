import java.util.Scanner;

public class Lukman {
     public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        s.nextLine();
        for(int i=0;i<T;i++) {
            String[] str = s.nextLine().split(" ");
            System.out.println((Integer.parseInt(str[2])+Integer.parseInt(str[3]))-(Integer.parseInt(str[0])+Integer.parseInt(str[1])));
        }        
    }
}