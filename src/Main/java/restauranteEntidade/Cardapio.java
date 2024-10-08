package Main.java.restauranteEntidade;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cardapio")
public class Cardapio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;
	private Boolean disponivel;
	private BigDecimal valor;
	private Categoria categoria;
	
	@Column(name = "data_de_registro")
	private LocalDateTime dataDeRegistro = LocalDateTime.now();
	
	
	public Cardapio() {
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Boolean getDisponivel() {
		return disponivel;
	}


	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public LocalDateTime getDataDeRegistro() {
		return dataDeRegistro;
	}


	public void setDataDeRegistro(LocalDateTime dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}


	@Override
	public String toString() {
		return "Prato [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", disponivel=" + disponivel
				+ ", valor=" + valor + ", dataDeRegistro=" + dataDeRegistro + "]";
	}
	
	
	
	
	
}