import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;

	
	/**
	 * A constructor creates a shared data object which contains the array and the target number
	 * @param array array of the numbers
	 * @param b  the target number
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	
	/**
	 *	returns the binary array
	 *	@return binary array
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 *	sets the binary array
	 *	@param new binary array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 *	returns the numbers array
	 *	@return numbers array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 *	returns the target number
	 *	@return target number
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 *	returns dontStop flag
	 *	@return dontStop flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 *	sets dontStop flag
	 *	@param new dontStop flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
