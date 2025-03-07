class Rectangle extends Shape 
{
    public Rectangle(double length, double width) 
    {
        super("Rectangle", length, width, 0);
    }

    public double calculateArea() 
    {
        return dim_one * dim_two;
    }

