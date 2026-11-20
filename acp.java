class VolumeCalculator {
    private double length;
    private double width;
    private double height;
    private double radius;

    public void setCube(double side) {
        this.length = side;
    }

    public void setCuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setCylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double cubeVolume() {
        return length * length * length;
    }

    public double cuboidVolume() {
        return length * width * height;
    }

    public double cylinderVolume() {
        return 3.14 * radius * radius * height;
    }
}

public class acp {
    public static void main(String[] args) {

        VolumeCalculator cube = new VolumeCalculator();
        cube.setCube(5);
        System.out.println("Volume of Cube = " + cube.cubeVolume());

        VolumeCalculator cuboid = new VolumeCalculator();
        cuboid.setCuboid(4, 3, 2);
        System.out.println("Volume of Cuboid = " + cuboid.cuboidVolume());

        VolumeCalculator cylinder = new VolumeCalculator();
        cylinder.setCylinder(3, 7);
        System.out.println("Volume of Cylinder = " + cylinder.cylinderVolume());
    }
}