import java.util.Scanner;
public class PN_n{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");

        int x=sc.nextInt();
        if(x>0){
            System.out.println("The number is positive");
        }
        else if(x<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }

       
    }
}
