public class Movie{
   // data members
    String name;
    int duration;
    double rating;

    void setRating(double newRating){
        rating = newRating;
    }

    String getMovieDetails(){
        return ("Movie name :"+ name + ", Duration :" + duration +", Rating : " + rating);
    }
}