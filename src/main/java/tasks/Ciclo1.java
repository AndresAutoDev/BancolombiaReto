package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static userInterface.Ciclo1Page.*;

public class Ciclo1 implements Task {

    private final List<String> checkboxValues;

    public Ciclo1(List<String> checkboxValues) {
        this.checkboxValues = checkboxValues;
    }

    public static Performable withValues(List<String> checkboxValues) {
        return new Ciclo1(checkboxValues);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        checkboxValues.forEach(value ->
                actor.attemptsTo(
                        Click.on("//input[@name='checkbox' and @value='" + value + "']")
                )
        );
    }

}
