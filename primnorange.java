import java.util.*;
public class primnorange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lower bound");
        int f=sc.nextInt();
        System.out.println("Enter the upper bound");
        int l=sc.nextInt();

      
        for (int n=f; n<=l;n++){
          
          int count=0;
           for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
            }   
            if (count>2)
                System.out.println(n+" is a prime number");
            
           
           
        }

       sc.close();
        
    }
}