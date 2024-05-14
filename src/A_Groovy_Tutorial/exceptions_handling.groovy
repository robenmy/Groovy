package A_Groovy_Tutorial

try {

    int i = 1/0

}
catch (Exception err) {
    println "I'm inside exception block"
    println err.getCause()
    println err.getMessage()
    err.printStackTrace()

}
finally {
    println "I'm inside finally block"
}

