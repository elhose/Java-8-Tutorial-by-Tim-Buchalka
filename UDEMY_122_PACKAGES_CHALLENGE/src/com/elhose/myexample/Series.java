package com.elhose.myexample;

public class Series {

    public Series() {
    }

    public  int nSum(int n){
        int sum = 0;
        for (int i=0; i<n ;i++ ){
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n){
        int product =1;
        for (int i=1;i<=n;i++){
            product = product *i;
        }
        return product;
    }

    public static int fibonacci(int n){
        if (n==0){
            return n;
        }
        else if(n==1){
            return n;
        }
        else if (n>1){
            int n1=0;
            int n2=1;
            int sum=0;

            for (int i=1;i<n;i++){
                sum = n1+n2;
                n1=n2;
                n2=sum;
            }
            return sum;
        }
        return -1;
    }
}
