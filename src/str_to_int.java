import javax.swing.*;

public class str_to_int {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("enter the number in the form of a number");
        int no = Integer.parseInt(number);
        //coverting string to integer
        // to check if it is converted or not we will add an integer value to it
        System.out.println(no + 6);
        System.out.println("string value succussfully converted");


    }

}
