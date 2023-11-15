
/*
 * Classes statiques de fonctions JAVA
 * à utiliser avec l'exemple WD Appels JAVA
 * 
 */

import javax.swing.*;
import java.util.Date;

public class Fonction {
	public static String jvDebug()
	{
		
		return "PCSDEBUG";
		
	}

	public static void jvInfo(String szMessage)
	{
		JOptionPane.showMessageDialog(null, szMessage, "jvInfo", JOptionPane.INFORMATION_MESSAGE);
	}

	public static String jvDateDuJour()
	{
		// Initialise une chaine pour recevoir la date formatée
		String szDate = "";
		
		// Initialise une date
		Date ddDate = new Date();
		
		// Récupère la date
		szDate = ddDate.toLocaleString().substring(0, 12);
				
		return szDate;
	}
	
	public static String jvMaintenant()
	{
		// Initialise une chaine pour recevoir la date formatée
		String szDate = "";
		
		// Initialise une date
		Date ddDate = new Date();
		
		// Récupère la date
		szDate = ddDate.toLocaleString().substring(13);
				
		return szDate;	
	}

}
