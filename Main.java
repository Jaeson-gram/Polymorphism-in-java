package com.Relearn;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Now we don't need to know about the different child classes to create instances of them.
        // And we don't even create instances of the Parent class (Movie) here -> Factory method... see movie class .getMovie method.

//        Movie movie = Movie.getMovie("Adventure", "Alberto!");
//        movie.watchMovie();

        //Using the Scanner class...
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter type (Adventure, Comedy, or Science fiction: ");
            String type = scan.nextLine();

            if ("Qq".contains(type))
                break;

            System.out.print("Enter movie title: ");
            String title = scan.nextLine();
            Movie movie1 = Movie.getMovie(type, title);
            movie1.watchMovie();
        }
    }
}
