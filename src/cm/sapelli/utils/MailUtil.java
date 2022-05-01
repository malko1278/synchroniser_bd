/**
 * 
 */
package cm.sapelli.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author Franck Armel Malko
 *
 */
public class MailUtil {
	// private final static String MAILER_VERSION = "Java";
	private final static String MAIL_SERVER_SMTP = "mail.cnps.cm";
	private final static int MAIL_PORT_SMTP = 25;
	private final static String MAIL_USER = "armel.abena@cnps.cm";
	private final static String MAIL_PASSWORD = "Franck_Malko1278s";
	/**
	 * 
	 */
	public MailUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param destinataire
	 * @param sujet
	 * @param message
	 */
	public static void sendEmail(String destinataire, String sujet, String message) {
		// Récupération des propriétés du Serveur SMTP
		Properties properties = new Properties();
		properties.put("mail.smtp.host", MAIL_SERVER_SMTP);
		properties.put("mail.smtp.port", MAIL_PORT_SMTP);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		// Création d'un authentificateur pour la session qui sera créée
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(MAIL_USER, MAIL_PASSWORD);
			}
		};

		// Sréation d'une Session, avec ajout de l'authentificateur créé
		Session session = Session.getInstance(properties, auth);

		// Création du conteneur du message qui sera envoyé
		Message msg = new MimeMessage(session);

		// Attachement du message et des autres informations au conteneur
		try {
			msg.setFrom(new InternetAddress(MAIL_USER));
			InternetAddress[] toAddresses = {new InternetAddress(destinataire), new InternetAddress(MAIL_USER)};
			msg.setRecipients(Message.RecipientType.TO, toAddresses);
	    	// Ajout du Sujet au message
			msg.setSubject(sujet);
	    	// Ajout d'une date au message
			msg.setSentDate(new Date());
	    	// Ajout du Text au message
			msg.setText(message);

			// Envoi de l'email
			Transport.send(msg);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}