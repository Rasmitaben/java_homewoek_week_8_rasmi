package pool;

public class Cuboid extends Rectangle {
    //(instance variable) with name height of type double.
    double height;

    // one constructor with three parameters width, length, and height all of type double
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (this.height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }
    //Method named getHeight without any parameters, it needs to return the value of height
    //field.
    public double getHeight() {
        return height;

    }// Method named getVolume without any parameters, it needs to return the calculated volume.
    // To calculate volume, multiply the area with height.
    public double getVolume() {
        return getArea() * height;
    }
}

