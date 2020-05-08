package com.groovy.basic.tutorials

// Single Quoted String
def singleQuotedString = 'abhi'
println "singleQuotedString: "+singleQuotedString

// Double Quoted String
def doubleQuotedString = "abhi"
println "doubleQuotedString: "+doubleQuotedString

// Triple Single Quoted String
def tripleSingleQuotedString = '''My name is Abhijit
I'm in Bangalore'''
println "tripleSingleQuotedString: "+tripleSingleQuotedString

// Triple Double Quoted String [For MultiLine ]
def firstName = "Abhijit"
def homeTown = "Kolkata"
def tripleDoubleQuotedString = """My name is ${firstName}
I'm from ${homeTown} """
println "tripleDoubleQuotedString: "+ tripleDoubleQuotedString

// Slashy String [ useful for string with regular exp
/**
 * If you're defining a  regular expression pattern, slashy strings are useful 
 * as you don't need to escape BACK SLASH'es
 * Example: /\s+/
 * 
 */
def slashyString = /My name is "Abhi"/    // otherwise need to provide Backslash with quote (like \"Abhi\")
println "slashyString: "+slashyString

// Dollar Slashy String
/**
 * If you need a FORWARD SLASH in your pattern, you'd need a $/DOLLAR/$ slashy string 
 * Example: $/([a-z]+)/([a-z]+))/$
 */
def dollarSlashyString = $/([a-z]+)/([a-z]+))/$
println "dollarSlashyString: "+dollarSlashyString


/**
 * Double quoted String manipulation
 */
def string = "Abhijit"
println string.concat(" Roy" )

def name = "Abhi"
name.concat(" Roy" )
println name
println "My name is ${name} " // Interpolation can be done by DOUBLE Quotation
println 'My name is ${name}'  // Interpolation cann't be done by SINGLE Quotation
println "My name is ${name.concat(" Roy")}"

// Extra feature
def alphabet = "ABCDEFG" 
println alphabet[-1] // will print from the end o/p: 't'
println alphabet[0..3] // will be printed 'abhi'
println alphabet[6..4] // will be printed from end o/p: 'tij' => since the start index is greater than end index
println alphabet[0,2,4,6] // will be printed the particular index
println alphabet.subSequence(0, 4 )

def str = " Learning Groovy language which is on top of the Java language "
println str.trim().split(" " )
println str-(" language") // Extra feature
println str.trim().toList() // Extra feature
println "Groovy " * 3 // Extra feature => repeat string multiple times(3)