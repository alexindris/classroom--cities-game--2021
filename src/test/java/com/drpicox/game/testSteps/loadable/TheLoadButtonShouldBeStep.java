package com.drpicox.game.testSteps.loadable;

import com.drpicox.game.testPost.reader.PostLine;
import com.drpicox.game.testSteps.AbstractPostLineStep;
import org.springframework.stereotype.Component;

import static com.google.common.truth.Truth.assertThat;

@Component
public class TheLoadButtonShouldBeStep extends AbstractPostLineStep {


    private final LoadableTestView loadableTestView;

    public TheLoadButtonShouldBeStep(LoadableTestView loadableTestView) {
        this.loadableTestView = loadableTestView;
    }

    @Override
    protected String getRegex() {
        return "The load button should be (highlighted|normal)";
    }

    @Override
    protected void run(PostLine line, String[] match) {
        var isRequested = match[1].equals("highlighted");

        var isLoadRequested = loadableTestView.isLoadRequested();
        assertThat(isLoadRequested).isEqualTo(isRequested);
    }
}
