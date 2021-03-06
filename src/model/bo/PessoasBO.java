package model.bo;

import model.dao.PessoaDAO;
import model.vo.PessoaVO;

public class PessoasBO {

	public String cadastrarPessoa(PessoaVO pessoaVO) {
	PessoaDAO pessoaDAO = new PessoaDAO();
	if(pessoaDAO.verificarPessoa()) {
		return "\n Pessoa já Cadastrada!";
	}
	return "\n Pessoa cadastrada com sucesso!";
	}
}
