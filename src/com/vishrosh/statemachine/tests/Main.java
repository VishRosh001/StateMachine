package com.vishrosh.statemachine.tests;

import com.vishrosh.statemachine.core.GameStateManager;
import com.vishrosh.statemachine.core.GameStateRegistry;
import com.vishrosh.statemachine.core.State;
import com.vishrosh.statemachine.tests.states.PlayState;
import com.vishrosh.statemachine.tests.states.StartState;

public class Main {

	public static void main(String[] args) {
		GameStateRegistry.getRegistry().registerGameState(new StartState());
		GameStateRegistry.getRegistry().registerGameState(new StartState());
		GameStateRegistry.getRegistry().registerGameState(new PlayState());
		GameStateRegistry.getRegistry().registerGameState(new PlayState());
		
		System.out.println(GameStateRegistry.getRegistry().getRegisteredStates().toString());
		
		GameStateManager a = new GameStateManager();
		a.loadCurrentState();
		a.updateCurrentState(3);
		a.renderCurrentState();
		a.exitCurrentState(false);
		
		a.setNextState(State.Game);
		
		//a.setCurrentState(State.Game);
		a.loadCurrentState();
		a.updateCurrentState(3);
		a.renderCurrentState();

	}

}
