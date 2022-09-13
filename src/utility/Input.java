package utility;

import java.util.Scanner;
import java.util.regex.*;

public class Input {
    Scanner sc = new Scanner(System.in);
    Output out = new Output();
    private String userInput;

    public Input() {
        userInput = "";
    }

    public String getUserInput() {
        return this.userInput;
    }

    public void continuePrompt() {
        System.out.println("Press {Enter} key to continue!"); // Print prompt message
        try {
            sc.nextLine(); // Read input
        } catch (Exception e) {
            out.msgBox("Unable to process Input", "An Error Occured", 0);
            e.printStackTrace();
        }
    }

    public String readIn() {
        do {
            try {
                userInput = sc.nextLine(); // Read next line
                return userInput; // return the line if no error occured
            } catch (Exception e) {
                out.msgBox("Input process error.", "Error Occured", 0); // Display the error message
                e.printStackTrace();
            }
        } while (true);
    }

    public boolean isMatchRegEx(String regularExpression) {
        Pattern regExPat = Pattern.compile(regularExpression);// Create object for Regex Pattern
        Matcher matchVar; // Create object for Matching Regex
        // Check Input ID
        matchVar = regExPat.matcher(this.userInput);
        // Return true or false if matched or not matched
        return matchVar.matches();
    }

}
