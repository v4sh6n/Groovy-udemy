
class Laptop{

    def price 
    def brand 
    def screenWorkingCondition
    static main(args)
    {
        Laptop laptop = new Laptop()
        laptop.logIn()
        laptop.logOut()

        laptop.price = 1000
        laptop.brand = "lenovo"
        laptop.screenWorkingCondition = true
        
        println(laptop.price)
        println(laptop.brand)
        printl(laptop.screenWorkingCondition)
    }
    def logIn()
    {
     println("System loggin in")
    }
    def logOut()
    {
        println("System loggin out")

    }
}