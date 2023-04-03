package geeks.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CalculatorChild extends Calculator{


    @Override
    int sum(int a, int b){
        return b-a;
    }
    int multiply(int a , int b){
        return a*b;
    }
    int multiply(int a, int b , int c){
        return a*b*c;
    }
    public static void main(String[] s){
        CalculatorChild calculatorChild = new CalculatorChild();
        System.out.println(calculatorChild.sum(1,2));

        Calculator calculator = new CalculatorChild();
        System.out.println(calculator.sum(1,2));

        Calculator calculator1 = new CalculatorChild(); //--> upcasting
        Calculator calculator2 = (Calculator) calculator1; // --> downcasting


        Calculator calculator3 = new CalculatorChild();
//        calculator3.m


        List list = new ArrayList<String>(); //--> upcasting
        list.add("abs");
        list.add("abc");
        //List is parent class
        // object of child class
        List list1 = new LinkedList<String>(); //--> upcasting
        list1.add("John");
        list1.add("David");



    }

    }

//    Refrence Variable of parent -- object of child --> upcasting

//Parent child
//Parent ->parent
//Child -> child
//Parent -> child ---- upcasting
//Child -> Parent

//parent ref variable
//Child Object
//
//parent ref = (Parent) child Class Object;