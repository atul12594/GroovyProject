''/**
 * Created by atul on 8/6/16.
 */

class User {

    String firstName
    String lastName
    String email
    int age
    
    String toString() {
        "${firstName} ${lastName} ${email} ${age}"
    }

}


User u1 = new User([firstName : "atul", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 22])

User u2 = new User([firstName : "atul1", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 50])

User u3 = new User([firstName : "atul2", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 70])

User u4 = new User([firstName : "atul3", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 80])

User u5 = new User([firstName : "atul4", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 101])

User u6 = new User([firstName : "atul4", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 110])

User u7 = new User([firstName : "atul4", lastName : "Aggarwal", email : "atualaggarwal125942gmail.com", age : 102])

List a1 = [u1, u2, u3, u4, u5, u6, u7]
List a2 = []
List a3 = []

a1.each {
}

a2 = a1.findAll {
    return it.age >100
}
a3 = a1.findAll {
    return it.age < 100
}

println a2

println a3

