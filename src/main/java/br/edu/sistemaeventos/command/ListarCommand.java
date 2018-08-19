package br.edu.sistemaeventos.command;

import br.edu.sistemaeventos.entidade.EntidadeDominio;
import br.edu.sistemaeventos.entidade.Resultado;

public class ListarCommand extends AbstractCommand {

    @Override
    public Resultado executar(EntidadeDominio entidade) {
    	return fachada.listar(entidade);
    }
    
}
