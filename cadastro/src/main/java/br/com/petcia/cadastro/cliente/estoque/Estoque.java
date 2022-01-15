package br.com.petcia.cadastro.cliente.estoque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estoque")
public class Estoque {
		
		@Id
		private int id;
		@Column
		private String cod;
		@Column
		private String quantEstoque;
		@Column
		private String nome;
		@Column
		private String valorUnitario;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCod() {
			return cod;
		}
		public void setCod(String cod) {
			this.cod = cod;
		}
		public String getQuantEstoque() {
			return quantEstoque;
		}
		public void setQuantEstoque(String quantEstoque) {
			this.quantEstoque = quantEstoque;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getValorUnitario() {
			return valorUnitario;
		}
		public void setValorUnitario(String valorUnitario) {
			this.valorUnitario = valorUnitario;
		}
		
		
		
}

