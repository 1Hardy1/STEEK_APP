package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class IngresoPasyPatr : AppCompatActivity() {

    var totalActivos=0
    var totalPasivoCorriente=0;
    var totalPasivoNoCorriente=0;
    var totalPatrimonio=0;
    var totalPasivosPatrimonio=0;
    var obligacionesCP=0
    var cuentasPagar=0
    var impuestoRentaPagar=0
    var obligacionesLP=0
    var capitalSusPagado=0
    var reservaLegal=0
    var utilidadEjercicio=0
    var otrosPasiv=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_pasivos)




    }


    fun aceptarClick(view: View) {

        var bundle =intent.extras

        totalActivos= bundle!!.getInt("totalActivos")

        obligacionesCP =findViewById<EditText>(R.id.editObligacionesCP).text.toString().toInt()
        cuentasPagar =findViewById<EditText>(R.id.editCuentasPagar).text.toString().toInt()
        impuestoRentaPagar =findViewById<EditText>(R.id.editImpuestoRentaPagar).text.toString().toInt()

        obligacionesLP =findViewById<EditText>(R.id.editObligacionesLP).text.toString().toInt()


        capitalSusPagado =findViewById<EditText>(R.id.editCapitalSusPagado).text.toString().toInt()
        reservaLegal =findViewById<EditText>(R.id.editReservaLegal).text.toString().toInt()
        utilidadEjercicio =findViewById<EditText>(R.id.editUtilidad).text.toString().toInt()
        otrosPasiv =findViewById<EditText>(R.id.editOtrosPasiv).text.toString().toInt()

        totalPasivoCorriente= obligacionesCP+cuentasPagar+impuestoRentaPagar;
        totalPasivoNoCorriente= obligacionesLP;
        totalPatrimonio= capitalSusPagado+reservaLegal+utilidadEjercicio+otrosPasiv;
        totalPasivosPatrimonio= totalPasivoCorriente+totalPasivoNoCorriente+totalPatrimonio;

        val intent = Intent(this, BalanceResultados::class.java)
        val b : Bundle = Bundle()
        b.putInt("totalActivos", totalActivos)
        b.putInt("totalPasivosPatrimonio", totalPasivosPatrimonio)
        intent.putExtras(b)
        startActivity(intent)


    }
}
