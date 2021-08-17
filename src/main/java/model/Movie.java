package model;

import lombok.Data;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

@Data
public class Movie {
    private ObjectId id;
    private String title;
    private int year;
    private List<String> cast;
    private String fullPlot;
    private String lastUpdated;
    private String type;
    private String poster;
    private List<String> directors;
    private List<String> writers;
    private List<String> countries;
    private List<String> genres;
    private Awards awards;
    private List<String> languages;
    private int num_mflix_comments;
    private String plot;
    private Tomatoes tomatoes;
    private Imdb imdb;
    private String rated;
    private Date released;
    private int runtime;

    public Movie() {
    }
}
