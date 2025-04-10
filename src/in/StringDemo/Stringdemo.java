package in.StringDemo;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String aString= new String(" abhishek");
      String a=new String("abhishek");
      
      if(a.equals(a))
      {
    	  System.out.println("address is same");
      }
      else {
		System.out.println("address is not same");
	}
      
      System.out.println(aString);
      if(aString.equals("abhishek"))
      {
    	  System.out.println("both are same");
      }
      else {
		System.out.println("both are not equals");
	}
      
	}

}
