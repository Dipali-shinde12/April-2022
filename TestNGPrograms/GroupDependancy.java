package TestNGPrograms;

import org.testng.annotations.Test;

public class GroupDependancy {
@Test(groups = "SignIn")
public void login()
{
	System.out.println("Login Successfully");
}
@Test(dependsOnGroups = "SignIn")
public void viewAccount()
{
System.out.println("View account successfully");	
}
}
