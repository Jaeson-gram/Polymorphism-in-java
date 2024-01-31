package com.Relearn;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String movieName = this.getClass().getSimpleName();

        System.out.printf("%s is a %s film%n",title, movieName);
    }

    //Factory method. Letting the calling code get an object without knowing how it's created - we're
    // creating an instance from here, the calling code just has to call this method.
    public static Movie getMovie(String type, String title){
        return switch (type.toLowerCase().substring(0, 3)){
            case "adv" -> new Adventure(title);
            case "com" -> new Comedy(title);
            case "sci" -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

    public static Movie getgMovie(String type, String title){
        return new Movie(title);

    }
}
