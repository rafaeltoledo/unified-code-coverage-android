package br.com.another

class AnotherKotlinClass {

    fun multiply(first: Int, second: Int) = first * second

    fun blank() {

        val str = "detekt"

        val isFoo = if (str.startsWith("foo") && !str.endsWith("foo") && !str.endsWith("bar") && !str.endsWith("_")) {

        } else {

        }


            val int  = 0

        when (int) {
            0 -> {// Noncompliant: 6 lines till next case
                methodCall1("");
                methodCall2("");
                methodCall3("");
                methodCall4("");
            }
            1 -> {
            }
        }

    }

    private fun methodCall4(s: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun methodCall3(s: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun methodCall2(s: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun methodCall1(s: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}