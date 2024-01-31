package com.Relearn;

public class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("%s...%n".repeat(3), "Something funny happens", "Something even funnier happens", "Happy ending...");
    }
}
