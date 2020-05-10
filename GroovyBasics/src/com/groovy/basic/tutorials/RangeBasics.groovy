package com.groovy.basic.tutorials

// check the type of range
def rangeType = 1..5
println rangeType instanceof java.util.List
println "Range Type: "+ rangeType.getClass().getName()
groovy.lang.IntRange

// creates a list of sequential value
// denoted by 1st and last value of the sequence
/**
 * number: 1..10
 * alphabet 'a'..'z'
 * 10..1 (reverse)
 */

/*2 types
 * - inclusive 1..10
 * - exclusive 1..<10
 */ 

// Inclusive
def range = 1..10
println range
println "start "+range.getFrom()
println "end "+range.getTo()
range.each{ i ->
    print i
}

// exclusive
def exRange = 1..<10
println exRange
exRange.each{ i ->
    print i
}
assert exRange.from == 1
assert exRange.to == 9
println ""

// create a subRange from a range
def subRange = range.subList(4, 8 )
subRange.each { item -> print item }
println " "

(4..10).each{ i -> print i}


