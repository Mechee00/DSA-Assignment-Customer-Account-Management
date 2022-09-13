package utility;

import javax.swing.*;

public class Output {
    public void msgBox(String message, String title, int optionType) {
        // PLAIN_MESSAGE = -1
        // ERROR_MESSAGE = 0
        // INFORMATION_MESSAGE = 1
        // WARNING_MESSAGE = 2
        // QUESTION_MESSAGE = 3
        JOptionPane.showMessageDialog(null, message, title, optionType);
    }

    public void echo(String message) {
        System.out.print(message);
    }

    public void echoln(String message) {
        System.out.println(message);
    }
}