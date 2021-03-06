package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controller.ControladoraPessoa;
import model.vo.PessoaVO;

public class MenuPessoa {
	
	Scanner teclado = new Scanner(System.in);
	DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static final int CADASTRAR_PESSOAS = 1;
	public static final int TERMINAR_CADASTRO = 2;
	public static final int OPCAO_MENU_CADASTRO_PESSOAS = 1;
	public static final int OPCAO_SAIR = 2;

	public void apresentarMenuPessoa() {
		
		int opcao = this.opcaoPessoas();
		
		while(opcao != TERMINAR_CADASTRO){
			
		switch(opcao) {
		case CADASTRAR_PESSOAS:{
			this.cadastrarPessoas();
			break;
		}
		default:{
			System.out.println("Opção inválida!");
			break;
		}
		}
		opcao = this.opcaoPessoas();
		}
	}

	private void cadastrarPessoas() {
		PessoaVO pessoaVO = new PessoaVO();
		
		System.out.println("Digite seu nome :");
		pessoaVO.setNome(teclado.nextLine());
		
		System.out.println("Digite a data de nascimento(dd/mm/yy) :");
		pessoaVO.setDataNascimento(LocalDate.parse(teclado.nextLine(),dataFormatter));
		
		System.out.println("Digite o seu Sexo (M)MASCULINO (F)FEMININO (OUTRO)DIGITE :");
		pessoaVO.setSexo(teclado.nextLine());
		
		System.out.println("Digite o seu CPF :");
		pessoaVO.setCPF(teclado.nextLine());
		
		System.out.println("Digite o tipo de pessoa ((1)Pesquisadores (2)Voluntários (3)Público em Geral) :");
		pessoaVO.setTipoPessoa(Integer.parseInt(teclado.nextLine()));
		
		System.out.println("Digite o nivel de Satisfação com a vacina :");
		pessoaVO.setAvaliacaoVacina(Integer.parseInt(teclado.nextLine()));
		
		ControladoraPessoa controladoraPessoa = new ControladoraPessoa();
		String informacao = controladoraPessoa.cadastrarPessoas(pessoaVO);
		System.out.println(informacao);
	}

	private int opcaoPessoas() {
		System.out.println("Opções menu pessoas ");
		System.out.println(OPCAO_MENU_CADASTRO_PESSOAS + " - Cadastrar pessoas");
		System.out.println(OPCAO_SAIR + "- Sair");
		return Integer.parseInt(teclado.nextLine());
	}

}
