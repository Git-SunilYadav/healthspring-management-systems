/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utility;

// Author: Sunil M. Yadav

import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {
    public String dateFormat = "MM-dd-yyyy";
    // function to parse int
    public boolean tryParseInt(String value) {  
     try {  
         Integer.parseInt(value);  
         return true;  
      } catch (NumberFormatException e) {  
         return false;  
      }}
     
    // function to parse double
     public boolean tryParseDouble(String value) {  
     try {  
         Double.parseDouble(value);  
         return true;  
      } catch (NumberFormatException e) {  
         return false;  
      }
     }
     
     // parse string to date
     public boolean tryParseDate(String value){
         try {  
             new SimpleDateFormat(dateFormat).parse(value);
         return true;  
      } catch (Exception e) {  
         return false;  
      }
     }
     
     public boolean tryParseLong(String value){
         try {  
             Long.parseLong(value);
         return true;  
      } catch (Exception e) {  
         return false;  
      }
     }
     
    // regex pattern for email.
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    // fucntion to check for the valid email address.
    public static boolean validateEmail(String emailStr) {
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
            return matcher.find();
    }
}
