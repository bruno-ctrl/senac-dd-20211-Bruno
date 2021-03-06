package controller;

import model.bo.PessoasBO;
import model.vo.PessoaVO;

public class ControladoraPessoa {

	public String cadastrarPessoas(PessoaVO pessoaVO) {
		PessoasBO pessoaBO = new PessoasBO();
		return 	pessoaBO.cadastrarPessoa(pessoaVO);
	}

}
