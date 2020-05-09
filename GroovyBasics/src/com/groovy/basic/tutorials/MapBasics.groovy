package com.groovy.basic.tutorials

def map = [11:100, 22:200,33:300,22:200]
println map
println map.getClass().getName()

println map.each { it }
map.eachWithIndex{
    k,v, i -> println "index $i: $k => $v"
}
println "============="
map = map + ['alphabet':'abcd']

map.eachWithIndex { entry, i ->
    println "index $i: $entry.key <=> $entry.value"
}

def entries = map.entrySet()
entries.each{ entry -> 
    println entry.key +" - " + entry.value 
}