package br.edu.sistemaeventos.command;

import br.edu.sistemaeventos.entidade.EntidadeDominio;
import br.edu.sistemaeventos.entidade.Resultado;
import br.edu.sistemaeventos.facade.Fachada;
import br.edu.sistemaeventos.facade.IFachada;

public interface ICommand {
 
    IFachada fachada = new Fachada();
    
    public Resultado executar(EntidadeDominio entidade);
    
}
