import java.util.Scanner;

class operation {
    int add(int a,int b){
        return a+b;
    }
    boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    int fact(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }
    
}
public class operations{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        operation op=new operation();
                System.out.println("Enter a number:");

        int a=sc.nextInt();
                System.out.println("Enter a number:");

        int b=sc.nextInt();
               System.out.println(op.add(a,b));
                System.out.println(op.isEven(a)); 
                System.out.println(op.fact(b));
 


    }

}
