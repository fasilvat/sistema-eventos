package br.edu.sistemaeventos.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FelipeFAST
 */
public class Resultado extends EntidadeDominio {
    
    private List<EntidadeDominio> entidades;
    private List<String> mensagem;
    
    public Resultado() {
	
	entidades = new ArrayList<>();
	mensagem = new ArrayList<>();
    }

    public List<EntidadeDominio> getEntidades() {
	return entidades;
    }

    public List<String> getMensagem() {
	return mensagem;
    }

    public void setEntidades(List<EntidadeDominio> entidades) {
	this.entidades = entidades;
    }

    public void setMensagem(List<String> mensagem) {
	this.mensagem = mensagem;
    }
    
    
}
