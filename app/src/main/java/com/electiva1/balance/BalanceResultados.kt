package com.electiva1.balance

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class BalanceResultados : AppCompatActivity() {

    var totalActivos=0;
    var totalPasivosPatrimonio=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_balance)
        setContentView(R.layout.activity_balance)

        var bundle =intent.extras

        totalActivos= bundle!!.getInt("totalActivos")
        totalPasivosPatrimonio= bundle!!.getInt("totalPasivosPatrimonio")
        findViewById<TextView>(R.id.textActivo).text=totalActivos.toString()
        findViewById<TextView>(R.id.textPasivoPatrimonio).text=totalPasivosPatrimonio.toString()


        if(totalActivos == totalPasivosPatrimonio){
            findViewById<TextView>(R.id.textResultados).text="Tus registros financieros de la actividad economica estan excelentes, activos y pasivos concuerdan!"

        }else{

            findViewById<TextView>(R.id.textResultados).text="Tus registros financieros de la actividad economica estan mal, activos y pasivos no concuerdan"
        }


    }





    fun clickNuevo(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
