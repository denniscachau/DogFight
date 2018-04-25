package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;

public class DogfightController {
	static int TIME_SLEEP = 30;
	private IDogfightModel dogfightModel;
	private Object ViewSystem;
	
	public DogfightController(IDogfightModel dogfightModel) {
		 this.setDogfightModel(dogfightModel);
	}
	
	public void orderPerform(UserOrder userOrder) {
		
	}
	
	public void play() {
		
	}
	
	public void setViewSystem(Object ViewSystem) {
		this.ViewSystem = ViewSystem;
	}
	
	private void launchMissile(int player) {
		
	}
	
	private void gameLoop() {
		
	}

	public IDogfightModel getDogfightModel() {
		return dogfightModel;
	}

	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
		
	
}
