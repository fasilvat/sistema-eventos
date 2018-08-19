package br.edu.sistemaeventos.command;

import br.edu.sistemaeventos.facade.Fachada;
import br.edu.sistemaeventos.facade.IFachada;

public abstract class AbstractCommand implements ICommand {
    
    protected IFachada fachada;
    
    public AbstractCommand() {
    	fachada = new Fachada();
    }
    
}
