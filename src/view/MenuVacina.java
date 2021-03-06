package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import controller.ControladoraVacina;
import model.vo.VacinaVO;

public class MenuVacina {

	Scanner teclado = new Scanner(System.in);
	DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static final int CADASTRAR_VACINAS = 1;
	public static final int RELATORIO_VACINAS = 2;
	public static final int TERMINAR_SESSAO = 3;
	public static final int OPCAO_MENU_CADASTRO_VACINAS = 1;
	public static final int OPCAO_MENU_RELATORIO_VACINAS = 2;
	public static final int OPCAO_SAIR = 3;

	
	public void apresentarMenuVacina() {
	
		int opcao = this.opcaoVacina();
		
		while(opcao != TERMINAR_SESSAO) {
			switch(opcao) {
			case CADASTRAR_VACINAS:{
				this.cadastrarVacinas();
				break;
			}
			case RELATORIO_VACINAS:{
				this.relatorioVacinas();
				break;
			}
			}
			opcao = this.opcaoVacina();
		}
		
	}


	private void relatorioVacinas() {
		ControladoraVacina controladoraVacina = new ControladoraVacina();
		
		ArrayList<VacinaVO> relatorioVacinaVO = controladoraVacina.relatorioVacina();
		System.out.print("\n----------- RESULTADO RELATÓRIO ----------");
		System.out.printf("\n%1s   %10s    %6s    %10s    %10s  %10s\n",
				"IDVACINA", "NOME VACINA","PAÍS","ESTAGIO", "DATA INICIO","NOME PESQUIDADOR");
		for(int i = 0; i < relatorioVacinaVO.size(); i++) {
			relatorioVacinaVO.get(i).imprimir();
		}
	}


	private void cadastrarVacinas() {
		VacinaVO vacinaVO = new VacinaVO(); 
		
		System.out.println("Digite o nome da vacina :");
		vacinaVO.setNomeVacina(teclado.nextLine());
		
		System.out.println("Digite o nome do Pesquisador :");
		vacinaVO.setNomePesquisador(teclado.nextLine());
		
		System.out.println("Digite o país que está desenvolvendo :");
		vacinaVO.setPais(teclado.nextLine());
		
		System.out.println("Digite o estágio :");
		vacinaVO.setEstagio(Integer.parseInt(teclado.nextLine()));
		
		System.out.println("Digite a data de inicio :");
		vacinaVO.setDataInicio(LocalDate.parse(teclado.nextLine(),dataFormatter));
		
		ControladoraVacina controladoraVacina = new ControladoraVacina();
		String informacao = controladoraVacina.cadastroVacina(vacinaVO);
		System.out.println(informacao);
		
	}


	private int opcaoVacina() {
		System.out.println("\nOpções menu vacinas ");
		System.out.println(OPCAO_MENU_CADASTRO_VACINAS +  " - Cadastrar vacina");
		System.out.println(OPCAO_MENU_RELATORIO_VACINAS + " - Relatórios das Vacinas");
		System.out.println(OPCAO_SAIR + "- Sair");
		return Integer.parseInt(teclado.nextLine());
	}

}
