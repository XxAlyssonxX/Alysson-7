package com.novo.entities;

import java.math.BigInteger;

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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "itemVenda")
public class ItemVenda{

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id", nullable = false)
	 private Integer id;
	 
	 @Column(name = "quantidade", nullable = false, precision = 10, scale = 2)
	 private int quantidade;
	 
	 @Column(name = "valorUni", nullable = false, precision = 10, scale = 2)
	 private double valorUni;
	 
	 @Column(name = "produto_id", nullable = false, precision = 10, scale = 2)
	 private BigInteger produto_id;
	 
	 @Column(name = "venda_id", nullable = false, precision = 10, scale = 2)
	 private BigInteger venda_id;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_venda", nullable = false)
	 private Venda venda;
	
}