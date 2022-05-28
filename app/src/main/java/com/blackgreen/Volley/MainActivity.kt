package com.blackgreen.Volley

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textoResultado =  findViewById<TextView>(R.id.tvResultado)
        val url = "https://www.youtube.com/watch?v=j_0UrSomgO0"
        val queue = Volley.newRequestQueue(this)
        val stringRequest =  StringRequest(Request.Method.GET,url,Response.Listener { response ->
            textoResultado.text = "La respuesta es:  ${response}"

                },Response.ErrorListener {
            textoResultado.text = "Algo salio mal"
        })
        queue.add(stringRequest)

    }
}