class EquilateralPyramid extends Shape implements VolumeInterface
{
    public EquilateralPyramid(double base, double height) 
    {
        super("Equilateral Pyramid", base, height, 0);
    }

    public double calculateArea() 
    {
        return (dim_one * dim_one) + (2 * dim_one * dim_two);
    }

    public double calculateVolume() 
    {
        return (1.0 / 3) * (dim_one * dim_one) * dim_two;
    }
}