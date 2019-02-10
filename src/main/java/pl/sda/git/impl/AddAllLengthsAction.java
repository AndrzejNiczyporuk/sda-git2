package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class AddAllLengthsAction implements Action {
    public String doIt(List<String> actionInput) {
        long sum = actionInput.stream()
                .mapToLong(String::length)
                .sum();
        return String.valueOf(sum);
    }
}