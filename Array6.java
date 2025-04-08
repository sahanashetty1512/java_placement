public class Array6 {
    public static void main(String[] args) {
      int n[]={15,2,58,34,76,45};
      int min=n[0];
      for(int i=0;i<n.length;i++)
      {
          if(min>n[i])
          {
              min=n[i];
          }
      }
      System.out.println(min);
    }
    
}
