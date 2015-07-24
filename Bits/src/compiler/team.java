/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiler;

/**
 *
 * @author vAibHav
 */

//NOT USED ANYWHERE FOR NOW
public class team {
    String teamname;
    String password;
    int score;
    String startTime;
    session S1;
    
    public team(String teamname,String password){
        this.teamname = teamname;
        this.password = password;
        score = 0;
        startTime = "0";
    }
}
