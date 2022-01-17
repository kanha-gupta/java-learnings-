package com.company;

/*public class binary_search {
    public static void main(String[] args) {
        int [] ar={4,5,6,7,8,8,9};
        int target=9;
        System.out.println(binarysearch(ar,target));
    }
    static int binarysearch(int []arr,int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if (arr[mid]==target){
                return mid;
            }
            else{
                return -1;
            }
        }
        return -1;
    }}*/
public   class binary_search {
    public static void main(String[] args) {

    }
    static double sqrt(int x){

        for (double i = 1; i <x ; i++) {
            double ans=i*i;
            if(ans==x){
              return i;
            }
        }
        return 0;
    }
}