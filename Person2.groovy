@groovy.transform.ToString
class Person {
    String first, last
    // constructor
    Person(String fullName){
        List parts = fullName.split(' ')
        this.first = parts[0]
        this.last = parts[1]

    }
    //Methods
    public void foo(String a, String b) {
        
    }
    String getfullName () {
        return "${first} ${last}"
    }
    def bar() {
        return "bar"
    }
    static String doGoodWork() {
        println "Good Work"
    }
    //List someMethod(List numbers = [1,2,3,4,5]. Boolean canAccess = false){

    

    //}
    def concat (String... args) {
        println args.length
    }
}

//Person p = new Person(first: "Dan", last: "Vogel")
//println p
//Person p = new Person("Dan Vogel")
//println p
Person p = new Person("Dan Vogel")
p.concat("a", "b", "c")