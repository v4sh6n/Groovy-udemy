class Person {
    String name
    int age
    String address
    String phone
    //private protected public
    protected String f1, f2, f3
    private Date createOn = new Date()

    static welcomeMsg = "Welcome to Groovy"
    //pubic static final String welcomeMsg = "Welcome to Groovy"
    //local variables
    def foo() 
    {
        String name = "Groovy"
        String firstName = "Dan"
        println "Hello $name from $firstName"
    }

}
println Person.welcomeMsg
def person = new Person()
println person.createOn
println person.f1
println person.foo()

//Person p = new Person()
//p.welcomeMsg = "Welcome to Groovy"