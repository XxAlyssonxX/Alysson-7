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
@Table (name = "venda")
public class Venda {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id", nullable = false)
	 private Integer id;
	 
	 @Column(name = "datavenda", nullable = false, precision = 10, scale = 2)
	 private int datavenda;
	 
	 @Column(name = "cliente_id", nullable = false, precision = 10, scale = 2)
	 private BigInteger cliente_id;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_cliente", nullable = false)
	 private Cliente cliente;
	
}