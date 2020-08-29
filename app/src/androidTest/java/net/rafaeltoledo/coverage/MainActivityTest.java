package net.rafaeltoledo.coverage;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Test
    public void shouldUpdateTextAfterButtonClick() {
        ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.button)).perform(click());

        onView(withId(R.id.text)).check(matches(withText("Hello World!")));
    }
}
