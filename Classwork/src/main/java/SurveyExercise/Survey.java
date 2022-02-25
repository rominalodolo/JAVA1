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
        UserAnswers user01 = new UserAnswers (01, "Sallywalker@iggy.com", "Sally Walker", 'F', "Street Performer");
        UserAnswers user02 = new UserAnswers (02, "Saidthesky@universalStudios.com", "Trevor Christensen", 'M', "Producer");
        UserAnswers user03 = new UserAnswers (03, "Popculture@musicawards.co.za", "Trever Music", 'M', "Record Lable");
        UserAnswers user04 = new UserAnswers (04, "HappyDay@singlesclubmail.com", "Hector Steve", 'M');
        
        System.out.println(user01.print());
        System.out.println(user02.print());
        System.out.println(user03.print());
        System.out.println(user04.print());
        
    }
}
