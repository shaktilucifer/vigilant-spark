package Model;

public class Dimensions {
    Integer rows;
    Integer cols;

    public Dimensions(Integer rows, Integer cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }
}
