package com.zamayi.demo.tasks;

import com.zamayi.demo.model.TodoList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

/**
 * Created by cleophas on 2018/02/28.
 */
public class TheTodoItems implements Question<List<String>> {

    public static Question<List<String>> displayed() {
        return new TheTodoItems();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(TodoList.ITEMS)
                .viewedBy(actor)
                .asList();
    }
}
