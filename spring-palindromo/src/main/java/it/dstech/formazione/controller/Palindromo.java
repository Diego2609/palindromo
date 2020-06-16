package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.formazione.modello.Risultato;

@Controller
public class Palindromo {

	@RequestMapping("/palindromo")
	public ModelAndView printPalindromo(@RequestParam("testo") String testo, Model model) {
		int palindrome = 0;
		Risultato risultato = new Risultato();
		String[] parole = testo.split(" ");
		for (String string : parole) {
			if (palindroma(string)) {
				palindrome++;
				risultato.getParole().add(string);
			}
		}
		risultato.setParoleTot(parole.length);
		risultato.setParolePalindrome(palindrome);
		return new ModelAndView("frase", "risultato", risultato);
	}

	private static boolean palindroma(String frase) {
		int l = frase.length();
		if (l < 2) {
			return true;
		} else {
			if (!frase.substring(0, 1).equals(frase.substring(l - 1, l))) {
				return false;
			} else {
				return palindroma(frase.substring(1, l - 1));
			}
		}
	}
}
