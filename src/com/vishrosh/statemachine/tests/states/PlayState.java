package com.vishrosh.statemachine.tests.states;

import com.vishrosh.statemachine.core.GameState;
import com.vishrosh.statemachine.core.State;

public class PlayState extends GameState {

	public PlayState() {
		super(State.Game);
	}

	@Override
	public void onLoad() {
		System.out.println("[Game] Loading...");
	}

	@Override
	public void update(double deltaTime) {
		System.out.println("[Game] Updating...");
	}

	@Override
	public void render(double deltaTime) {
		System.out.println("[Game] Rendering...");
	}

	@Override
	public void onExit() {
		System.out.println("[Game] Exiting...");
	}

}
