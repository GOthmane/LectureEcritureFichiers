package presentation;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("banque.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// readObject lit le premier objet puis passe au suivant
		
		/*Compte c1 = (Compte) ois.readObject();
		Compte c2 = (Compte) ois.readObject();
		
		System.out.println(c1);
		System.out.println(c2);*/
		
		
		Compte c = new Compte();
		
		try {
		while(true)
		{
			c = (Compte) ois.readObject();
			System.out.println(c);
		}
		} catch (EOFException e) {
			System.out.println("Fin du fichier");
		}
		ois.close();
		fis.close();
	}

}
