package utils;
 
import java.io.File;
import java.util.Properties;
 
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
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
 
public class SendEmail {
 
    public static void sendMail() {
 
        // Create object of Property file
        Properties props = new Properties();
 
        // this will set host of server- you can change based on your requirement
        props.put("mail.smtp.host", "smtp.gmail.com");
 
        // set the port of socket factory
        props.put("mail.smtp.socketFactory.port", "465");
 
        // set socket factory
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
 
        // set the authentication to true
        props.put("mail.smtp.auth", "true");
 
        // set the port of SMTP server
        props.put("mail.smtp.port", "465");
 
        // This will handle the complete authentication
        Session session = Session.getDefaultInstance(props,
 
                new javax.mail.Authenticator() {
 
                    protected PasswordAuthentication getPasswordAuthentication() {
 
                        return new PasswordAuthentication("halogen.club@gmail.com", "wlmu ngrt slog sltx");
                    }
 
                });
 
        try {
 
            // Create object of MimeMessage class
            Message message = new MimeMessage(session);
 
            // Set the from address
            message.setFrom(new InternetAddress("halogen.club@gmail.com"));
 
            // Set the recipient address
            String emailRecipients = "rijusonic@gmail.com, valuramt@gmail.com, soumalya2807@gmail.com, gauravingole2000@gmail.com, hritikbansode2000@gmail.com, prathameshsonawane5760@gmail.com";
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailRecipients));
            
            // Add the subject link
            message.setSubject("PolicyBazaar Test Report");
 
            // Create object to add multimedia type content
            BodyPart messageBodyPart1 = new MimeBodyPart();
 
            // Set the body of email
            messageBodyPart1.setText("PFA");
 
            // Create another object to add another content
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();
 
            // Mention the file which you want to send
            String filename = getLastModified(System.getProperty("user.dir")+"/reports");
 
            // Create data source and pass the filename
            DataSource source = new FileDataSource(filename);
 
            // set the handler
            messageBodyPart2.setDataHandler(new DataHandler(source));
 
            // set the file
            messageBodyPart2.setFileName("PolicyBazaar Test Report.html");
 
            // Create object of MimeMultipart class
            Multipart multipart = new MimeMultipart();
 
            // add body part 1
            multipart.addBodyPart(messageBodyPart2);
 
            // add body part 2
            multipart.addBodyPart(messageBodyPart1);
 
            // set the content
            message.setContent(multipart);
 
            // finally send the email
            Transport.send(message);
 
        } catch (MessagingException e) {
 
            throw new RuntimeException(e);
 
        }
 
    }
 
    public static String getLastModified(String directoryFilePath) {
        File directory = new File(directoryFilePath);
        File[] files = directory.listFiles(File::isFile);
        long lastModifiedTime = Long.MIN_VALUE;
        File chosenFile = null;
 
        if (files != null) {
            for (File file : files) {
                if (file.lastModified() > lastModifiedTime) {
                    chosenFile = file;
                    lastModifiedTime = file.lastModified();
                }
            }
        }
        if(chosenFile != null)
            return chosenFile.getAbsolutePath();
        return "";
    }
 
}
 