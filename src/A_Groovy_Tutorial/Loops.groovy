package A_Groovy_Tutorial

1.upto(5){
    println "$it"  // it is a keyword
}

5.times {
    println "$it"
}

1.step(10, 3) {
    println "$it"
}

for(i in [0,1,2,4]) {
    println i;
}

// interate over a map
def map = ["name" : "Groovy", "subject": "Automation"]

x = 0
for( e in map ) {
    println e
    println e.key
    println e.value
}