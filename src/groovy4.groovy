''/**
 * Created by atul on 8/6/16.
 */

class User {

    String firstName
    String lastName
    String email
    int age

}


User u1 = new User([firstName : "atul", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 22])

User u2 = new User([firstName : "atul1", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 22])

User u3 = new User([firstName : "atul2", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 22])

User u4 = new User([firstName : "atul3", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 22])

User u5 = new User([firstName : "atul4", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 22])

List a1 = [u1, u2, u3, u4, u5]

a1.each {

    println "${it.firstName} ${it.lastName} ${it.email} (${it.age})"

}


