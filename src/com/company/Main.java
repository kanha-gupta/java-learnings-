package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[5][5];
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j]=sc.nextInt();
                int sum1=0;
                sum1=arr[i][j]+sum1;
            }
        }
        //adding all numbers of arry

        int sum=0;
        for (int k = 0; k <arr.length ; k++) {
            for (int l = 0; l <k ; l++) {
                arr[k][l]+=sum;
                System.out.println(sum);
            }


        }
        System.out.println(sum);
    }
}