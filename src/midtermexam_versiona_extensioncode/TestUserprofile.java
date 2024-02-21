/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Sim Yuan Hee
 * February 21 2024
 */
public class TestUserprofile {
    public static void main(String[] args)
    {
        System.out.println("Please enter new username");
        Scanner keyboard = new Scanner(System.in);
        String givenID = keyboard.nextLine();
        keyboard.close();
        
        System.out.println("Please choose your favorite genre");
        System.out.println("\"Comedy\", \"Drama\", \"Action\", \"Mystery\"");
        
        String givenGenre = keyboard.nextLine();
        keyboard.close();
     
        UserProfile userprofile1 = new UserProfile(givenID, givenGenre);
        
        System.out.println("User Profile Created");
    }
}
