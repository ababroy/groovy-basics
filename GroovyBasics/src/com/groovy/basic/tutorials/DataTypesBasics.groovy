package com.groovy.basic.tutorials

def noVariableType = (byte) 10
println noVariableType.getClass().getName()
println "=============="

Byte b = 1
println b.MIN_VALUE + " - " + b.MAX_VALUE
println "=============="

Short s = 1
println s.MIN_VALUE + " - " + s.MAX_VALUE
println "=============="

Integer i = 1
println i.MIN_VALUE + " - " + i.MAX_VALUE
println "=============="

Float f = 1
println f.MIN_VALUE + " - " + f.MAX_VALUE
println "=============="

Double d = 1
println d.MIN_VALUE + " - " + d.MAX_VALUE
println "=============="

Boolean bool = false
println bool
println "=============="

Character ch = 'A'
println ch.getClass().getName()
println ch.MIN_VALUE //+ " - " + ch.MAX_VALUE
println "=============="

Number n = 10
println n.getClass().getName()
println n.MIN_VALUE + " - " + ch.MAX_VALUE
println "=============="

