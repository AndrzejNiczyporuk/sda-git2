package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;
import java.util.stream.Collectors;

public class AddNameAction implements Action {
	@Override
	public String doIt(List<String> actionInput) {
		return actionInput.stream()
				.map(x-> new StringBuilder(x).append(System.getProperty("user.name")))
				.collect(Collectors.joining());
		
	}
}
