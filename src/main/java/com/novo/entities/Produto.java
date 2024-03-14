package com.novo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produto")
public class Produto {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id", nullable = false)
	 private Integer id;
	 
	 @Column(name = "descricao", nullable = false, length = 100)
	 private String descricao;
	 
	 @Column(name = "nome", nullable = false, length = 100)
	 private String nome;
	 
	 @Column(name = "preco", nullable = false, precision = 10, scale = 2)
	 private double preco;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_itemVenda", nullable = false)
	 private ItemVenda itemVenda;
}
