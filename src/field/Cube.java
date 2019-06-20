package src.field;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.*;
import javafx.scene.media.AudioClip;
import java.net.URL;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.text.*;

import java.io.File;

public class Cube extends FieldElement {
	
	public static final String GREEN_RES = "img\\green_cube.png";
	public static final String ORANGE_RES = "img\\orange_cube.png";
	public static final String PURPLE_RES = "img\\purple_cube.png";
	
	private int color;
	//0 = green
	//1 = orange
	//2 = purple
	
	public Cube(int x, int y, String color) {
		super(x, y);
		this.setImg(new Image(GREEN_RES));
		switch(color.toUpperCase()) {
			case "GREEN":
				this.color = 0;
				this.setImg(new Image(GREEN_RES));
				break;
			case "ORANGE":
				this.color = 1;
				this.setImg(new Image(ORANGE_RES));
				break;
			case "PURPLE":
				this.color = 2;
				this.setImg(new Image(PURPLE_RES));
				break;
		} 
	}
}