package Main.java.dao;

import javax.persistence.EntityManager;

import Main.java.restauranteEntidade.Cardapio;

public class CardapioDao {
	private EntityManager entityManager;
	
	public CardapioDao(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	//CRUD C = Create, R = Read, U = Update, D = Delete 
	
	public void cadastrar(Cardapio cardapio) {
		this.entityManager.persist(cardapio);
		System.out.println("Cadastrado: " + cardapio);
		
	}
	
	public Cardapio consultar(final Integer id) {
		return this.entityManager.find(Cardapio.class, id);
		
	}
	
	public void atualizar(final Cardapio cardapio) {
		this.entityManager.merge(cardapio);
		
	}
	
	public void excluir(final Cardapio cardapio) {
		this.entityManager.remove(cardapio);
	}

}
