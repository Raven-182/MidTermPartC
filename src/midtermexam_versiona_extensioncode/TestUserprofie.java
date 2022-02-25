/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author raven
 * midterm
 */
public class TestUserprofie {
   
    public static void main(String[] args){
        String name;
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a genre from the list: ");
        for(int i = 0; i < genres.length;i++){
            System.out.println(i + " " + genres[i]);
        }
        String genre = scan.nextLine();
        UserProfile user = new UserProfile("User1", genre);
        System.out.println("User profile has been created!!");
          
    }

    
}
