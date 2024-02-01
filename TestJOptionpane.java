import javax.swing.JOptionPane;

public class TestJOptionpane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello", "test", 0);
        String nameInput = JOptionPane.showInputDialog("what is your name :");
        JOptionPane.showMessageDialog(null, "Hello " + nameInput, "Test", 0);
        String ageInput = JOptionPane.showInputDialog("How old are you ");
        int age = Integer.parseInt(ageInput);
        int nextYearAge = age + 1;
        JOptionPane.showMessageDialog(null, "Next year you will " + nextYearAge + " years old", "test", 1);
    }
}
