package movies;

import util.Input;

public class MoviesApplication {

    public static Movie[] movies = MoviesArray.findAll();
    public static Input input = new Input();

    public static void main(String[] args) {

        options();
    }

    public static void options() {
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view animated movies");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println("6 - view movies that are musicals.");

            int pick = userPick();
            categorySelect(pick);
        } while(true);
    }

    public static int userPick() {
        return input.getInt();
    }

    public static void categorySelect(int pick) {
        if(pick == 0) {
            System.out.println("Thank you for using MovieApp. Goodbye!");
            System.exit(0);
        } else if(pick == 1) {
            showMovies();
        } else if(pick == 2) {
            showMovies("animated");
        } else if(pick == 3) {
            showMovies("drama");
        } else if(pick == 4) {
            showMovies("horror");
        } else if(pick == 5) {
            showMovies("scifi");
        } else if(pick == 6) {
            showMovies("musical");
        } else {
            System.out.println("Error, your selection is not a valid choice.");
        }

    }

    public static void showMovies() {
        for(Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static void showMovies(String category) {
        for(Movie movie : movies) {
            if(movie.isInCategory(category)) {
                System.out.println(movie);
            }
        }
    }
}