package A_Groovy_Tutorial
// https://groovy-lang.org/groovy-dev-kit.html

def x  = 10
def result = ""

switch (x) {
    case 0 :
        result = "x is equal 0"
        break
    case {x > 0} :
        result = "x is Positive"
        break
    case {x < 0} :
        result = "x is Negative"
        break
    default:
        result = "invalid number"

}

println(result)

