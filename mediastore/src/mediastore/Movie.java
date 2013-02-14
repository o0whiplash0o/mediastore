package mediastore;

/**
 * A class that encapsulates a movie.
 *
 * @author Milton John, Ryan Smith and Cole Arnold
 */
public class Movie extends Media {

    protected int releaseYear;
    
    public Movie() {
        //POST: Initializes data members to "" or 0
        super();
    }

    public Movie( String author, String title, int duration, String genre, double price, int releaseYear, int numSold ) {
        //PRE: Takes an author (director), title, duration, genre, ranking, price ( > 0 ), and release year ( > 0 )
        //POST: Sets data members to respective values
        super( author, title, duration, genre, price, numSold );
        this.releaseYear = releaseYear;
    }

    //****************************************************************************
    //*                            Set and Get Methods                           *
    //****************************************************************************
    public void setReleaseYear( int releaseYear ) {
        //PRE: Parameter takes in year of movie release
        //POST: Release year is set to given value
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        //POST: returns movie's release year
        return releaseYear;
    }

    protected Movie getFromID() { // only media should call this method
        return null;
    }
    
    public String toTextDBRepresentation(){
        return author + "\n " + title + "\n " + duration + "\n " + genre + "\n " + ranking + "\n " + price + "\n "  + numSold + "\n" + releaseYear;
    }
}
