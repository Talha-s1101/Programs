import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp1 = num;
        int temp2 = num;
        int sum = 0,digit=0;
        while(temp1!=0){
            temp1/=10;
            digit++;
        }
        while(temp2!=0){
            int lstdgt = temp2%10;
            sum = (int) (sum+Math.pow(lstdgt,digit));
            temp2/=10;
        }
        if(sum ==num )
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
