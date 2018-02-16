package net.rafaeltoledo.coverage

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val rule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun shouldUpdateTextAfterButtonClick() {
        onView(withId(R.id.button)).perform(click())

        onView(withId(R.id.text)).check(matches(withText("Hello World!")))
    }
}