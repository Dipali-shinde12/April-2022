package TestNGPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterDemo {
  @Test
  @Parameters({"val1", "val2"})
  public void sum(int v1, int v2) {
	  int sum = v1+v2;
	  System.out.println("Addition is"+sum);
	  
  }
  @Test
  @Parameters({"val1", "val2"})
  public void minus(int v1, int v2) {
	  int diff = v1-v2;
	  System.out.println("difference is"+diff);
}
  @Test
  @Parameters({"val1", "val2"})
  public void mul(int v1, int v2) {
	  int mul = v1*v2;
	  System.out.println("multiplication is"+mul);
}
  @Test
  @Parameters({"val1", "val2"})
  public void div(int v1, int v2) {
	  int div = v1/v2;
	  System.out.println("division is"+div);
  }
}