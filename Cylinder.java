class Cylinder extends Shape implements VolumeInterface 
{
    public Cylinder(double radius, double height) 
    {
        super("Cylinder", radius, height, 0);
    }

    public double calculateArea() 
    {
        return 2 * Math.PI * dim_one * (dim_one + dim_two);
    }

    public double calculateVolume() 
    {
        return Math.PI * dim_one * dim_one * dim_two;
    }
}