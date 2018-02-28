package com.zamayi.demo.tasks;

import com.zamayi.demo.ui.TodoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Created by cleophas on 2018/02/28.
 */
public class StartWith implements Task {

    private TodoHomePage todoHomePage;

    public static Performable emptyTodoList() {
        return instrumented(StartWith.class);
    }

    @Override
    @Step("{0} starts with an empty todo list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(todoHomePage));
    }
}
