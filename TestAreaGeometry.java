import javax.swing.JOptionPane;

public class TestAreaGeometry {
    public static void main(String[] args) {
        // sqauare
        String inputLength = JOptionPane.showInputDialog("Insert length of  sqauare");
        double sqauareLength = Double.parseDouble(inputLength);
        double sqauareArea = sqauareLength * sqauareLength;
        JOptionPane.showMessageDialog(null, "Area of Square : " + sqauareArea, "Square Area", 0);
        // rectangle
        String inputWidth = JOptionPane.showInputDialog("Insert Width of  rectangle ");
        String inputLengthReactangle = JOptionPane.showInputDialog("Insert Length of  rectangle ");

        double rectangleWidth = Double.parseDouble(inputWidth);
        double rectangleLength = Double.parseDouble(inputLengthReactangle);

        double rectangle = rectangleWidth * rectangleLength;
        JOptionPane.showMessageDialog(null, "Area of rectangle : " + rectangle, "rectangle Area", 1);
        // Circle
        String inputCircle = JOptionPane.showInputDialog("Insert length of  Circle ");
        double reddius = Double.parseDouble(inputCircle);
        double CircleArea = 3.14 * reddius * reddius;
        JOptionPane.showMessageDialog(null, "Area of Circle : " + CircleArea, "Circle Area", 2);
    }
}
