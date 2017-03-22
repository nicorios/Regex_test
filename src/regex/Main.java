/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;

/**
 *
 * @author Envy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Try considering the names
//            Mathias d'Arras
//            Martin Luther King, Jr.
//            Hector Sausage-Hausen

        Scanner scanner = new Scanner(System.in);
        String input;
        String regex_name="^([A-Z]+[a-z ]+)([A-Z]*[a-z ',.-]+)*([A-Z]*[a-z .-]+)+$";
        do{
            input = scanner.nextLine();
            System.out.println(input.matches(regex_name));
                    
            
            
        }while(true);
        
    }
    
}
