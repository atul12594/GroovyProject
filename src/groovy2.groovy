/**
 * Created by atul on 8/6/16.
 */
List marks = [80, 70, 60 ,50 ]
println marks[0]
println marks[1]
println marks[2]
println marks[3]

for( int i = 0; i <marks.size(); i++) {
    println(marks[i])

}
 marks.each {
    println it
}

marks.each ({ hello ->
    println hello
})

marks.each { hello ->
    println (hello)
}
