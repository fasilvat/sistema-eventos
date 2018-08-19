package br.edu.sistemaeventos.command;

import br.edu.sistemaeventos.entidade.EntidadeDominio;
import br.edu.sistemaeventos.entidade.Resultado;

/**
 *
 * @author FelipeFAST
 */
public class AlterarCommand extends AbstractCommand {

    @Override
    public Resultado executar(EntidadeDominio entidade) {
	return fachada.alterar(entidade);
    }    
    
}
