package com.groovy.basic.tutorials

def num = 1

// if-else statement
if ( num == 1)
{
    println "if-statement"
}
else
{
    println "else-statement"
}


// switch case
def x = 1;

switch( x )
{
    case {x==0}: println "Case-0" 
            break
    case {x>=1}: println "Case-1"
            break
    default: println "default"
    break
    
}