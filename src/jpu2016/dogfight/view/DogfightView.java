package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements Runnable {
	
	public String message;
	
	public DogfightView (IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable ) {}
	public void run () {}
	public void displayMessage(String message) {
		System.out.println(message);
	}
	public void closeall() {}
}
 