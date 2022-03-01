package testng;

import org.testng.annotations.Test;

public class Groupsample {
  @Test(groups = "sanity")
  public void f() {
	  
	  System.out.println("f");
  }
  
  @Test(groups = "retesting")
  public void g() {
	  
	  System.out.println("g");
  }
  
  
  @Test(groups = "regression")
  public void h() {
	  
	  System.out.println("h");
  }
  
  
  @Test(groups = "sanity")
  public void a() {
	  
	  System.out.println("a");
  }
  
  @Test(groups = "retesting")
  public void b() {
	  
	  System.out.println("b");
  }
  
  
  @Test(groups = "regression")
  public void c() {
	  
	  System.out.println("c");
  }
  
}
