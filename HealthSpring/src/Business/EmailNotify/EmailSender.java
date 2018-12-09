/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package Business.EmailNotify;
import java.util.Properties;
import javax.mail.Message; 
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author nikhi
 
public class EmailSender {
 
    String to = "nikhilkohli1992@gmail.com"; // sender email 
    String from = "sender@abc.com"; // receiver email 
    String host = "127.0.0.1"; 
    MimeMessage message;

    public EmailSender() {
        
        Properties properties = System.getProperties(); 
    properties.setProperty("mail.smtp.host", host); 
    //Properties props = new Properties();
properties.put("mail.smtp.port","425");

//Session session = Session.getDefaultInstance(props,null);

    Session session = Session.getDefaultInstance(properties,null); // default session // default session 
    try
    {
     message = new MimeMessage(session); // email message 
    message.setFrom(new InternetAddress(from)); // setting header fields 
    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); 
    message.setSubject("Test Mail from Java Program"); // subject line 
// actual mail body
    message.setText("You can send mail from Java program by using mail API, but you need" + "couple of more JAR files e.g. smtp.jar and activation.jar"); 
// Send message 
    Transport.send(message); 
    System.out.println("Email Sent successfully...."); 
} 
catch (MessagingException mex)
{ 
    mex.printStackTrace();
}


}
}

*/