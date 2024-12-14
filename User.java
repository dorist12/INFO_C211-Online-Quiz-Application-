/*
 * @author: Logan Young
 * @dateStarted: December 10th, 2024
 * @description:
 *      Stores a user object that has a String name attribute and an ArrayList of Integers answers 
 *      attribute. A User can store user data, track specific answers to Questions, and calculate
 *      a final score.
*/

package FinalProject;

import java.util.ArrayList;
import java.util.Random;

public class User {
    
    // Stores the user's name/username
    private String name;
    
    // Stores the user's email
    private String email;
    
    // Stores the user's unique ID
    private long ID;
    
    // Stores the user's answers, corresponding to the questions
    // NOTE: The way the answers are held is subject to change.
    private ArrayList<Integer> answers;
    
    // Creates a new User with blank name and email, but a functioning ID
    public User() {
        this.name = "";
        this.email = "";
        this.ID = this.setID();
    }
    
    // Creates a new User with a passed name and email and a functioning ID
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.ID = this.setID();
    }
    
    // Creates a new ID stored in a long using Java's Random class.]
    public long setID() {
        
        return 0;
    }
    
    // Stores the user's answer to a specific question in the answers ArrayList
    public void recordAnswer(Question question, int answer) {
        
    }
    
    // Calculates the user's current score on the quiz as a double (displayed as a percentage)
    public double calculateScore() {
        
        return 0.0;
    }
    
    // Returns the user's name
    public String getName() {
        return this.name;
    }
    
    // Returns the user's email
    public String getEmail() {
        return this.email;
    }
    
    // Returns the user's ID
    public long getID() {
        return this.ID;
    }
    
    // Returns the user's answers
    // NOTE: This is subject to change depending on the matching attribute
    public ArrayList<Integer> getAnswers() {
        return this.answers;
    }
    
    // Sets the user's name
    public void setName(String name) {
        this.name = name;
    }
    
    // Sets the user's email
    public void setEmail(String email) {
        this.email = email;
    }
}
