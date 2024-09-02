package sample;




import org.testng.Assert;
import org.testng.annotations.Test;



public class sample2 {
	
	@Test
	public void hardAssertStrictComparison() {
		String expectedData = "raja";
		String actualdData  = "Raja";
		
		Assert.assertEquals(actualdData,expectedData);
		
		System.out.println("strict compasison passed!!");
		
	}
	@Test
	  public void containsLevelCompasison() {
		String expectedData = "raja";
		String actualdData  = "maharaja";
		Assert.assertTrue(actualdData.contains(expectedData));
		System.out.println("contains compasison passed!!");
	}

}
