import java.util.Scanner;

public class Source {
    
    public void check (String z, int x, int y){
        if (z.equals("+")){
            add(x,y);
        } else if (z.equals("-")){
            minus(x,y);
        } else if (z.equals("/")){
            div(x,y);
        } else if (z.equals("*")){
            mult(x,y);
        } else{
            System.out.println("invalid input");
        }
    }

    

    private void add (int x, int y){
        System.out.println(x+y);
    }

    private void minus(int x, int y){
        System.out.println(x-y);
    }

    private void div (int x, int y){
        System.out.println(x/y);
    }

    private void mult (int x, int y){
        System.out.println(x*y);
    }

    public static void main(String[] args){
    
        Scanner myUtil = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = myUtil.nextInt();

        System.out.println("enter second number");
        int y = myUtil.nextInt();

        System.out.println("Enter mathematical function i.e, +,-,/,*");
        String z = myUtil.next();
        
        Source s=new Source();
        s.check(z,x,y);
    }
}