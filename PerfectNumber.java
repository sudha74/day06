import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        long n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextLong();
        int i=1;
        // executes until the condition becomes false
        while (i<=n/2)
        {
            if(n%i==0) {
                // calculates the sum of factors
                sum = sum + i;

            }// end of if
            // after each iteration,increments the value of variable
            i++;
        }// end of while
        // compares sum with the number
        if(sum==n)
        {
            //prints if sum and n are equal
            System.out.println(n+ "os a perfect number.");
        }// end of if
        else
            // prints if sum and n are not equal
            System.out.println(n+ "is not a perfect number.");
    }

}
