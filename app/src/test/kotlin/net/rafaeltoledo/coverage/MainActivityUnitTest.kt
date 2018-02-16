package net.rafaeltoledo.coverage

import android.view.View
import android.widget.Button
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainActivityUnitTest {

    @Test
    fun shouldHideButtonAfterClick() {
        val activity = Robolectric.setupActivity(MainActivity::class.java)

        val button = activity.findViewById<Button>(R.id.hide)
        button.performClick()

        assertThat(button.visibility, `is`(View.GONE))
    }
}