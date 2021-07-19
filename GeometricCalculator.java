package util;

public class GeometricCalculator {
	public static final double PI = Math.PI;
	
	// TODO Quadrado
	public static double SquareOfArea(double width, double height) {
		return width * height;
	}

	public static double SquareOfPerimeter(double side) {
		return 4 * side;
	}
	
	
	
	
	
	// TODO Triâgulo
	public static double triangleOfPerimeter(double side_A, double side_B, double side_C) {
		return (side_A + side_B + side_C) / 2.0;
	}
	
	public static double triangleOfArea(double side_A, double side_B, double side_C) {
		double p = triangleOfPerimeter(side_A, side_B, side_C);
		return Math.sqrt(p * (p - side_A) * (p - side_B) * (p - side_C));
	}
	
	
	
	
	
	// Pirâmide de base quadrada
	public static double pyramidOfSquareBaseVolume(double width_Area, double height) {
		return width_Area * height / 3;
	}
	
	public static double pyramidOfSquareBaseVolume(double width_Base, double height_Base, double height_Pyramid) {
		return SquareOfArea(width_Base, height_Base) * height_Pyramid / 3;
	}
	
	
	
	
	
	// TODO Circunferencia
	public static double circumferenceOfPerimeter(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double circunferenceOfArea(double radius) {
		return PI * Math.pow(radius, 2);
	}

	public static double circunferenceOfVolume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
	
}
