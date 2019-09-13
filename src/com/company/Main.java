package com.company;

public class Main {


    static long find_Fibonacci_number(int number){
        if(number<=1){ return number;
        }else {
            return find_Fibonacci_number(number-1)+ find_Fibonacci_number(number-2);
        }
    }

    static void print_Fibonacii_Sequence(int seq_size){
        for(int i=0;i<=seq_size;i++){
            System.out.println(i+":"+find_Fibonacci_number(i));
        }
    }

    public static void main(String[] args) {
	System.out.println( find_Fibonacci_number(3));
        print_Fibonacii_Sequence(40);

    }
}
