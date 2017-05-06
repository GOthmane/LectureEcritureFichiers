package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		
		// cryptage
		File f1 = new File("fichier1.txt");
		FileReader fr1 = new FileReader(f1);
		
		File f2 = new File("fichier2.txt");
		FileWriter fw2 = new FileWriter(f2);
		
		int c;
		// fr.read() renvoie les caractères en ASCII (binaire) d'un fichier fw, un par un
		// -1 représente la fin d'un fichier en ASCII
		// fw.write(int c) écrit le caractère c dans le fichier fw sous la forme d'un caractère
		
		// boucle de cryptage
		while((c=fr1.read())!=-1)
		{
			//pour ecrire
			//fw.write(c);
			// pour crypter
			fw2.write(c+1);
		}
		
		// ATTENTION A BIEN FERMER LES FILEREADER ET FILEWRITER POUR LIBERER LES FICHIERS .TXT
		fr1.close();
		fw2.close();
		
		// decryptage
		File f3 = new File("fichier2.txt");
		FileReader fr3 = new FileReader(f3);
		
		File f4 = new File("fichier3.txt");
		FileWriter fw4 = new FileWriter(f4);
		
		int a;
		
		// boucle de decryptage
		while((a=fr3.read())!=-1)
		{
			//pour ecrire
			//fw.write(c);
			// pour crypter
			fw4.write(a-1);
		}
		
		fr3.close();
		fw4.close();

	}

}
