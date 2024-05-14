package A_Groovy_Tutorial
// https://groovy-lang.org/groovy-dev-kit.html
/*Block of code that can take  parameters, refer variables, return values, can be passed as parameter in a method*/

def str = " hello "

def myClosure1 = { name -> println "$str ${name}"}

myClosure1.call("Robenmy")

// esta funciona dara un error ya que no puedes llamar la variable dentro de la funcion, hay que crear un objeto de la clase e intanciar el metodo, pero en closure no hay problema
//def myMethod(){
//    println "$str"
//
//}

def myClosure2 = {
    a,b,c ->
        return (a+b+c)
}

def result = myClosure2(5,3,4)
println "My result is: "+ result

def myList1 = ["Apples", "Orange", "Grapes"]
println myList1.each { it }

def myMap = [
        'subject' : 'groovy',
        'topic' : 'closure'
]

println myMap.each { it }

def myList = [1,2,3,4,5]
println myList.find{ item -> item == 6}
println myList.findAll{ item -> item > 3}
println myList.any{ item -> item > 3} // print a boolean
println myList.every{ item -> item > 3} // print false porque no todos son mayores a 3
println myList.collect{item -> item*2} // todos los items multiplicado por dos