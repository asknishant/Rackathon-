
//A java program to show application of hashcode and block chain.


package block;

public class Mainclass {

	public static void main(String[] args) {
		
		
		
		String []initialTransactions= {"Ram gave 5000 INR to Sita","Sita gave 1000 to Laxman"};
		
		Block initialBlock = new Block(0,initialTransactions);
		System.out.println(initialBlock.getHash());
		
		String []secondTransactions= {"Laxman gave 15000 to Shatrugan","Shatrugan gave 2000 to Bharat"};
		
		Block block2 = new Block(initialBlock.getHash(),secondTransactions);
		System.out.println(block2.getHash());

	}

}
