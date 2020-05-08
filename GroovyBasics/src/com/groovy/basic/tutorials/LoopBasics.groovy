package com.groovy.basic.tutorials

/**
 * for loop
 */
// same as java


/**
 *  for in
 */
println  "for in basics"
for( x in 1..5)
{
    print x +" "
}
println ""

// for in  (iterate over a list)
println  "for in  (iterate over a list)"
for( a in [3,4,5,6,7])
{
    print a+" "
}
println ""

// for in (iterate over an array)
println "for in (iterate over an array)"
def array = (3..5).toArray()
for( b in array)
{
    print b + " "
}
println ""

// for in (iterate over a map)
println "for in (iterate over a map)"
def map = ["abhi": 100, "som":101, "maa" : 104]
for( m in map)
{
    print "["+m.key + "-" + m.value+"] "
}

println ""

// for in (iterate over the values of a map)
println "for in (iterate over the values of map)"
for( v in map.values())
{
    print v + " "
}
println ""

// for in (iterate over the characters in a string)
println "for in (iterate over the characters in a string)"
def list = []
for( c in "abhi")
{
    list.add(c )
}
print "List : "+list
println "\n"


/**
 *  upto method
 */
println "upto method"
1.upto(10 ) { print "$it " }
println ""

/**
 *  times loops
 */
println "times method"
10.times { print "$it " }
println ""

/**
 *  steps loops
 */
println "steps method"
1.step(10, 2 ) { print "$it "}



/**
 * While loop
 */
// Same as Java
