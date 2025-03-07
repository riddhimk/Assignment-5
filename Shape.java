// Abstract class defining basic properties and methods
abstract class Shape 
{
    protected double dim_one, dim_two, dim_three;
    protected String shapeName;

    public Shape(String shapeName, double dim_one, double dim_two, double dim_three) 
    {
        this.shapeName = shapeName;
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
    }

