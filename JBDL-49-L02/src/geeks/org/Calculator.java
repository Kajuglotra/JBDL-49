package geeks.org;

public class Calculator {
    int sum(int a , int b){
        return a+b;
    }
    int sum(int a, int b , int c){
        return  a+b+c;
    }


    public static void main(String[] s){
        Calculator c= new Calculator();
//        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,3));

    }
}
