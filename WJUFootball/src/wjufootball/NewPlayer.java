package wjufootball;

import java.util.ArrayList;

/**
 *
 * @author Zachcollins
 */
public class NewPlayer {

    ArrayList<PlayerInfo> fb = new ArrayList<>();//creates my team array

   

    public void addPlayer(PlayerInfo n) {
        if (fb.isEmpty()) { //if my array is empty add a player
            fb.add(n);
        } else {    //if not 
            for (int i = 0; i < fb.size(); i++) {   //check my array for whats in there
                if (fb.get(i).getID() > n.getID()) {    //adds the player and place them in order after the other
                    fb.add(i, n);
                    return;
                }
            }
            fb.add(n);//adds the team
        }

    }

    public PlayerInfo search(int n) { //searches for the team in the data base
        for (int i = 0; i < fb.size(); i++) {   //checks my whole array for that team
            if (fb.get(i).getID() == n) {   //if ID matches the one searched it will display it
                return fb.get(i);
                
            }
        }
        return null;

    }

    public boolean deletion(int id) {   //deletes team outta the data base
        for(int i = 0; i<fb.size();i++){    //searches my whole array
            if(fb.get(i).getID()==id){  //once it finds the ID that matches
                fb.remove(i);   //itll remove it from the data base
                return true;
            }
        }
        return false;   //If number does not add up then it will return false meaning it doesnt exist
    }


    public String display() {   //Displays the teams so that you can see the teams in the data base
        String temp = " ";   //creates a temporary value
        for (int i = 0; i < fb.size(); i++) {
            temp += fb.get(i) + "\n ";  //puts in the temporary value so it wont retrun an error and adds the teams thats been put in
        }
       
        return temp;    //if nothings has been put in yet itll return the message
    }

}
