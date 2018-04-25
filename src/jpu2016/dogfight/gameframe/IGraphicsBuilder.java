package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
	public static void applyModelToGraphic (Graphics graphic, ImageObserver observer) {}
	public static int getGlobalWidth() {
		return 1;
	}
	public static int getGlobalHeight() {
		return 1;
	}
}
 