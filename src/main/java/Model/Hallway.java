package Model;

import java.util.ArrayList;
import java.util.List;

public class Hallway {

    public Hallway(Coordinate from, Coordinate to, List<Coordinate> turnPoints) {
        this.from = from;
        this.to = to;
        this.turnPoints = turnPoints == null ? new ArrayList<>() : turnPoints;
    }

    // Starting point of the hallway
    Coordinate from;

    // Ending point of the hallway
    Coordinate to;

    // turn points are points where the hallways can turn in any direction
    // if no waypoints are present the hallway is a straight horizontal or vertical line
    List<Coordinate> turnPoints;


    public boolean isPointWithinHallway(Coordinate point) {
        // TODO check if a point is within hallway
        return true;
    }


    public Coordinate getFrom() {
        return from;
    }

    public void setFrom(Coordinate from) {
        this.from = from;
    }

    public Coordinate getTo() {
        return to;
    }

    public void setTo(Coordinate to) {
        this.to = to;
    }

    public List<Coordinate> getTurnPoints() {
        return turnPoints;
    }

    public void setTurnPoints(List<Coordinate> turnPoints) {
        this.turnPoints = turnPoints;
    }
}
