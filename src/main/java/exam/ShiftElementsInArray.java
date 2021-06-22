package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    int[] arr=new int[]{1,2,3,4,5};
    int =5;
    System.out.println("Original array:");
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]+"");
    }
    for(int i=o;i<n;i++)
    {
      int j,last;
      last=arr[arr.length-1];
      
      for(j=arr.length-1;j>0;j--)
      {
        arr[j]=arr[j-1];
      }
      arr[0]=last;
    }  
   
    System.out.println();
    
    System.out.println("array after right rotation:");
    for(i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]+"");
    }
  }

}
