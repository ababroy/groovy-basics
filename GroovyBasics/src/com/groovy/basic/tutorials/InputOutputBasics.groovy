package com.groovy.basic.tutorials

println "Enter your name:"
def name = System.console().readLine()

println "Hello $name"
printf "Hello %-10s",name


println "Enter a number"
def n1  = System.console().readLine().toInteger()
println "Enter a another number"
def n2  = System.console().readLine().toInteger()

print "Sum of $n1 & $n2: " + (n1 + n2)
println "Sum of $n1 & $n2: " + (n1 + n2)
printf "Sum of %d and %d : %d ", n1, n2, (n1 + n2)
/*
 *  output
 */
//print
//println
//printf
