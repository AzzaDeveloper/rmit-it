
/**
 * Domain Rules:
 * The name must be a minimum of 1 character in length.
 * The name must NOT contain leading or trailing spaces.
 * The name must be in all caps. i.e. BLACK WIDOW / MAN OF STEEL
 * The name of the lead actor must be a minimum of 1 character in length.
 * The name of the lead actor must NOT contain leading or trailing spaces.
 * The name of the lead actor must be in title case i.e. Scarlett Johansson / Henry Cavill
 * The running time is expressed in minutes. i.e. 143 minutes
 * The running time must be a value greater than zero.
 * The star rating has six valid ratings: UNRATED, ONE, TWO, THREE, FOUR, and FIVE.
 * The default value for the star rating is UNRATED
 * You can change a rating to ONE, TWO, THREE, FOUR or FIVE.
 * You cannot change a rated movie back to an unrated movie.
 * An invalid value for a String data type should be set to "ERROR".
 * An invalid value for a numeric data type should be set to -1.
 * 
 * @param name
 * @param postCode
 * @param rating
 */
public class TheatreShow {

    private String name;
    private String leadActor;
    private int runningTime;
    private StarRating rating;

    private final String ERROR = "ERROR";

    /**
     * Domain Rules:
     * The name must be a minimum of 1 character in length.
     * The name must NOT contain leading or trailing spaces.
     * The name must be in all caps. i.e. BLACK WIDOW / MAN OF STEEL
     * The name of the lead actor must be a minimum of 1 character in length.
     * The name of the lead actor must NOT contain leading or trailing spaces.
     * The name of the lead actor must be in title case i.e. Scarlett Johansson / Henry Cavill
     * The running time is expressed in minutes. i.e. 143 minutes
     * The running time must be a value greater than zero.
     * The default value for the star rating is UNRATED
     * An invalid value for a String data type should be set to "ERROR".
     * An invalid value for a numeric data type should be set to -1.
     * @param name
     * @param postCode
     * @param rating
     */
    public TheatreShow(String name, String leadActor, int runningTime){
        this.name = name != null? setName(name) : ERROR;
        this.leadActor = leadActor != null? setLeadActor(leadActor):ERROR;
        this.runningTime = runningTime <=0? -1:runningTime;
        this.rating = StarRating.UNRATED;
    }

    public String getName(){return this.name;}

    public String getLeadActor(){return this.leadActor;}

    public int getRunningTime(){return this.runningTime;}

    public StarRating getStarRating(){return this.rating;}

    public boolean setStarRating(StarRating rating){
        boolean result = true;
        if(rating == StarRating.UNRATED){
            result = false;
        }else{
            this.rating = rating != StarRating.UNRATED?rating:this.rating;
        }
        return result;
    }

    public String toString(){
        final String DELIMETER = ":";
        return name + DELIMETER + leadActor + DELIMETER + runningTime + DELIMETER + rating;
    }

    private String setName(String name){
        final int MIN_NAME_LENGTH = 1;
        final boolean MIN_LENGTH_EXCEEDED = checkMinimumLength(name, MIN_NAME_LENGTH);
        return MIN_LENGTH_EXCEEDED ? ERROR: name.toUpperCase().trim();
    }

    private String setLeadActor(String leadActor){
        final int MIN_NAME_LENGTH = 1;
        final boolean MIN_LENGTH_EXCEEDED = checkMinimumLength(leadActor, MIN_NAME_LENGTH);
        return MIN_LENGTH_EXCEEDED ? ERROR: convertToTitleCase(leadActor);        
    }

    private boolean checkMinimumLength(String string, int minLength){return string.length() < minLength;}

    private String convertToTitleCase(String string){
        String result = "";
        String[] words = string.trim().toLowerCase().split("[ _]");
        for(int i = 0; i < words.length; i++){
            char firstCharacter = Character.toTitleCase(words[i].charAt(0));
            result += firstCharacter + words[i].substring(1) + " ";
        }
        return result.trim();
    }
}


