package it.dstech.formazione.modello;

import java.util.ArrayList;

public class Risultato {
	int paroleTot;
	int parolePalindrome;
	ArrayList<String> parole;

	public Risultato() {
		this.parole = new ArrayList<String>();
	}

	public int getParoleTot() {
		return paroleTot;
	}

	public void setParoleTot(int paroleTot) {
		this.paroleTot = paroleTot;
	}

	public int getParolePalindrome() {
		return parolePalindrome;
	}

	public void setParolePalindrome(int parolePalindrome) {
		this.parolePalindrome = parolePalindrome;
	}

	public ArrayList<String> getParole() {
		return parole;
	}

	public void setParole(ArrayList<String> parole) {
		this.parole = parole;
	}

}
