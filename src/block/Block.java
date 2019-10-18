package block;

import java.util.Arrays;

public class Block {			//An object of this class will have two items 1.transactions 2.prevHash.
	private String[] transactions;
	private int prevHash;
	
	private int currBlockHash;
	
	public Block(int prevHash,String[] transactions) {	
	
		this.prevHash=prevHash;
		this.transactions=transactions;
		
		Object [] contents= {Arrays.hashCode(transactions),prevHash};
		this.currBlockHash=Arrays.hashCode(contents);
	}
	
	public int prevHash(){
		return prevHash;
	}
	
	public int getHash(){
		return currBlockHash;
	}
	
	

}
