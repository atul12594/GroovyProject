/**
 * Created by atul on 8/6/16.
 */
println "Hello"

List a = [2, 3, 4, 5, 6]
List a1 = ["Ankur", "Singh", 2, 3, 4, true]
if(a) {
    println("This a is not empty")
}

String b = ""

if (b) {
     println "b is not empty"
}
   else {
    println "b is empty"
}


Map data = [firstName: "Atul", lastName: "Aggarwal", info: "I came late today"]
println data
println(data.firstName)
println(data.get("firstName"))
println(data["lastName"])
