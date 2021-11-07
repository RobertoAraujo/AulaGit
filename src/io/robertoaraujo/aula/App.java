package io.robertoaraujo.aula;

import java.util.InputMismatchException;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(validaCpf("058.790.072-28"));	
	}

	public static boolean validaCpf(String cpf) {
		cpf = removeMascara(cpf);
		if (validaCaracteres(cpf) && quantidade(cpf) && validarRegra(cpf)) {
			return true;
		}
		return false;
	}

	public static String removeMascara(String cpf) {
		return cpf.replace(".", "").replace("-", "");
	}

	static boolean validaCaracteres(String cpf) {
		return cpf.matches("[0-9]+");
	}

	public static boolean quantidade(String cpf) {
		if (cpf.length() == 11)
			return true;
		return false;
	}

	public static boolean validarRegra(String cpf) {
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999"))
			return false;
		try {
			char dig10 = calcularDig10(cpf);
			char dig11 = calcularDig11(cpf);
			if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
				return true;
			}
			return false;
		} catch (InputMismatchException e) {
			return false;
		}
	}

	private static char calcularDig10(String cpf) {
		int sm, i, r, num, peso;
		sm = 0;
		peso = 10;
		for (i = 0; i < 9; i++) {
			num = (int) (cpf.charAt(i) - 48);
			sm = sm + (num * peso);
			peso = peso - 1;
		}
		r = 11 - (sm % 11);
		if ((r == 10) || (r == 11))
			return '0';
		return (char) (r + 48);
	}

	private static char calcularDig11(String cpf) {
		int sm, i, r, num, peso;
		sm = 0;
		peso = 11;
		for (i = 0; i < 10; i++) {
			num = (int) (cpf.charAt(i) - 48);
			sm = sm + (num * peso);
			peso = peso - 1;
		}
		r = 11 - (sm % 11);
		if ((r == 10) || (r == 11))
			return '0';
		return (char) (r + 48);
	}
}
