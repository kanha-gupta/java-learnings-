/*
package com.company;
//finding number with even number of digits in an array
public class linear_search {
    public static void main(String[] args) {
        int[] arr2={69,60,2,4,100,9000,680000,45832,0};
        System.out.println(arr1(arr2));


    }
    static int arr1(int arr []){
        for (int i = 0; i <arr.length ; i++) {
            int calculations=even1(arr[i]);
            if (calculations%2==0){
                System.out.println(i);
            }

        }
        System.out.println();
        return 0;
    }
    static int even1(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
       return count;
    }
}*/
// q2 adding 2 arrays digits in 2d array like ([2,3,4],[4,5,6]) so 2+3+4
package com.company;
public class linear_search {
    public static void main(String[] args) {
int [][]arr3 = {{2,30,4},{3,50,8}};

        System.out.println(arr1(arr3));
    }
    static int arr1(int [] [] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
             sum=arr[i][j]+sum;
            }
            max= Math.max(max,sum);

        }
     return max;
    }

}