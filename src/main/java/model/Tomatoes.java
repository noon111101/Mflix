package model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Tomatoes {
    private String consensus;
    private Critic critic;
    private LocalDate dvd;
    private int fresh;
    private LocalDate lastUpdated;
    private String production;
    private int rotten;
    private Viewer viewer;
    private String website;
}
