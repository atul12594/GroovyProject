/**
 * Created by atul on 9/6/16.
 */
List a = [20, 23, 30, 35, 40, 50 ]

List b = []

a.each { item ->
    if(item > 20) {
        b.push item
    }
}
 b = a.findAll {
     return it > 20
 }

println a.find {
    return true
}

println b