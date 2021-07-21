package com.example.a56kotlinclases
/*
class Empleado {

    var nombre =""
    var apellido=""
    var oficio=""
    var salario=0
    var comision=0
}
        */

class Empleado (nom:String, ape: String, ofi:String , sal : Int, com :Int) {
    var nombre = nom
    var apellido= ape
    var oficio= ofi
    var salario= sal
    var comision= com

    fun  diferenciaSMI(): Int {

        return this.salario-900
    }

}

