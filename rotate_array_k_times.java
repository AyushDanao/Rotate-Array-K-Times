import java.util.Scanner;

public class rotate_array_k_times {
    static int[] rotate(int[] arr,int k)  // creating new array to save rotated array
    {
        int j=0;
        int n = arr.length;
        k=k%n;
        int[] ans = new int[n];
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=arr[i];
        }
        return ans ;

    }

    static void swaparray(int[] arr,int i,int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverse(int[] arr,int i,int j)
    {
        int n = arr.length;
        while(i<j)
        {
            swaparray(arr,i,j);
            i++;
            j--;

        }
    }
    static void rotateinplace(int arr[],int k)  // without creating new array
    {
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    static void printarray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter elements in array");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter value of k");
        int k = sc.nextInt();
        System.out.println("original array");
        printarray(arr);
//        rotate(arr,k);   // when creating new arrray
         rotateinplace(arr,k);  // when changes are made in exsisting array
        System.out.println("after rotation");
        printarray(arr);
    }
}
