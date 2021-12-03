package com.drpicox.game.testSteps.entities;

import com.drpicox.game.testPost.reader.PostLine;
import com.drpicox.game.testSteps.AbstractPostLineStep;
import com.drpicox.game.testSteps.components.resourceds.ResourcedTestView;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static com.google.common.truth.Truth.assertThat;

@Component
public class TheIconIsInTheStep extends AbstractPostLineStep {

    private final ResourcedTestView  resourcedTestView;

    public TheIconIsInTheStep(EntityTestView entityTestView, ResourcedTestView resourcedTestView) {
        this.resourcedTestView = resourcedTestView;
    }

    @Override
    protected String getRegex() {
        return "The \"([^\"]+)\" icon is (not )?in the \"([^\"]+)\" \"([^\"]+)\" \"([^\"]+)\"";
    }

    @Override
    protected void run(PostLine line, String[] match) {
    }
}
