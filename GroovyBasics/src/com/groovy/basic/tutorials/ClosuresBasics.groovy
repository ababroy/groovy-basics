package com.groovy.basic.tutorials

/**
 * Why closure needed?
 * - 
 */
/**
 *Block of code that can
 * - take parameter
 * - refer variables
 * - return values
 * - can be passed as parameter in a method
 */
// no arg closure
def noArgClosure = {println "Hello no-arg-closure"}
noArgClosure.call()

// argument based closure
/**
 * - take parameter
 */
def argClosure = { name -> println "Hello ${name}"}
argClosure.call("Arg-Closure")

// argument based closure refer var
/**
 *  - refer variables
 */
def str = "Hello"
def argClosureReferVar = { name -> println "$str ${name}"}
argClosureReferVar.call("Arg-Closure refer Variables")

/**
 * can be passed as parameter in a method
 */
def method( myArgClosure )
{
    myArgClosure.call("Groovy Closure")
}
method(argClosure)


// Closure return values
def returnClosure = 
{
    a,b -> return (a+b)    
}

def returnMethod( closure)
{
    result = closure.call(2,3)
    println result
}
returnMethod(returnClosure)

// Iterate over the closure list
def list = ["apple", "banana", "guava", "orange"]
println list.each { it }

// Iterate over the closure Map
def map = ["drink": "Milk", "eat":"healthy", "workout":"cardio"]
println map.each { it }
// find item/s
def num = [1,2,3,4,5]
println "find items: "+ num.findAll { item -> item >=3 }
// check if items are available or not
println "isFound: " + num.any { item -> item > 4 }
// check whether all item are true or not
println "All are greater than zero? "+num.every { item -> item > 0 } // since the num closure contains all greater than 0, will print true

// do some operation with the collected items from the closure list
println num.collect{item -> item*100+10}
