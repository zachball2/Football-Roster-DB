package wjufootball;

import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class WJUFootball {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Welcome to my database program that allow you to:"
                + "\n   -Add"
                + "\n   -Delete"
                + "\n   -Modify"
                + "\n   -Search for a Player"
                + "\n   -Display the Player(s)");

        JOptionPane.showMessageDialog(null, "By: Zach Collins"
                + "\nCSC 222"
                + "\nProf: Plunkett"); //welcome message
        String name = JOptionPane.showInputDialog("Whats you name?");
        NewPlayer fb = new NewPlayer();//Creates my player in my main

        String playAgain = "y"; //button to keep going

        while (playAgain.equalsIgnoreCase("Y")) { //While loop for the main program

            String menu = JOptionPane.showInputDialog("Type: "
                    + "\n(A) to add a player"
                    + "\n(R) to remove a player"
                    + "\n(S) to search for a player"
                    + "\n(D) to display a player(s)"); //the menu tht allows you to access these methods from a user interface

            if (menu.equalsIgnoreCase("A")) {   //Adding a new player
                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Whats the players ID??")); //the int used for the players Id
                String playerName = JOptionPane.showInputDialog(null, "Whats the name of the player??");    //String used to get the players name
                int playerNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "What's the players number??"));   //String used for the players jersey number
                String playerPosition = JOptionPane.showInputDialog(null, "What's the players position?");   //String used to determine the players position

                
                PlayerInfo temp = new PlayerInfo(id, playerName, playerNumber, playerPosition);    //The order that the football temas stuff is listed in

                fb.addPlayer(temp);//so it adds it to the team

            }

            if (menu.equalsIgnoreCase("R")) {   //removing a player
                int num = Integer.parseInt(JOptionPane.showInputDialog("What player ID do you want to remove?"));
                //number that the user wants to remove from the list
                fb.deletion(num);//removing that player

            }
            if (menu.equalsIgnoreCase("S")) { //searching for a player
                int numm = Integer.parseInt(JOptionPane.showInputDialog("Whats the ID of that player"));
                //int that the user wants to use to search the player
                JOptionPane.showMessageDialog(null, fb.search(numm)); //find the player within the database
            }
            if (menu.equalsIgnoreCase("D")) {   //Displaying all of the player

                JOptionPane.showMessageDialog(null, fb.display()); //Diplays players on a JOp

            }

            String c1 = "y";    //creates string
            c1.equalsIgnoreCase("y"); //puts string to work
            playAgain = JOptionPane.showInputDialog("Would you like to continue"
                    + "\nYES|Y|"
                    + "\nNO|N|");   //do you want to keep going

        }
        JOptionPane.showMessageDialog(null, "Thanks for using my database "+ name + " !");//Exit Message
        JOptionPane.showMessageDialog(null, "I hope youre enjoying retirment!");

    }
}
