class Circle extends Shape 
{
    public Circle(double radius) 
    {
        super("Circle", radius, 0, 0);
    }

    public double calculateArea() 
    {
        return Math.PI * dim_one * dim_one;
    }

