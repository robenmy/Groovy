package A_Groovy_Tutorial

// https://groovy-lang.org/groovy-dev-kit.html

def name = "Ralp Lauren kfjdj"
println(name)
println("My name is " + name)
println "My name is".concat(name)

println "My name is $name"
println 'My name is ${name}'

def s1 = """"" This is a groovy class
                and we are learning strings"""""

println(s1)

println name.length()
println name[2]
println name[-2] //empezar al reves
println name.indexOf("a")
println name[0..2] // imprime los caracteres desde la posicion 0 hasta la dos
println name[5..3]
println name.substring(2)
println name.substring(1, 4)

def str = "This is a groovy class"

println str.split(" ")
println str-("groovy")
println str.replace("class", "session")
println str.toUpperCase()
println str.toList()

println "Groovy" * 3
println "Abc".equals("Abc")

// Other Ways to delcare a string
def name2 = /a green sky $name/
def name3 = $/a blue tree $name/$
def name4 = "My name is \"Ralp\""
def name5= /My name is "Raghav"/