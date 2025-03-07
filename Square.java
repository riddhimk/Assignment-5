class Square extends Shape 
{
    public Square(double side) 
    {
        super("Square", side, side, 0);
    }

    public double calculateArea() 
    {
        return dim_one * dim_one;
    }

