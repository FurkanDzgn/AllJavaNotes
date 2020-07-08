package Day27_Wrappers.StaticPractice;

public class AmazonTest {
	
	public static void main(String[] args) throws Exception {
		
		AmozonUtils.navigate(Testdata.URL);
		AmozonUtils.login(Testdata.username, Testdata.password);
		AmozonUtils.search("Carpet");
		
		String[] actualResult = {"carpet","rug","Turkish carpet","American carpet"}; // , "sofa"
		
		for(String result: actualResult) {
			if(result.contains("carpet") || result.contains("rug")) {
				
			}else {
				System.out.println("FAILED");
				throw new Exception("FAILED. Expected: carpet, but Actual:"+ result);
			}
		}
		
		double[] cartItemPrices = {30.99, 26.95, 39.99};
		double actualTotalAmount = 97.93;
		double expectedTotalAmount = Calculator.sum(cartItemPrices);
		
		if(actualTotalAmount != expectedTotalAmount) {
			System.out.println("Prices are not match:\nActual: "+ actualTotalAmount+"\nExpected: "+expectedTotalAmount);
		}
	}

}
