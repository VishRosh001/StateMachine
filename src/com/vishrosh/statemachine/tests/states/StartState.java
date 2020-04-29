package com.vishrosh.statemachine.tests.states;

import com.vishrosh.statemachine.core.GameState;
import com.vishrosh.statemachine.core.State;

public class StartState extends GameState{

	public StartState() {
		super(State.Start);
	}
	
	@Override
	public void onLoad() {
		System.out.println("[Start] Loading...");
	}
	
	@Override
	public void update(double deltaTime) {
		System.out.println("[Start] updating...");
	}
	
	@Override
	public void render(double deltaTime) {
		System.out.println("[Start] Rendering...");
	}

	@Override
	public void onExit() {	
		System.out.println("[Start] Exiting...");
	}

}
