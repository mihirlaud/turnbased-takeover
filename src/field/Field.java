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

import java.util.ArrayList;

public class Field {

	public static final double FIELD_X = 0;
	public static final double FIELD_Y = 0;
	public static final double FIELD_LENGTH = 600;
	
	public ArrayList<FieldElement> elements;

	private GraphicsContext gc;
	
	public Field(GraphicsContext gc) {
		this.gc = gc;
		elements = new ArrayList<>();
		
		elements.add(new Cube(0, 0, "green"));
		elements.add(new Cube(100, 100, "orange"));
		elements.add(new Cube(200, 200, "purple"));
	}
	
	public void draw() {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if((i + j) % 2 == 0)
					gc.setFill(Color.web("#A0A0A0"));
				else
					gc.setFill(Color.web("#7D7D7D"));
				gc.fillRect(FIELD_X + i * FIELD_LENGTH / 6, FIELD_Y + j * FIELD_LENGTH / 6, FIELD_LENGTH / 6, FIELD_LENGTH / 6);
			}
		}
		
		gc.setFill(Color.web("#ce1616"));
		gc.fillRect(FIELD_X + FIELD_LENGTH / 6, FIELD_Y, FIELD_LENGTH / 6, FIELD_LENGTH / 6);
		gc.fillRect(FIELD_X, FIELD_Y + FIELD_LENGTH / 6, FIELD_LENGTH / 6, FIELD_LENGTH / 6);
		
		gc.setFill(Color.web("#152bce"));
		gc.fillRect(FIELD_X + 4 * FIELD_LENGTH / 6, FIELD_Y, FIELD_LENGTH / 6, FIELD_LENGTH / 6);
		gc.fillRect(FIELD_X + 5 * FIELD_LENGTH / 6, FIELD_Y + FIELD_LENGTH / 6, FIELD_LENGTH / 6, FIELD_LENGTH / 6);
		
		
		for(FieldElement element : elements)
			element.draw(gc);
	}
	

}