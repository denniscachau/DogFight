package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
	
	private int player;
	private Order order;
	
	public UserOrder(int player, Order order) {
		this.setPlayer(player);
		this.setOrder(order);
	}

	public Order getOrder() {
		return new Order;
	}

	public int getPlayer() {
		return 1;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void setPlayer(int player) {
		this.player = player;
	} 
	
}
