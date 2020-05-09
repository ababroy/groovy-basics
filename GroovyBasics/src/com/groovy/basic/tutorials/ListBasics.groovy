package com.groovy.basic.tutorials

def list = [1,2,3,4,[11,12,13,14], 5]
println list.get(4 ).get(2) // to print 13
println list[4][2] // to print 13

// iterate all
println list.each { it }
// Iterate one by one
list.each{ item -> 
    println item
}

// Iterate one by one with index
list.eachWithIndex { item, i  ->
    println "index $i : $item"
}

// Add item into the list
list = list.plus(6 )
println list

list = list+[7, "abhi"]
println list

// remove item
list = list - [1]
println list
list = list.minus(2)
println list

// sublist
list = list.subList(2,3 )
println list.get(0).get(0)

// range list
def fruits = ['apple', 'banana', 'orange', 'papaya', 'pomegranate']
println fruits[0..2]
// reverse range list
println fruits[2..0]

fruits = fruits << 'mango'
println fruits

fruits = fruits.plus(2, 'carrot' )
println fruits
fruits = fruits.plus(0, 'aaa' )
println fruits
// pop an item
fruits.pop()
println fruits

// remove last item
fruits.removeLast()
println fruits

// match the item
println fruits.intersect(['banana', 'papaya', 'lemon'] )
// reverse a list
fruits = fruits.reverse()
println fruits

// sort a list
println fruits.sort()