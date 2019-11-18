package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class Ingreso : AppCompatActivity() {


    var totalActivos=0
    var totalActivosCorriente=0
    var totalPropiedadPlantaEquipo=0
    var efectivo= 0;
    var inversiones=0
    var cuentasCobrar=0
    var gastosAnticipado=0
    var oficina=0
    var transporte=0
    var muebles=0
    var computadores=0
    var depresiacion=0
    var otrosActivos=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)


    }



    fun agregarClick(view: View){

        efectivo = findViewById<EditText>(R.id.editEfectivo).text.toString().toInt()
        inversiones = findViewById<EditText>(R.id.editInversiones).text.toString().toInt()
        cuentasCobrar = findViewById<EditText>(R.id.editCobrar).text.toString().toInt()
        gastosAnticipado = findViewById<EditText>(R.id.editAnticipado).text.toString().toInt()


        oficina = findViewById<EditText>(R.id.editOficina).text.toString().toInt()
        transporte = findViewById<EditText>(R.id.editTransporte).text.toString().toInt()
        muebles = findViewById<EditText>(R.id.editMuebles).text.toString().toInt()
        computadores = findViewById<EditText>(R.id.editObligacionesLP).text.toString().toInt()
        depresiacion = findViewById<EditText>(R.id.editDepresiacion).text.toString().toInt()
        otrosActivos = findViewById<EditText>(R.id.editOtros).text.toString().toInt()


        totalActivosCorriente=efectivo+inversiones+cuentasCobrar+gastosAnticipado
        totalPropiedadPlantaEquipo=oficina+transporte+muebles+computadores-depresiacion+otrosActivos
        totalActivos=totalActivosCorriente+totalPropiedadPlantaEquipo


        val intent = Intent(this, IngresoPasyPatr::class.java)
        val b : Bundle = Bundle()
        b.putInt("totalActivos", totalActivos)
        intent.putExtras(b)
        startActivity(intent)

    }
}
