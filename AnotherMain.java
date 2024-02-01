package com.Relearn;

import java.util.Objects;

public class AnotherMain {
    public static void main(String[] args) {
        Movie movie1 = Movie.getMovie("Adventure", "Addo.faer");
        movie1.watchMovie();

        Adventure Addo = (Adventure) Movie.getMovie("Adventure", "Addo.faer"); //Class casting
        Addo.watchAdventure(); //While not cast into an Adventure type, the Movie class does not know what's happening in the Adventure class, so it cannot really access this method..
        Addo.watchMovie();

        Object comedy = Movie.getMovie("Comedy", "Commoner"); //Although this works because all classes inherit from the Object class...
//        comedy.watchMovie();   -> This gives us an error unless we cast, because the method is not known by Object. Just like Movie cannot get Comedy above
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy(); // -> Casting to an even more specific class allows us to access its class methods.

        var airplane = Movie.getMovie("Adventure", "Airplane 64");
        // -> The var keyword, as in C#. Local Variable Type Inference (lVTI) intro'd in Java 10. It infers a type from what we assign to it on the right-hand side of the Line of Code.
        airplane.watchMovie();

        var plane = new Comedy("Airplane 64");
        // -> Unlike above, here we are explicitly specifying it's a Comedy type,
        // while the above is seen as a generic movie type, this one will be a Comedy type of Movie


        //TESTING FOR TYPE AT COMPILE TIME
        System.out.println("Testing types at compile time:");
        Object unkownObject = Movie.getMovie("Science Fiction", "The Man from Ahoada");
        if (Objects.equals(unkownObject.getClass().getSimpleName(), "Comedy")){ // || if(unkownObject.getClass().getSimpleName() == "Comedy)
            Comedy c = (Comedy) unkownObject;
            c.watchComedy();
        }
        else if (unkownObject instanceof Adventure){
            ((Adventure) unkownObject).watchAdventure();
        }
        else if (unkownObject instanceof ScienceFiction scifi){ // -> Pattern Matching: JDK 16. scifi variable automatically becomes a type of Science Fiction
            scifi.watchSciFi();;;;;;;
        }


        /*Run these different tests for the runtime type:
        Movie.getMovie("Science Fiction", "The Man from Ahoada");
        Movie.getMovie("Adventure", "Jere");
        Movie.getMovie("Comedy", "The Plains, or shores");
         */


    }
}
