package com.groovy.basic.tutorials

def method()
{
    println "method calling..."
}
 method()
 
 def sum(def a = 10, def b = 20)
 {
     println (a+b)
 }
 
 sum()
 
 def sub( a = 10, b)
 {
     return (a-b)
 }
 c = sub(5)
 println c