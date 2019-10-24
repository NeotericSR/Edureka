import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.System.console;

import javax.swing.plaf.TreeUI;

class CheckLargerNumber {
    int[] num = new int[2];

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        CheckLargerNumber checker = new CheckLargerNumber();
        System.out.println("The larger number is " + GetLarger(GetInput(checker.num, kb)));
    }

    private static int[] GetInput(int[] num, Scanner kb)
    {
        int[] result = new int[2];
        String[] order = {"first","second"};

        for(int x = 0; x < 2; x++) {

            System.out.println("please enter "+ order[x] +" number: ");
            result[x] = kb.nextInt();
        }
        return result;
    }

    private static int GetLarger(int[] num){
        if(num[0] > num[1]){
           return num[0];
        }
        else
           return num[1];
    }

}