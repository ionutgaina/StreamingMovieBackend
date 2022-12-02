package database;

import java.util.ArrayList;

public final class Movie {
    private String name;
    private int year;
    private int duration;
    private ArrayList<String> genres;
    private ArrayList<String> actors;
    private ArrayList<String> countriesBanned;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public ArrayList<String> getCountriesBanned() {
        return countriesBanned;
    }

    @Override
    public String toString() {
        return "Movie{" +
               "name='" + name + '\'' +
               ", year=" + year +
               ", duration=" + duration +
               ", genres=" + genres +
               ", actors=" + actors +
               ", countriesBanned=" + countriesBanned +
               '}';
    }
}
