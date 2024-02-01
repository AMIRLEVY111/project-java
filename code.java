import java.util.Scanner;

public class code {
   
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want the mulitiplication of:");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println("  ");
            for(int j=1; j<=10; j++){
                System.out.format("%7d", j * i);
            }
        }
    }
}