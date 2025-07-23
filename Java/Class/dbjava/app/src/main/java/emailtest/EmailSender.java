// package emailtest;

// import jakarta.mail.*;
// import jakarta.mail.internet.InternetAddress;
// import jakarta.mail.internet.MimeMessage;

// import java.util.Properties;

// public class EmailSender {
//     public static void main(String[] args) {
//         // Recipient's email ID needs to be mentioned.
//         String to = "poudelbimochan2060@gmail.com";

//         // Sender's email ID needs to be mentioned
//         String from = "bimochanpoudel2060@gmail.com";

//         // Assuming you are sending email from Gmail's SMTP server
//         String host = "smtp.gmail.com"; // For Gmail

//         // Get system properties
//         Properties properties = System.getProperties();

//         // Setup mail server
//         properties.put("mail.smtp.host", host);
//         properties.put("mail.smtp.port", "587"); // TLS port
//         properties.put("mail.smtp.auth", "true");
//         properties.put("mail.smtp.starttls.enable", "true"); // Enable TLS

//         // Get the default Session object.
//         Session session = Session.getInstance(properties, new Authenticator() {
//             protected PasswordAuthentication getPasswordAuthentication() {
//                 // Replace "your_email_password" with your actual email password or app password
//                 // For Gmail, if you have 2-Step Verification enabled, you'll need to use an
//                 // "App Password".
//                 return new PasswordAuthentication(from, "lrnx cldo nykk uild");
//             }
//         });

//         try {
//             // Create a default MimeMessage object.
//             MimeMessage message = new MimeMessage(session);

//             // Set From: header field of the header.
//             message.setFrom(new InternetAddress(from));

//             // Set To: header field of the header.
//             message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

//             // Set Subject: header field
//             message.setSubject("This is the Subject Line!");

//             // Now set the actual message
//             message.setText("This is actual message");

//             System.out.println("Sending...");
//             // Send message
//             Transport.send(message);
//             System.out.println("Sent message successfully....");
//         } catch (MessagingException mex) {
//             mex.printStackTrace();
//         }
//     }
// }
