package fr.ambulR.controller;

import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controler_pagecontactus {

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String pagecontactus() {
		return "page_contactus";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public String pagecontactusPOST(@RequestParam(value = "mail", required = true) String from2,
			@RequestParam(value = "message", required = true) String texte_mail) throws AddressException, MessagingException {

		String smtpHost = "smtp.gmail.com";
	    String from = "ambulr13@gmail.com";
	    String to = "ambulr13@gmail.com";
	    
	    String les_infos = "Mail : " + from2 + "\n\n" + texte_mail;
	    
	    String username = "ambulr13@gmail.com";
	    String password = "rootroot";
	 
	    Properties props = new Properties();
	    props.put("mail.smtp.host", smtpHost);
	    props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
	 
	    Session session = Session.getDefaultInstance(props);
	    session.setDebug(true);
	 
	    MimeMessage message = new MimeMessage(session);   
	    message.setFrom(new InternetAddress(from));
	    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	    message.setSubject("Contact");
	    message.setText(les_infos);
	 
	    Transport tr = session.getTransport("smtp");
	    tr.connect(smtpHost, username, password);
	    message.saveChanges();
	 
	    tr.sendMessage(message,message.getAllRecipients());
	    tr.close();

		return "page_contactus";
	}

}
