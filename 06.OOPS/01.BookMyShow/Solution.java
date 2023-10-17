public class Solution{
    public static void main(String[] args){
        Movie avengers = new Movie();

        avengers.name = "Endgame";
        avengers.duration = 180;
        avengers.setRating(9.5);

        System.out.println(avengers.rating);
        System.out.println(avengers.duration);
        System.out.println(avengers.name);

        String details = avengers.getMovieDetails();
        System.out.println(details);
    }
}