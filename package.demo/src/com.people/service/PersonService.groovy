package com.people.service

class PersonService implements IPersonService{
    @Override
    People find() {
        Person p = new Person(first:"David",last:"Garcia")
        // TODO Auto-generated method stub
        //return null
        return p
    }

    @Override
    List<People> findALL() {
        // TODO Auto-generated method stub
        // return null
        Person p1 = new Person(first:"David",last:"Garcia")
        Person p2 = new Person(first:"Ruben",last:"Garcia") 
        [p1,p2]
        
    }
}