package pl.sda.git.impl;

import pl.sda.git.Action;

import java.util.List;

public class ExceptionIf4Action implements Action {
    public String doIt(List<String> actionInput) {
        if (actionInput.size() > 3) {
            throw new RuntimeException("Wyrzucam wyjątek!");
        }
        return "";
    }
}