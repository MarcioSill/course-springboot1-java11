package com.educandomarcio.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	//acessando o code
	public int getCode() {
		return code;
	}
	//percorrendo  orderStatus e verifica se o code pedido corresponde ao enums 
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		
		
		//caso não encontrado o code informado melo metodo ele retorna a excessão
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
