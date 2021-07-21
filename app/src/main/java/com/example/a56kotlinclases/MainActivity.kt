package com.example.a56kotlinclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_crear_mensaje.setOnClickListener {


            /*

            val emple = Empleado()

            emple.nombre="Benito"
            emple.apellido="Floro"
            emple.oficio="Entrenador"
            emple.salario= 120000
            emple.comision= 1300


             */

 val emple= Empleado("Benito", "Floro", "Programado", 2500,150)

            txtMensaje.text= "Hola  ${emple.nombre} ${emple.apellido} con profesion ${emple.oficio}. " +
                    "Su salario final es ${emple.salario+emple.comision}. Diferencia con salario mínimo Interprofesional : " +
                    "${emple.diferenciaSMI()}"
            txtMensaje.textSize=30.toFloat()
        }
    }

}
