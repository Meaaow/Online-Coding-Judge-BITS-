/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author vAibHav
 */
public class ProblemClass {
    int problem_id;
    String title;
    String problem_link;
    String sample_link;
    String testcase_link;
    session S;
    
    //initialising the variables of ProblemClass by retrieving data from the DB
    public void addProblem(int i,session S1){
        System.out.println(i);
        problem_id = i;
        String P_ID = (String) Integer.toString(problem_id);
        S = S1;
        try{
            String str = "Select*from system.Bits_problem where problem_id=?";
                PreparedStatement stmt1 = S.getConnection().prepareStatement(str);
                stmt1.setString(1, P_ID);     //compare with Serial 

                //executing the statement
                ResultSet res = stmt1.executeQuery();
                res.next();
                title = res.getString("title");
                problem_link = res.getString("problem_link");
                sample_link = res.getString("sample_link");
                testcase_link = res.getString("testcase_link");
                System.out.println(i+" "+title+" "+problem_link);
                //closing the statement
                stmt1.close();
                
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("exception ^");
            }
    }
    
    public String retrieveProblem(){
        return problem_link;
    }
    
    public String retrieveSample(){
        return sample_link;
    }
    public String getTitle(){
        return title;
    }
}
