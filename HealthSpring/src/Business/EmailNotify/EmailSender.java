package Business.EmailNotify;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message; 
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author nikhi
 */

public class EmailSender {
 
    private String to; //  =  sender email 
    private String from = "kohli789n@gmail.com";   // receiver email 
    private String host = "smtp.gmail.com"; 
    private String subject_mail;
    MimeMessage message;
    private String mail_body;
    private String file_name;
    public EmailSender( String toMail,String subject_mail, String mail_body, String file_name) {
        this.to = toMail;
        this.subject_mail = subject_mail;
        this.mail_body = mail_body;
        this.file_name = file_name;
       
}
    
    public void sendMail(){
         Properties defaultProps = System.getProperties(); 
        defaultProps.setProperty("mail.smtp.host", host);
       //added 
        defaultProps.setProperty("mail.smtp.gmail", host);
       
        defaultProps.setProperty("mail.smtp.port", "587");
        defaultProps.setProperty("mail.user", from);
        defaultProps.setProperty("mail.password", "States*2018");
        defaultProps.setProperty("mail.smtp.starttls.enable", "true");
        defaultProps.setProperty("mail.smtp.auth", "true");

//Session session = Session.getDefaultInstance(props,null);
    Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("kohli789n@gmail.com", "States*2018");
            }
        };
    Session session = Session.getDefaultInstance(defaultProps,auth); // default session // default session 
    try
    {
    message = new MimeMessage(session); // email message 
    message.setFrom(new InternetAddress(from)); // setting header fields 
    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); 
    message.setSubject(subject_mail); // subject line 
    
    
    // Create the message part
        MimeBodyPart textBodyPart = new MimeBodyPart();
        // Now set the actual message
        textBodyPart.setText(mail_body);


        // Create a multipar message
        Multipart multipart = new MimeMultipart();

        // Set text message part
        
        // Part two is attachment
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        //N:/healthspring-management-systems/HealthSpring/
        
        String filename = file_name;
        DataSource source = new FileDataSource(filename);
        messageBodyPart.setDataHandler(new  DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(textBodyPart);

        multipart.addBodyPart(messageBodyPart);

        // Send the complete message parts
        message.setContent(multipart);
    // actual mail body
   // message.setContent(mail_body, "text/html; charset=utf-8");
    // Send message 
        
    Transport transport = session.getTransport("smtp");
    transport.connect(host, to, "States*2018");
    transport.sendMessage(message, message.getAllRecipients()); 
    System.out.println("Email Sent successfully...."); 
    //transport.close();
    } 
    catch (Exception e)
    { 
        e.printStackTrace();
    }


    }
}