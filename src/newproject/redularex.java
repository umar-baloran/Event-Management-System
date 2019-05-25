/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import java.util.regex.*;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class redularex {
    
public String regularex(String name,String txt){
    
   
    Pattern p=Pattern.compile(name);
    Matcher m=p.matcher(txt);
   if(m.matches()){
       
    return "Valid";   
   } 
   return "Invalid";
}

private String userIDPattern = "^[1-9]{1}[0-9]{3}$";
    private String namePattern = "[a-zA-Z\\s.]{3,60}";
    private String agePattern = "[1-9]{1}[0-9]{1}";
    private String emailPattern = "[a-z0-9_.]{6,60}@[a-z0-9]{4,10}.[a-z.]{2,3}";
    private String passwordPattern = "[0-9a-zA-Z\\s]{6,30}";
    private String titlePattern = "^[A-Za-z\\s]{3,100}$";
    private String timePattern = "^[0-2]{1}[0-9]{1}:[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}$";
    private String desPattern = "^[A-Za-z\\s_.0-9#]{0,200}$";
    private String eventIdPattern = "^[0-9]{1,4}$";
    
    public String getUserID()
    {
        return userIDPattern;
    }
    
    public String getName()
    {
        return namePattern;
    }
    
    public String getAge()
    {
        return agePattern;
    }
    
    public String getEmail()
    {
        return emailPattern;
    }
    
    public String getPassword()
    {
        return passwordPattern;
    }
    
    public String getTitle()
    {
        return titlePattern;
    }
    
    public String getTime()
    {
        return timePattern;
    }
    
    public String getDes()
    {
        return desPattern;
    }
    
    public String getEventID()
    {
        return eventIdPattern;
    }


  
    }
    
       




