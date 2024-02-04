//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Polygon triangle = new Triangle(5, 3);
        Polygon rectangle = new Rectangle(7, 4);
        Polygon square = new Square(12);

        displayAreaByConsole(triangle);
        displayAreaByConsole(rectangle);
        displayAreaByConsole(square);
    }

    static void displayAreaByConsole(Polygon polygon){
        System.out.printf("The area of this Polygon(%s) is: %s\n",
                polygon.getClass().getSimpleName(),calculateArea(polygon));
    }

    static double calculateArea(Polygon polygon){
        return polygon.getArea();
    }
}