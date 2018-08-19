package br.edu.sistemaeventos.strategy;

import br.edu.sistemaeventos.entidade.EntidadeDominio;
import br.edu.sistemaeventos.entidade.Resultado;

public interface IStrategy<T extends EntidadeDominio> {
 
    public Resultado processar(T entidade, Resultado resultado);
    
}
