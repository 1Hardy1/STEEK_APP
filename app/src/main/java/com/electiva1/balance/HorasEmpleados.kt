package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class HorasEmpleados : AppCompatActivity() {

    var horasEmpleado1 = 0
    var horasEmpleado2 = 0
    var horasEmpleado3 = 0
    var horasEmpleado4 = 0
    var horasEmpleado5 = 0

    var comisionEmpleado1 = 0
    var comisionEmpleado2 = 0
    var comisionEmpleado3 = 0
    var comisionEmpleado4 = 0
    var comisionEmpleado5 = 0

    var basicoEmpleado1 = 0
    var basicoEmpleado2 = 0
    var basicoEmpleado3 = 0
    var basicoEmpleado4 = 0
    var basicoEmpleado5 = 0

    var bonificacionEmpleado1 = 0
    var bonificacionEmpleado2 = 0
    var bonificacionEmpleado3 = 0
    var bonificacionEmpleado4 = 0
    var bonificacionEmpleado5 = 0

    var minimo = 828116

    var auxilioEmpleado1 = 0
    var auxilioEmpleado2 = 0
    var auxilioEmpleado3 = 0
    var auxilioEmpleado4 = 0
    var auxilioEmpleado5 = 0

    var devengadosEmpleado1= 0
    var devengadosEmpleado2= 0
    var devengadosEmpleado3= 0
    var devengadosEmpleado4= 0
    var devengadosEmpleado5= 0
    var totalDevengados=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horas)


    }


    fun siguienteComClick(view: View) {

        var bundle = intent.extras

        basicoEmpleado1 = bundle!!.getInt("basicoEmpleado1")
        basicoEmpleado2 = bundle!!.getInt("basicoEmpleado2")
        basicoEmpleado3 = bundle!!.getInt("basicoEmpleado3")
        basicoEmpleado4 = bundle!!.getInt("basicoEmpleado4")
        basicoEmpleado5 = bundle!!.getInt("basicoEmpleado5")
        bonificacionEmpleado1 = bundle!!.getInt("bonificacionEmpleado1")
        bonificacionEmpleado2 = bundle!!.getInt("bonificacionEmpleado2")
        bonificacionEmpleado3 = bundle!!.getInt("bonificacionEmpleado3")
        bonificacionEmpleado4 = bundle!!.getInt("bonificacionEmpleado4")
        bonificacionEmpleado5 = bundle!!.getInt("bonificacionEmpleado5")

        comisionEmpleado1 = bundle!!.getInt("comisionEmpleado1")
        comisionEmpleado2 = bundle!!.getInt("comisionEmpleado2")
        comisionEmpleado3 = bundle!!.getInt("comisionEmpleado3")
        comisionEmpleado4 = bundle!!.getInt("comisionEmpleado4")
        comisionEmpleado5 = bundle!!.getInt("comisionEmpleado5")



        horasEmpleado1 = findViewById<EditText>(R.id.editHoras1).text.toString().toInt()
        horasEmpleado2 = findViewById<EditText>(R.id.editHoras2).text.toString().toInt()
        horasEmpleado3 = findViewById<EditText>(R.id.editHoras3).text.toString().toInt()
        horasEmpleado4 = findViewById<EditText>(R.id.editHoras4).text.toString().toInt()
        horasEmpleado5 = findViewById<EditText>(R.id.editHoras4).text.toString().toInt()


        if (basicoEmpleado1 < (minimo * 2)) {
            auxilioEmpleado1 = 97032
        } else {
            auxilioEmpleado1 = 0
        }
        if (basicoEmpleado2 < (minimo * 2)) {
            auxilioEmpleado2 = 97032
        } else {
            auxilioEmpleado2 = 0
        }
        if (basicoEmpleado3 < (minimo * 2)) {
            auxilioEmpleado3 = 97032
        } else {
            auxilioEmpleado3 = 0
        }
        if (basicoEmpleado4 < (minimo * 2)) {
            auxilioEmpleado4 = 97032
        } else {
            auxilioEmpleado4 = 0
        }
        if (basicoEmpleado5 < (minimo * 2)) {
            auxilioEmpleado5 = 97032
        } else {
            auxilioEmpleado5 = 0
        }


        devengadosEmpleado1=basicoEmpleado1+bonificacionEmpleado1+comisionEmpleado1+horasEmpleado1+auxilioEmpleado1
        devengadosEmpleado2=basicoEmpleado2+bonificacionEmpleado2+comisionEmpleado2+horasEmpleado2+auxilioEmpleado2
        devengadosEmpleado3=basicoEmpleado3+bonificacionEmpleado3+comisionEmpleado3+horasEmpleado3+auxilioEmpleado3
        devengadosEmpleado4=basicoEmpleado4+bonificacionEmpleado4+comisionEmpleado4+horasEmpleado4+auxilioEmpleado4
        devengadosEmpleado5=basicoEmpleado5+bonificacionEmpleado5+comisionEmpleado5+horasEmpleado5+auxilioEmpleado5

        totalDevengados=devengadosEmpleado1+devengadosEmpleado2+devengadosEmpleado3+devengadosEmpleado4+devengadosEmpleado5




        val intent = Intent(this, Menu::class.java)
        val b: Bundle = Bundle()
        b.putInt("comisionEmpleado1", comisionEmpleado1)
        b.putInt("comisionEmpleado2", comisionEmpleado2)
        b.putInt("comisionEmpleado3", comisionEmpleado3)
        b.putInt("comisionEmpleado4", comisionEmpleado4)
        b.putInt("comisionEmpleado5", comisionEmpleado5)


        b.putInt("basicoEmpleado1", basicoEmpleado1)
        b.putInt("basicoEmpleado2", basicoEmpleado2)
        b.putInt("basicoEmpleado3", basicoEmpleado3)
        b.putInt("basicoEmpleado4", basicoEmpleado4)
        b.putInt("basicoEmpleado5", basicoEmpleado5)


        b.putInt("horasEmpleado1", horasEmpleado1)
        b.putInt("horasEmpleado2", horasEmpleado2)
        b.putInt("horasEmpleado3", horasEmpleado3)
        b.putInt("horasEmpleado4", horasEmpleado4)
        b.putInt("horasEmpleado5", horasEmpleado5)


        b.putInt("devengadosEmpleado1", devengadosEmpleado1)
        b.putInt("devengadosEmpleado2", devengadosEmpleado2)
        b.putInt("devengadosEmpleado3", devengadosEmpleado3)
        b.putInt("devengadosEmpleado4", devengadosEmpleado4)
        b.putInt("devengadosEmpleado5", devengadosEmpleado5)

        b.putInt("totalDevengados", totalDevengados)




        intent.putExtras(b)
        startActivity(intent)

    }
}
