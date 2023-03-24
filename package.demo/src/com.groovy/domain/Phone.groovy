package com.groovy.domain

class Phone {
    String name
    String os 
    String appStore

    def powerOn() {
        println "Powering on"
    }
    def powerOff() {
        println "Powering off"
    }
    def ring() {
        println "Ringing"
    }
}