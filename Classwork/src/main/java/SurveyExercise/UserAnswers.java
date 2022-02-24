/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurveyExercise;

/**
 *
 * @author rominalodolo
 */
public class UserAnswers {

    private int userID;
    private String email;
    private String fullName;
    private boolean gender;
    private String occupation;

    public UserAnswers(int userID, String email, String fullName, boolean gender, String occupation) {
        this.userID = userID;
        this.email = email;
        this.fullName = fullName;
        this.gender = gender;
        this.occupation = occupation;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'F') {
            this.gender = true;
        } else {
            this.gender = false;
        }
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String print() {
        return "User ID Number: " + userID + \n +
               "User Email: " + email + \n + 
               "User Name and Surname: " + fullName + \n  + 
               "Gender M or F: " + gender + \n  + 
               "What is your Occupation: " + occupation + \n;
    }
}
