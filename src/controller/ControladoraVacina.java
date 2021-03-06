package controller;

import model.bo.VacinaBO;
import model.vo.VacinaVO;
import java.util.ArrayList;

public class ControladoraVacina {

	public String cadastroVacina(VacinaVO vacinaVO) {
		VacinaBO vacinaBO = new VacinaBO();
		return vacinaBO.cadastrarVacina(vacinaVO);
		
	}

	public ArrayList<VacinaVO> relatorioVacina() {
		VacinaBO vacinaBO = new VacinaBO();
		return vacinaBO.relatorioVacinaBO();
	}

}
