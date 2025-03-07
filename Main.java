import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int choice;

        // Menu driven program loop
        do 
        {
            System.out.println("\nMENU:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            
            switch(choice) 
            {
                case 1: 
                {
                    // Rectangle input and calculations
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    Rectangle rec = new Rectangle(length, width);
                    System.out.println("Area: " + rec.calculateArea());
                    System.out.println("Perimeter: " + rec.calculatePerimeter());
                    break;
                }

                case 2: 
                {
                    // Circle input and calculations
                    System.out.print("Enter radius: ");
                    double radius = scan.nextDouble();
                    Circle cir = new Circle(radius);
                    System.out.println("Area: " + cir.calculateArea());
                    System.out.println("Perimeter: " + cir.calculatePerimeter());
                    break;
                }

                case 3: 
                {
                    // Square input and calculations
                    System.out.print("Enter side: ");
                    double side = scan.nextDouble();
                    Square sq = new Square(side);
                    System.out.println("Area: " + sq.calculateArea());
                    System.out.println("Perimeter: " + sq.calculatePerimeter());
                    break;
                }

                case 4: 
                {
                    // Sphere input and calculations
                    System.out.print("Enter radius: ");
                    double sphereRadius = scan.nextDouble();
                    Sphere sph = new Sphere(sphereRadius);
                    System.out.println("Area: " + sph.calculateArea());
                    System.out.println("Volume: " + sph.calculateVolume());
                    break;
                }

                case 5: 
                {
                    // Cylinder input and calculations
                    System.out.print("Enter radius: ");
                    double cylRadius = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scan.nextDouble();
                    Cylinder cyl = new Cylinder(cylRadius, height);
                    System.out.println("Area: " + cyl.calculateArea());
                    System.out.println("Volume: " + cyl.calculateVolume());
                    break;
                }

                case 6: 
                {
                    // Equilateral Pyramid input and calculations
                    System.out.print("Enter base side: ");
                    double base = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double pyrHeight = scan.nextDouble();
                    EquilateralPyramid pyr = new EquilateralPyramid(base, pyrHeight);
                    System.out.println("Area: " + pyr.calculateArea());
                    System.out.println("Volume: " + pyr.calculateVolume());
                    break;
                }
                
                case 7: 
                {
                    System.out.println("Exiting the Program...");
                    break;
                }

                default: 
                {
                    System.out.println("Invalid Choice!");
                }
            }
        } while(choice != 7);
    }
}
