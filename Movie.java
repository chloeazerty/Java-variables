public class Movie {
    public static void main(String[] args) {
        String movieName;
        boolean isSeen;
        int releaseYear;
        float movieNote;

        movieName = "Indiana Jones and the Last Crusade";
        isSeen = true;
        releaseYear = 1989;
        movieNote = 8.2F;

        System.out.println("The original movie name is: "+ movieName);
        System.out.println("It is " + isSeen+ " I have seen the movie");
        System.out.println("The movie was released in " + releaseYear);
        System.out.println("It was scored " + movieNote);

    }
}
