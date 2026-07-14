import java.util.Scanner;
public class sumofgiven_range {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number range for sum:");
        int n = sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
       for(int i=n;i<=m;i++){
        sum=sum+i;
       
    }
     System.out.println("The sum of given range is:"+sum);
       }
        }
        

