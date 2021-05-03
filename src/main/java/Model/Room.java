package Model;

public class Room {
    // Maybe use a array of tiles object
    Integer[][] layout;

    // the top left corner of a room in 2d space
    Coordinate origin;

    // the rows and cols that the room expands to
    // useful for calculating borders, corners etc
    Dimensions dimensions;


    public boolean isPointWithinRoom(Coordinate point) {
        Coordinate pointInLayout = new Coordinate(point.x - origin.x, point.y - origin.y);
        return !(pointInLayout.x > dimensions.rows
                || pointInLayout.y > dimensions.cols
                || pointInLayout.x < origin.x
                || pointInLayout.y < origin.y);

    }

    public Integer[][] getLayout() {
        return layout;
    }

    public void setLayout(Integer[][] layout) {
        this.layout = layout;
    }

    public Coordinate getOrigin() {
        return origin;
    }

    public void setOrigin(Coordinate origin) {
        this.origin = origin;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
