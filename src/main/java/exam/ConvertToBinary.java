package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
   Scanner in =new Scanner(System.in);
    System.out.println("Enter a decimal number");
    int num=in.nextInt();
    
    string b="";
    int t=num;
    while(t>0)
    {
      int r=t%2;
      t=t/2;
      b=r+b;
    }
   System.out.println("Binary Equivalent of"+num+" is " +b);
    return "String";
  }
}
