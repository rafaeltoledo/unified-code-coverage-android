package net.rafaeltoledo.coverage;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class MainActivityUnitTest {

    @Test
    public void shouldHideButtonAfterClick() {
        ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.hide)).perform(click());

        onView(withId(R.id.hide)).check(matches(not(isDisplayed())));
    }
}
