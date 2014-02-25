package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubble(int unsortedArray[])
	{
		int[] toReturn = array;
		/**
		 * TODO
		 * Implement bubble sort
		 */
		int k = 1;
		while(k < toReturn.length){
			// this chunk does one full pass
			for(int i = 0; i < toReturn.length-k; i++){

				int current = toReturn[i];
				int next = toReturn[i+1];
				// if the next is larger than the current, swap them!
				if (current > next){
					toReturn[i+1] = current;
					toReturn[i] = next;
				}
			}
			k++;
		}
		return toReturn;
	}
}
