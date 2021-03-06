package pl.sda.git.impl;

import pl.sda.git.Action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ShowTimeOrDateAction implements Action {
    public String doIt(List<String> actionInput) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        if (actionInput.size() > 5) {
            return sdf.format(date);
        }
        sdf = new SimpleDateFormat("d.MM.yyyy");
        return sdf.format(date);
    }
}