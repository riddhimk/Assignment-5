# Assignment 5

## Shape Calculator
This Java program calculates the **area, perimeter, and volume** of different geometric shapes. It provides a **menu-driven interface** to select and compute values for various shapes.

## Features

- **Rectangle**: Computes area and perimeter.
- **Circle**: Computes area and perimeter.
- **Square**: Computes area and perimeter.
- **Sphere**: Computes surface area and volume.
- **Cylinder**: Computes surface area and volume.
- **Equilateral Pyramid**: Computes surface area and volume.
- **Menu-driven input**: Allows user interaction through console commands.

## Class Structure

### `Shape.java`
- Abstract base class for all shapes.
- Contains common properties such as dimensions and shape name.
- Defines abstract methods for area and perimeter calculations.

### `Volume.java`
- Interface that defines the `calculateVolume()` method for 3D shapes.

### `Circle.java`
- Extends `Shape`.
- Implements methods to calculate **area** and **perimeter**.

### `Rectangle.java`
- Extends `Shape`.
- Implements methods to calculate **area** and **perimeter**.

### `Square.java`
- Extends `Shape`.
- Implements methods to calculate **area** and **perimeter**.

### `Sphere.java`
- Extends `Shape` and implements `Volume`.
- Implements methods to calculate **surface area** and **volume**.

### `Cylinder.java`
- Extends `Shape` and implements `Volume`.
- Implements methods to calculate **surface area** and **volume**.

### `EquilateralPyramid.java`
- Extends `Shape` and implements `Volume`.
- Implements methods to calculate **surface area** and **volume**.

### `Main.java`
- Implements the **menu-driven interface** for user interaction.
- Calls appropriate methods from the shape classes based on user input.
