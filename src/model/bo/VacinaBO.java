package model.bo;

import model.dao.VacinaDAO;
import model.vo.VacinaVO;
import java.util.ArrayList;

public class VacinaBO{

	public String cadastrarVacina(VacinaVO vacinaVO) {
		VacinaDAO vacinaDAO = new VacinaDAO();
		if(vacinaDAO.verificarCadastro()) {
			return "\nVacina já Cadastrada!";
		}
		return "\nVacina Cadastrada com sucesso";
	}

	public ArrayList<VacinaVO> relatorioVacinaBO() {
		VacinaDAO vacinaDAO = new VacinaDAO();
		return vacinaDAO.relatorioVacinaDAO();
	}
	
}