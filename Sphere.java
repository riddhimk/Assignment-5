class Sphere extends Shape implements VolumeInterface
{
    public Sphere(double radius) 
    {
        super("Sphere", radius, 0, 0);
    }

    public double calculateArea() 
    {
        return 4 * Math.PI * dim_one * dim_one;
    }

