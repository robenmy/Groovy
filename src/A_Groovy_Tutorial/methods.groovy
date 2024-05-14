package A_Groovy_Tutorial

def printHello() {
    println "hello"
}

printHello()

def sum(int a=10, int b=20){
    println  "Sum is " + (a + b)
}

sum(5, 2)
sum()