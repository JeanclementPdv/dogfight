package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	private IOrderPerformer orderPerformer;

	public EventPerformer(IOrderPerformer orderPerformer){
		this.orderPerformer = orderPerformer;
	}

	@Override
	public void eventPerform(KeyEvent keyCode) {
		
		keyCodeToUserOrder(keyCode.getKeyCode());
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode){
		
		switch (keyCode){
		
			case KeyEvent.VK_DOWN:
				return new UserOrder(1, Order.DOWN); 
				
			case KeyEvent.VK_UP:
				return new UserOrder(1, Order.UP);
			
			case KeyEvent.VK_RIGHT:
				return new UserOrder(1, Order.RIGHT); 
			
			case KeyEvent.VK_LEFT:
				return new UserOrder(1, Order.LEFT); 
		}
		return null;
		
		
	}
}
