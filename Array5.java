//find max in array
public class Array5 {
    public static void main(String[] args) {
      int n[]={15,2,58,34,76,45};
      int max=0;
      for(int i=0;i<n.length;i++)
      {
          if(max<n[i])
          {
              max=n[i];
          }
      }
      System.out.println(max);
    }
    
}
