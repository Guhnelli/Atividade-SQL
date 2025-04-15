package com.AtiviSQL.ManyToone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Item venda")

public class itemVenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int quantidade;
	private double valor;
	
	@ManyToOne
	@JoinColumn(name = "id_venda" , nullable = false)
	private vendas Vendas;
	
	@ManyToOne
	@JoinColumn(name = "id_produto" , nullable = false)
	private produto Produto;

}
