package com.groovy.basic.tutorials

/**
 * 1. How to read a file as String
 * 2. How to read a file as List
 * 3. How to read a file as Array
 * 4. How to read a file line by line
 * 5. How to delete a file
 */

String path = /src\content.txt/ // /C:\Users\AROY\git\groovy-basics\GroovyBasics\src\content.txt/
File file = new File(path)
// Read entire content from a file as a String
println file.text

// collect lines into a list
def list = file.collect{it}
println "List: $list"

// store file content in an array
def array = file as String[]
println "Array: ${array}"

// read file into a list of string
def string = file.readLines()
println "Lines: $string"

// read file line by line
file.eachLine { line -> 
    println "Line: $line"
}

// read file line by line with line number
file.eachLine { line, lineNo ->
    println "$lineNo: $line"
}

// filter
def lineRange = 2..4
def lineList = []

file.eachLine { line, lineNo ->
    if( lineRange.contains(lineNo ))
    {
        lineList.add(line)
    }
}
println lineList


// read with reader
def line
file.withReader { reader ->
    while( (line = reader.readLine())!= null )
    {
        println line
    } 
}

// read with new Reader
def outputFile = /src\content2.txt/
def reader = file.newReader()
new File(outputFile).append(reader )
reader.close()


// list of files from a dir
new File("D:/").eachFile { 
    files -> println files.getAbsoluteFile()
    
// recursively display all files in a dir and it's sub-dir
new File(/D:\MyJava\Java\Design Pattern/).eachFileRecurse {
    fileRecurse -> println fileRecurse.getAbsolutePath()
    }
}        

// Copy file data to another file
def newFile = new File(/src\newCopy.txt/)
newFile << file.text

// delete file
newFile.delete()