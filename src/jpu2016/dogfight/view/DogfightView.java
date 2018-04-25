package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements Runnable {
	
	public String message;
	
	public DogfightView (DogfightController dogfightController, IDogfightModel dogfightModel, DogfightModel dogfightModel2 ) {}
	public void run () {}
	public void displayMessage(String message) {
		System.out.println(message);
	}
	public void closeall() {}
}
 