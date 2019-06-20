package src;

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

import src.field.Field;

public class MainApplication extends Application {
	
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;
	
	Group root;
	Canvas canvas;
	Scene scene;
	GraphicsContext gc;
	AnimateObjects animate;
	
	public static void main(String[] args) {
		launch();
	}
	
	public void start(Stage stage) { 
		stage.setTitle("Turn-based Takeover Beta v1.0");
		root = new Group();
		canvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
		root.getChildren().add(canvas);
		scene = new Scene(root);
		stage.setScene(scene);
		
		gc = canvas.getGraphicsContext2D();
		
		animate = new AnimateObjects();
		animate.start();
		
		stage.show();
	}
	
	public class AnimateObjects extends AnimationTimer {
		public void handle(long now) {
			Field field = new Field(gc);
			field.draw();
		}
	}
}