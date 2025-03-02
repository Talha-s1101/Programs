import java.util.Scanner;

public class GivenNumIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i= 2;i>num;i++){
            if (num%i==0){
                count +=1;
            }
        }
        if (count==0){
            System.out.println("it is prime.");
        }else {
            System.out.println("not prime");
        }
    }
}
