package package1;

import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
  
public class FirstMail {  
 public static void main(String[] args) {  
   
  final String user="shashi.bvv0@gmai.com";//change accordingly  
  final String password="9504609774";//change accordingly  
    
  String to="shashi.bvv@gmail.com";//change accordingly  
  
   //Get the session object  
   Properties props = new Properties();  
   props.put("mail.smtp.host","localhost");  
   props.put("mail.smtp.auth", "true");
   props.put("mail.smtp.starttls.required","true");
   props.put("mail.smtp.starttls.enable","true");
   
   props.put("mail.smtp.starttls.enable","true");
   props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		   props.put("mail.smtp.socketFactory.fallback","false");
		   props.put("mail.smtp.socketFactory.port","465");

     
   Session session = Session.getDefaultInstance(props,  
    new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  
  
   //Compose the message  
    try {  
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("javatpoint");  
     message.setText("This is simple program of sending email using JavaMail API");  
       
    //send the message  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
   
     } catch (MessagingException e) {e.printStackTrace();}  
 }  
}  