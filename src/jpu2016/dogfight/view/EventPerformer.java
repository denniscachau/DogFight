package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.*;

public abstract class EventPerformer implements IOrderPerformer {

	public EventPerformer (IOrderPerformer orderPerformer){}
	public void EventPerform (KeyEvent keyCode) {}
	private UserOrder CodetoUserOrder (int KeyCode) {}
	
}
 