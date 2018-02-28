package com.zamayi.demo.model;

import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by cleophas on 2018/02/28.
 */
public class TodoList {
    public static final Target WHAT_NEEDS_TO_BE_DONE = Target.the("'What todo?' field").locatedBy("#new-todo");
    public static final Target ITEMS = Target
            .the("'Todo list items' field").locatedBy(".view label");
}
