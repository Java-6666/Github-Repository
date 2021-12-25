package cn.com.yuhui;

public class KuaiSuPaiXu {

    public static void main(String[] args) {
        int arr[]={25,26,15,24,29,56,47};
        quick(arr,0,arr.length-1);
        for(int i:arr) {
            System.out.print(i+"    ");
        }
    }
    public static void quick(int arr[],int left,int right) {
        if(arr==null || arr.length==0){
            return;
        }
        if(left>right){
            return;
        }
        int key=arr[left];
        int l=left;
        int r=right;
        int temp;
        while(l!=r) {
            while(arr[r]>=key && l<r) {
                r--;
            }
            while(arr[l]<=key && l<r) {
                l++;
            }
            if(l<r) {
                temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
        arr[left]=arr[l];
        arr[l]=key;
        quick(arr,left,l-1);
        quick(arr,l+1,right);
    }
}
