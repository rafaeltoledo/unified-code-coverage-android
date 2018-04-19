package br.com.another

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class MultiplyTest {

    @Test
    fun checkIfMultiplyIsCorrect() {

        assertThat(AnotherKotlinClass().multiply(2, 1), `is`(2))
    }
}
