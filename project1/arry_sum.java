package project1;

public class arry_sum {
    public static void main(String[] args) {
        int arr[]={5,6,4,5,6};
        int sum=0;
        int averge=0;
        int averge_result=0;
        for (int i=0 ;i<arr.length;i++) {
            sum =sum+arr[i];
            averge =averge+arr[i];
        }
        averge_result=averge/5;
        System.out.println("sum of element:-"+sum);
        System.out.println("averag of element:-"+averge_result);
    }
}
