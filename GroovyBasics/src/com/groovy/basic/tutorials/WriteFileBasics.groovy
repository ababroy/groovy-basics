package com.groovy.basic.tutorials

File file = new File(/src\content.txt/)

file.write("write line-1 by write()\n" )
file << "Write Line-2 by <<\n"
// file.text = "Write line-3 by text command"
file.append("Write line-4 by append()" )
println file.text

def newFile  = new File("content2.txt")
newFile << file.text
newFile.renameTo(new File("content-copy.txt") )