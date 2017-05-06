package presentation;

import java.io.File;

public class Lanceur {

	public static void main(String[] args) {
		
		// Définition du répertoire
		String rep = "c:/";
		// Pointage vers ce répertoire
		File f = new File(rep);
		
		if (f.exists())
		{
			//System.out.println(rep+ "existe");
			//Création d'un tableau "contenu" listant les noms des fichiers ou répertoires contenus dans le répertoire rep
			String[] contenu = f.list();
			for(int i =0; i<contenu.length; i++)
			{
				File f2 = new File(rep,contenu[i]);
				if(f2.isDirectory())
				{
					System.out.println("REPERTOIRE : "+ contenu[i]);
				}
				else {
					System.out.println("FICHIER : " + contenu[i] + " TAILLE : " + f2.length()/1024 + " Ko");
				}
			}
		}

		else{
			System.out.println(rep+ "n'existe pas");
		}
		
	}

}