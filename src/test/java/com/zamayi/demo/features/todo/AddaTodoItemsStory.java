package com.zamayi.demo.features.todo;

import com.zamayi.demo.tasks.AddTodoItems;
import com.zamayi.demo.tasks.StartWith;
import com.zamayi.demo.tasks.TheTodoItems;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.hasItem;

/**
 * Created by cleophas on 2018/02/28.
 */

@RunWith(SerenityRunner.class)
public class AddaTodoItemsStory {

    Actor ben = Actor.named("Ben");

    @Managed
    WebDriver hisBrowser;

    @Before
    public void openTodoPage() {
        ben.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void should_add_a_todo_items() {

        // given
        givenThat(ben).wasAbleTo(StartWith.emptyTodoList());

        // when
        when(ben).attemptsTo(AddTodoItems.called("My very best"));

        // then
        then(ben).should(seeThat(TheTodoItems.displayed(), hasItem("My very best")));
    }

}
