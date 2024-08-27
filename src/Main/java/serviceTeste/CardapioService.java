package Main.java.serviceTeste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import Main.java.dao.CardapioDao;
import Main.java.restauranteEntidade.Cardapio;
import Main.java.util.JPAUtil;

public class CardapioService {

	public static void main(String[] args) {
		Cardapio risoto = new Cardapio();
		risoto.setNome("Risoto de carne");
		risoto.setDescricao("E isso");
		risoto.setDisponivel(true);
		risoto.setValor(BigDecimal.valueOf(88.88));
		
		Cardapio arroz = new Cardapio();
		arroz.setNome("arroz de carne");
		arroz.setDescricao("arroz com carne isso");
		arroz.setDisponivel(true);
		arroz.setValor(BigDecimal.valueOf(80.88));
		
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		CardapioDao pratodao = new CardapioDao(entityManager);
		entityManager.getTransaction().begin();
		pratodao.cadastrar(risoto);
		entityManager.flush();
		pratodao.cadastrar(arroz);
		entityManager.flush();
		
		System.out.println("Prato: " + pratodao.consultar(2));
		
		pratodao.excluir(arroz);
		System.out.println("Prato: " + pratodao.consultar(2));
		
		entityManager.clear();
		
		risoto.setValor(BigDecimal.valueOf(70.00));
		
		pratodao.atualizar(risoto);
		
		System.out.println("Prato: " + pratodao.consultar(1));
	}

}

