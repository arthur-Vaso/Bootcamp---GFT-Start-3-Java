package com.dio.base;

import java.math.BigDecimal;

/**
 * 
 * @author arthur
 * @version 1.0.0
 * @see BigDecimal
 * @since release 1.0.0
 */

public class Order {
	private final String code;
	private final BigDecimal totalValue;

	/**
	 * Construtor da classe pedido
	 * 
	 * @param code 			código do pedido
	 * @param totalValue	valor total do pedido
	 */
	public Order(String code, BigDecimal totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}

	/**
	 * Calcula as taxa de acordo com o valor do pedido. Se o valor for maior que 100, uma taxa será cobrada
	 * 
	 * @return						valor total do pedido com as taxas
	 * @throws RuntimeException		se o pedido for negativo
	 */
	public BigDecimal calculateFee() throws RuntimeException {
		if(this.totalValue.signum() < 0) {
			System.out.println("teste");
			throw new RuntimeException("O pedido não pode ter valor negativo.");
		}
		if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100) {
			System.out.println("teste");
			return this.totalValue.multiply(new BigDecimal("0.99"));
		}
		System.out.println("teste");
		return this.totalValue;
	}
	/*
	@Override
    public String toString() {
            return "Order={" + "code='" + code + "' | Valor=R$ " + totalValue + "}";
    }*/
}
