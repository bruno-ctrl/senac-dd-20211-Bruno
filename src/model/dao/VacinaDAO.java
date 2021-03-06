package model.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import model.vo.VacinaVO;

public class VacinaDAO {

	public boolean verificarCadastro() {
	
		return false;
	}

	public ArrayList<VacinaVO> relatorioVacinaDAO() {
		ArrayList<VacinaVO> lista = new ArrayList<VacinaVO>();
		
		VacinaVO vacina1 = new VacinaVO(1,"SINOVAC","BRASIL",1,LocalDate.now(),"Bruno");
		VacinaVO vacina2 = new VacinaVO(2,"CORONAVAC","CHINA",3,LocalDate.now(),"Nathan");
		VacinaVO vacina3 = new VacinaVO(3,"SPUTINIK","RUSSIA",3,LocalDate.now(),"Matheus");
		lista.add(vacina1);
		lista.add(vacina2);
		lista.add(vacina3);
		return lista;
	}

}
