package com.zamayi.demo.tasks;

import com.zamayi.demo.model.TodoList;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

/**
 * Created by cleophas on 2018/02/28.
 */
public class AddTodoItems implements Task {

    private String itemToAdd;

    public AddTodoItems(String itemToAdd) {
        this.itemToAdd = itemToAdd;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter
                .theValue(itemToAdd)
                .into(TodoList.WHAT_NEEDS_TO_BE_DONE)
                .thenHit(Keys.RETURN));
    }

    public static Performable called(String itemToAdd) {
        return Instrumented.instanceOf(AddTodoItems.class)
                .withProperties(itemToAdd);
    }
}
