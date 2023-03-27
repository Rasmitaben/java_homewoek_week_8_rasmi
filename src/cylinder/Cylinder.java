package cylinder;

public class Cylinder extends Circle {
    //instance variable with name height of type double.
    double height;

    //one constructor with two parameters radius and height both of type double.
    //It needs to call the parent constructor and initialize a height field.
    public Cylinder(double radius, double height) {
        super(radius);// parent class constructor call
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    //Method named getHeight without any parameters, it needs to return the value of height
    //field.
    public double getHeight() {
        return height;
    }
   //Method named getVolume without any parameters, it needs to return the calculated volume.
   //To calculate volume, multiply the area with height.
    public double getVolume() {
        return getArea() * height;
    }
}
