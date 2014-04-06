package view;

import java.awt.Canvas;

import javax.swing.JFrame;

import viking.input.InputManager;
import viking.input.core.BasicInputManager;

@SuppressWarnings("serial")
public class Window extends JFrame {
	private InputManager inputManager;
	private Canvas gameField;

	public Window() {
		inputManager = new BasicInputManager();
		this.addKeyListener(inputManager);
		
		this.setVisible(true);
	}
}
