package br.edu.sistemaeventos.facade;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.edu.sistemaeventos.dao.IDAO;
import br.edu.sistemaeventos.entidade.EntidadeDominio;
import br.edu.sistemaeventos.entidade.Resultado;

@Service
public class Fachada implements IFachada {

	Resultado resultado;
    
    Map<String, JpaRepository<EntidadeDominio, Integer>> daos;
    //Map<String, Map<String, List<IStrategy>>> rnsEntidades;

    final String SALVAR = "SALVAR";
    final String LISTAR = "LISTAR";
    final String ALTERAR = "ALTERAR";
    final String EXCLUIR = "EXCLUIR";
    final String CRIAR = "CRIAR";
	
	@Override
	public Resultado salvar(EntidadeDominio entidade) {
		
		this.resultado = new Resultado();
		
		JpaRepository dao = daos.get(entidade.getClass().getSimpleName());
		
		return (Resultado) dao.saveAndFlush(entidade);
	}
	
	@Override
	public Resultado mostrar(EntidadeDominio entidade) {
		// TODO: Implementar da forma correta
		
		this.resultado = new Resultado();
		
		JpaRepository dao = daos.get(entidade.getClass().getSimpleName());
		
		 return resultado;
	}

	@Override
	public Resultado listar(EntidadeDominio entidade) {
		
		this.resultado = new Resultado();
		
		JpaRepository dao = daos.get(entidade.getClass().getSimpleName());
	
		return (Resultado) dao.findAll();
	}

	@Override
	public Resultado alterar(EntidadeDominio entidade) {
		
		this.resultado = new Resultado();
		
		JpaRepository dao = daos.get(entidade.getClass().getSimpleName());
		
		return (Resultado) dao.saveAndFlush(entidade);
	}

	@Override
	public Resultado excluir(EntidadeDominio entidade) {
		
		this.resultado = new Resultado();
		
		JpaRepository dao = daos.get(entidade.getClass().getSimpleName());
		
		return (Resultado) dao.saveAndFlush(entidade);
	}

	@Override
	public Resultado criar(EntidadeDominio entidade) {
		
		this.resultado = new Resultado();
		
		JpaRepository dao = daos.get(entidade.getClass().getSimpleName());
		
		dao.delete(entidade.id);
		
		return resultado;
	}
    
}
