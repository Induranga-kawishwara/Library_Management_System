/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class Validations {
    
    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
    public boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^[0-9]{10}$"; 
        return phoneNumber.matches(phoneRegex);
    }
    public boolean isValidDateFormat(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);

        try {
            sdf.parse(dateStr);
            return true; 
        } catch (ParseException e) {
             return false; 
         }
    }
}
