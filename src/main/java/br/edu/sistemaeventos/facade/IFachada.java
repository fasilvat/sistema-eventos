package br.edu.sistemaeventos.facade;

import org.springframework.stereotype.Service;

import br.edu.sistemaeventos.entidade.EntidadeDominio;
import br.edu.sistemaeventos.entidade.Resultado;

@Service
public interface IFachada {
    
    public Resultado salvar(EntidadeDominio entidade);
    public Resultado mostrar(EntidadeDominio entidade);
    public Resultado listar(EntidadeDominio entidade);
    public Resultado alterar(EntidadeDominio entidade);
    public Resultado excluir(EntidadeDominio entidade);
    public Resultado criar(EntidadeDominio entidade);
    
}
