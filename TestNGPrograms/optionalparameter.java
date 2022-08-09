package TestNGPrograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class optionalparameter {
	@Test
	@Parameters("message")
	public void opt(@Optional("Optional Parameter Selected")String message) {
		System.out.println(message);
	}
@Test
@Parameters()
public void option(@Optional("30") int v1,@Optional("20") int v2) {
	int sum = v1+v2;
	System.out.println(sum);
}
}
