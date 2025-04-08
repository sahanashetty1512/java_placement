
public class Array7 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int left=a.length/2;
        int right=a.length-1;
        while(left<right)
        {
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");   
        }
       
        
    }
    
}
