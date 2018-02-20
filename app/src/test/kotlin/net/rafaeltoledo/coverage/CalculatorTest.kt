package net.rafaeltoledo.coverage

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class CalculatorTest {

    @Test
    fun checkIfSumIsCorrect() {
        assertThat(KotlinClass().sum(1, 1), `is`(2))
    }
}
