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
public class Survey {
    public static void main(String[] args) {
        userAnswers user01 = new userAnswers (01, "Sallywalker@iggy.com", "Sally Walker", 'F', "Street Performer");
        userAnswers user02 = new userAnswers (02, "Saidthesky@universalStudios.com", "Trevor Christensen", 'M', "Producer");
        userAnswers user03 = new userAnswers (03, "Popculture@musicawards.co.za", "Trever Music", 'M', "Record Lable");

        System.out.println(user01.print());
        System.out.println(user02.print());
        System.out.println(user03.print());
        
    }
}
