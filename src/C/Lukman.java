import java.util.Scanner;

public class Lukman {
     public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[] inputs = new String[9];

        for (int j=0;j<9;j++) {
            inputs[j] = input.nextLine();
        }
        String result = "";
        for(int x=1;x<=(inputs[0].length()-5);x+=5) {
            if (inputs[1].charAt(x) == '1') {
                result += " ";
            }else if(inputs[4].charAt(x+1) == '1'){
                result += "C";
            }else if(inputs[7].charAt(x+1) == '1') {
                result += "A";
            }else {
                result += "B";
            }
        }
        System.out.println(result);
    }
}