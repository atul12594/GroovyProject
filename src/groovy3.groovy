/**
 * Created by atul on 8/6/16.
 */
class Person {
    String firstName
    String lastName
    String a
    String b

}


Map n1 = [firstName : "hello", lastName : "hello", a : 3, b : 4]
Person u1 = new Person([firstName : "hello", lastName : "hello", a : 3, b : 4])
Person u2 = new Person(n1)
println u1.firstName
println u1.lastName
println u1.a
println u1.b

println u2.firstName
println u2.lastName
println u2.a
println u2.b