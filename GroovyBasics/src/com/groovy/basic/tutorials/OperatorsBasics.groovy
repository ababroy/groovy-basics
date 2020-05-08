package com.groovy.basic.tutorials

// Arithmetics
assert 2 + 3 == 5
assert 2 * 3 == 6
assert 2 - 3 == -1
assert 3 / 2  == 1.5
assert 2 ** 3 == 8
assert 10 % 5 == 0
assert 9.intdiv(3 ) == 3

// Unary operators
assert +3 == 3
assert -4 == -4
assert -(-5) == 5 

// Increment ++ & Decrement --
int a =1
int b = a++ * 2
assert a == 2 && b ==2 

int m = 3
int n = --m * 2
assert m==2 && n == 4

// assignment operators
int x = 3
assert (x += 3) == 6


println x **= 2 


// Bitwise operators
int s = 16
int t = 20

println Integer.toBinaryString( s )     // 10000
println Integer.toBinaryString( t )     // 10100
println Integer.parseInt( "10000", 2 )  // 10000 // 16

assert (s & t) == 16


// Ternary Operators
String result = ( 5 > 3) ? "Greater" : "Lesser"
assert result == "Greater"

// Elvis operator

// Object operators

// Match Operators

// Spread Operators
