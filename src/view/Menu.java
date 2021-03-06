package view;

import java.util.Scanner;

public class Menu {
	
	Scanner teclado = new Scanner(System.in);
	
	private  static final int OPCAO_CADASTRAR_PESSOA = 1;
	private  static final int OPCAO_CADASTRAR_VACINA = 2;
	private  static final int OPCAO_SAIR = 3;
	
	
	public void apresentarMenu() {
		
	int opcao = this.apresentarOpcoesMenu();
		
		while(opcao != OPCAO_SAIR) {
			
			switch(opcao) {
			
			case OPCAO_CADASTRAR_PESSOA:{
			 MenuPessoa menuPessoa = new MenuPessoa();
			 menuPessoa.apresentarMenuPessoa();
			 break;	
			}
			case OPCAO_CADASTRAR_VACINA:{
			MenuVacina menuVacina = new MenuVacina();
			menuVacina.apresentarMenuVacina();
			break;
			}
			}
			
			opcao = this.apresentarOpcoesMenu();
		}
		
	}


	private int apresentarOpcoesMenu() {
		System.out.println("Controles de vacinas da Covid-19");
		System.out.println("Opções :");
		System.out.println(OPCAO_CADASTRAR_PESSOA + " - Opção menu pessoas : ");
		System.out.println(OPCAO_CADASTRAR_VACINA + " - Opção menu vacinas : ");
		System.out.println(OPCAO_SAIR + " - Sair ");
		System.out.println("Digite a opção :");
		return Integer.parseInt(teclado.nextLine());
		
	}

}
