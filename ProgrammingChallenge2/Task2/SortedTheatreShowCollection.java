public class SortedTheatreShowCollection {
	/** DECLARE YOUR ATTRIBUTES HERE */

	private TheatreShow[] sort(TheatreShow[] array, Order order) {
	   TheatreShow[] arr = array.clone();
		int pos;
		TheatreShow temp;
		for (int i = 0; i < arr.length; i++) {
			pos = i;
			for (int j = i + 1; j < arr.length; j++) {
			   if (order == Order.ASCENDING) {
   				if (arr[j].getRunningTime() < arr[pos].getRunningTime()) {
   					pos = j;
   				}
			   } else {
			      if (arr[j].getRunningTime() > arr[pos].getRunningTime()) {
   					pos = j;
   				}
			   }
			}

			temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	/** CONSTRUCTOR */
	public SortedTheatreShowCollection() {
		/**
		 * IMPLEMENT YOUR CODE HERE
		 */
	}

	public TheatreShow[] sortByRunningTime(TheatreShow[] array, Order sortOrder) {
      return sort(array, sortOrder);
	}

	/**
	 * IMPLEMENT MORE YOUR CODE HERE
	 */
}