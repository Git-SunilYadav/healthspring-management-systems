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
import javax.swing.JOptionPane;

/**
 *
 * @author nikhi
 */
public class EmailSender {
 
    private String to; //  = "nikhilkohli1992@gmail.com"; // sender email 
    private String from; // = "nikhilkohli1992@gmail.com"; // receiver email 
    private String host = "smtp.gmail.com"; 
    private String subject_mail;
    MimeMessage message;
    private String mail_body;

    public EmailSender(String fromMail, String toMail,String subject_mail, String mail_body) {
        this.to = toMail;
        this.from = fromMail;
        this.subject_mail = subject_mail;
        this.mail_body = mail_body;
       
}
    
    public void sendMail(){
         Properties defaultProps = System.getProperties(); 
        defaultProps.setProperty("mail.smtp.host", host);
       //added 
        defaultProps.setProperty("mail.smtp.gmail", host);
       
        defaultProps.setProperty("mail.smtp.port", "587");
        defaultProps.setProperty("mail.user", from);
        defaultProps.setProperty("mail.password", "lifeisadream");
        defaultProps.setProperty("mail.smtp.starttls.enable", "true");
        defaultProps.setProperty("mail.smtp.auth", "true");

//Session session = Session.getDefaultInstance(props,null);
    Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("nikhilkohli1992@gmail.com", "lifeisadream");
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
         String file = "N:/healthspring-management-systems/HealthSpring/file.txt";
        String filename = "file.txt";
        DataSource source = new FileDataSource(file);
        messageBodyPart.setDataHandler(new  DataHandler(source));
        messageBodyPart.setFileName(file);
        multipart.addBodyPart(textBodyPart);

        multipart.addBodyPart(messageBodyPart);

        // Send the complete message parts
        message.setContent(multipart, "text/html");
    // actual mail body
   // message.setContent(mail_body, "text/html; charset=utf-8");
    // Send message 
        
        Transport transport = session.getTransport("smtp");
    transport.connect(host, from, "lifeisadream");
    transport.sendMessage(message, message.getAllRecipients()); 
    System.out.println("Email Sent successfully...."); 
    transport.close();
    } 
    catch (Exception e)
    { 
        e.printStackTrace();
    }


    }
}