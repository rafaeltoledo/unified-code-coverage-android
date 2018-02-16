package net.rafaeltoledo.coverage;

import android.view.View;
import android.widget.Button;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(RobolectricTestRunner.class)
public class MainActivityUnitTest {

    @Test
    public void shouldHideButtonAfterClick() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        Button button = activity.findViewById(R.id.hide);
        button.performClick();

        assertThat(button.getVisibility(), is(View.GONE));
    }
}
