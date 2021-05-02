package Model;

public class Room {
    // Maybe use a array of tiles object
    Integer[][] layout;
    Coordinate origin;

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
}
