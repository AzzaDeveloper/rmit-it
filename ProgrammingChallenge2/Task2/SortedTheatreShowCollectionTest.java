public class SortedTheatreShowCollectionTest {

    public static void main(String[] args){
        /**
         * Sample code has been provided as as starting point to test your implementation.
         * 
         * IMPORTANT: This code will not compile until you write the classes and enum being used here.
         * You may modify this code for faster testing purposes and exploration, but your assessment is 
         * evaluated through the use of unit tests, so you need to ensure that the classes/enum you write 
         * comply with the requirements setout in the documentation.
         * 
         * Adding undocumented methods to your classes will mean that 
         * the unit tests may fail.
         */
      final String THE_LION_KING = "the lion king";
      final String GUYS_AND_DOLLS = "guys and dolls";
      final String DIRTY_DANCING = "dirty dancing";
      
      final String BRANDON_MCCALL = "Brandon McCall";
      final String PATRICK_SWAYZE = "Patrick Swayze";
      final String EWAN_MCGREGGOR = "Ewan McGreggor";
    
      final TheatreShow THE_LION_KING_THEATRE = new TheatreShow(THE_LION_KING, BRANDON_MCCALL, 99);
      final TheatreShow GUYS_AND_DOLLS_THEATRE = new TheatreShow(GUYS_AND_DOLLS, EWAN_MCGREGGOR, 116);
      final TheatreShow DIRTY_DANCING_THEATRE = new TheatreShow(DIRTY_DANCING, PATRICK_SWAYZE, 142);
      
      TheatreShow[] theatreShows = new TheatreShow[3];
      theatreShows[0] = THE_LION_KING_THEATRE;
      theatreShows[1] = GUYS_AND_DOLLS_THEATRE;
      theatreShows[2] = DIRTY_DANCING_THEATRE;
      
      // Instatiates the SortedTheatreShowCollection
      SortedTheatreShowCollection theatreShowCollection = new SortedTheatreShowCollection();
      
      // Calls the sorting method
      TheatreShow[] theatreShowCollectionOrdered = theatreShowCollection.sortByRunningTime(theatreShows, Order.ASCENDING);
      
      for(int i = 0; i < theatreShows.length; i++){
         System.out.println(theatreShowCollectionOrdered[i]);
      }
    }
}
