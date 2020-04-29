package com.vishrosh.statemachine.core;

public class GameStateManager {
	
	private State currentState;
	
	private State nextState;
	
	private double deltaTime;
	
	public GameStateManager() {
		this.setCurrentState(State.Start);
		this.nextState = null;
		this.deltaTime = 4.0;
	}
	
	public void loadCurrentState() {
		GameStateRegistry.getRegistry().getRegisteredGameState(this.getCurrentState()).onLoad();
	}
	
	public void updateCurrentState(double delateTime) {
		GameStateRegistry.getRegistry().getRegisteredGameState(this.getCurrentState()).update(deltaTime);
	}
	
	public void renderCurrentState() {
		GameStateRegistry.getRegistry().getRegisteredGameState(this.getCurrentState()).render(this.deltaTime);
	}
	
	public void exitCurrentState(boolean loadNextState) {
		GameStateRegistry.getRegistry().getRegisteredGameState(this.getCurrentState()).onExit();
		if(this.nextState != null && loadNextState)this.setCurrentState(this.nextState);
	}
	
	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		if(this.getCurrentState() == currentState)return;
		this.currentState = currentState;
	}

	public State getNextState() {
		return nextState;
	}
	
	public void loadNextState() {
		
	}

	public void setNextState(State nextState) {
		if(this.getNextState() == nextState)return;
		this.nextState = nextState;
	}
	
	
}
