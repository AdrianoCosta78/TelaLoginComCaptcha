package gerandoCaptcha;

import java.util.Random;
import java.util.Scanner;

public class Captcha {
   
	
	
	public String gerandoCaptcha() {
		char  dados [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				   'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				   '1','2','3','4','5','6','7','8','9','0','@','$','%','&','#'};
		
		char indice[] = new char [6];
		
		Random rand = new Random();
		
		for(int i = 0; i < (indice.length); i++) {
			int ran = rand.nextInt(dados.length);
			indice[i] = dados[ran];
		}
		
		return new String(indice);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Captcha c = new Captcha();
		
		//System.out.println(c.gerandoCaptcha());
		String captchaTeste = c.gerandoCaptcha();
		
		System.out.println("Captcha: "+ captchaTeste);
		System.out.println("");
		

		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		

		System.out.print("Digite sua senha: ");
		String senha = sc.nextLine();
		
		System.out.print("Digite o código captcha acima: ");
		String codCaptcha = sc.nextLine();
		
		if(nome.equalsIgnoreCase("Adriano") && (senha.equalsIgnoreCase("1234")) && (codCaptcha.equals(captchaTeste))){
			System.out.println("");
			System.out.println("Acesso liberado!");
			System.out.println("");
			System.out.println("Seja bem vindo Patrão Bruce!");
		}else {
			System.out.println("acesso negado!");
		}
		
	
		
		sc.close();
	}
	
}
