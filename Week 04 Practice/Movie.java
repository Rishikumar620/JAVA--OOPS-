// Design a Movie class with attributes such as movieTitle, genre, duration, and rating.
public class Movie {
    public String movieTitle;
    public String genre;
    public int duration;
    public double ratings;

    public Movie(String title, String genre, int duration, double ratings) {
        this.movieTitle = title;
        this.genre = genre;
        this.duration = duration;
        this.ratings = ratings;
    }
    public void movieTitle(){
        System.out.println("Movie Title: " + movieTitle);  
    }
    public void movieGenre(){
        System.out.println("Movie Genre: " + genre);
    }
    public void movieDuration(){
        System.out.println("Movie Duration: " + duration + " minutes");
    }
    public void movieRatings(){
        System.out.println("Movie Ratings: " + ratings + "/10");
    }

    public static void main(String[] args) {
        Movie movie = new Movie("3-idiots", "comedy", 144,9.2);
        movie.movieTitle();
        movie.movieGenre();
        movie.movieDuration();
        movie.movieRatings();

    }


}
