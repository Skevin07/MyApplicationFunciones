package com.unab.kevin.myapplicationfunciones

class Estudiantee (val nombre:String,var edad:Int, val lenguajes:Array<programacion>,
                   val amigo:Array<Estudiantee>?=null)
{

    enum class programacion
    {
        KOTLIN,
        PHP,
        JAVA,
        JAVASCRIPT,
        PYTHON

    }
    fun codigo()
    {
        for(lenguaje:programacion in lenguajes)
        {
            println("Conosco este lenguaje de programacion $lenguaje")
        }
    }
}