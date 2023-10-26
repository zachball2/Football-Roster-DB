package wjufootball;

/**
 *
 * @author Zachcollins
 */
public class PlayerInfo {

    private int id;   //creates my int for the ID's of the team
    private String playerName;    //creates string for the schools name
    private int playerNumber; //creates string for the city of the school
    private String playerPosition;    //creates a String for the teams name

    public PlayerInfo(int i, String pn, int n, String pp) {
        id = i;       //puts my values into the football team being created
        playerName = pn;
        playerNumber = n;
        playerPosition = pp;
    }

    public int getID() {
        return id;    //gets the Players Id that the user has entered
    }

    public String getPlayerName() {
        return playerName;    //gets the Players name that the user has entered 
    }

    public int getPlayerNumber() {
        return playerNumber;    //gets the Players number
    }

    public String getPlayerPositon() {
        return playerPosition;       //gets the Players position
    }

    public String toString() {
        return ("Player ID: " + id + "\t|Players Name: "
                + playerName + "\t|Players Number: " + playerNumber + "\t|Players Position: " + playerPosition); //creates the list and the order that the values that I have gotten from my users to be put in and viewd
    }

}
