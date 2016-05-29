package com.breakfast.fizzbuzz.fizzbuzz_jbehave;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;

import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void findMatchingCandidateSteps() {
        Embedder embedder = new Embedder();
        embedder.useStepsFactory(new InstanceStepsFactory(embedder
            .configuration(), new FizzBuzzSteps()));

        embedder.configuration().storyReporterBuilder()
            .withFormats(CONSOLE);
        StoryFinder finder = new StoryFinder();
        List<String> storyPaths =
            finder.findPaths(codeLocationFromClass(this.getClass())
                .getFile(), asList("**/*.story"), asList(""));
        embedder.runStoriesAsPaths(storyPaths);
    }
}
