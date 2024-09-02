package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample3 {
    @Test
	public void softAssertStrictComparison() {
		String expectedData = "raja";
		String actualdData  = "Raja";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualdData,expectedData);
		
		System.out.println("strict compasison passed!!");
		sa.assertAll();
}
    @Test
    public void containsLevelComparison() {
    	String expectedData = "raja";
		String actualdData  = "maharaja";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actualdData.contains(expectedData));
		
		System.out.println("contains compasison passed!!");
		sa.assertAll(); 
    }
}