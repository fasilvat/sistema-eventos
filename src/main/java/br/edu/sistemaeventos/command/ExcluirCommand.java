package br.edu.sistemaeventos.command;

import br.edu.sistemaeventos.entidade.EntidadeDominio;
import br.edu.sistemaeventos.entidade.Resultado;

public class ExcluirCommand extends AbstractCommand {

    @Override
    public Resultado executar(EntidadeDominio entidade) {
    	return fachada.excluir(entidade);
    }
    
}
