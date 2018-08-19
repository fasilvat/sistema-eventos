package br.edu.sistemaeventos.dao;

import java.util.List;

import br.edu.sistemaeventos.entidade.EntidadeDominio;

public interface IDAO {
    
    public EntidadeDominio salvar(EntidadeDominio entidade);
    public List<EntidadeDominio> listar(EntidadeDominio entidade);
    public EntidadeDominio atualizar(EntidadeDominio entidade);
    public EntidadeDominio excluir(Integer id);
    
}
