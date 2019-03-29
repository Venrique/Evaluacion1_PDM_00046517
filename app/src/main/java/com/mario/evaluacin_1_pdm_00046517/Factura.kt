package com.mario.evaluacin_1_pdm_00046517

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.json.JSONArray
import org.json.JSONObject

class Factura : AppCompatActivity() {

    private lateinit var txtUser: TextView
    private lateinit var txtEmail: TextView

    private lateinit var txt2: TextView
    private lateinit var txt3: TextView
    private lateinit var txt4: TextView
    private lateinit var txt5: TextView
    private lateinit var txt6: TextView
    private lateinit var txt7: TextView
    private lateinit var txt8: TextView
    private lateinit var txt9: TextView
    private lateinit var txt1: TextView
    private lateinit var total: TextView

    private lateinit var share: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factura)

        init()

        val intent: Intent = getIntent()
        val str: String = intent.getStringExtra(Intent.EXTRA_TEXT)
        val json = JSONObject(str)

        txtUser.setText(json.getString("user"))
        txtEmail.setText(json.getString("email"))

        txt1.setText(json.getString("pr1"))
        txt2.setText(json.getString("pr2"))
        txt3.setText(json.getString("pr3"))
        txt4.setText(json.getString("pr4"))
        txt5.setText(json.getString("pr5"))
        txt6.setText(json.getString("pr6"))
        txt7.setText(json.getString("pr7"))
        txt8.setText(json.getString("pr8"))
        txt9.setText(json.getString("pr9"))

        total.setText((json.getInt("pr1")+json.getInt("pr2")+json.getInt("pr3")+json.getInt("pr4")+json.getInt("pr5")+json.getInt("pr6")+json.getInt("pr7")+json.getInt("pr8")+json.getInt("pr9")).toString())

        share.setOnClickListener(View.OnClickListener {
            val mIntent = Intent()
            mIntent.type = "text/plain"
            mIntent.action = Intent.ACTION_SEND
            mIntent.putExtra(Intent.EXTRA_TEXT, str)
            startActivity(mIntent)
        })
    }

    fun init(){
        txtUser = findViewById(R.id.txtUser)
        txtEmail = findViewById(R.id.txtCorreo)

        txt1 = findViewById(R.id.itxt1)
        txt2 = findViewById(R.id.itxt2)
        txt3 = findViewById(R.id.itxt3)
        txt4 = findViewById(R.id.itxt4)
        txt5 = findViewById(R.id.itxt5)
        txt6 = findViewById(R.id.itxt6)
        txt7 = findViewById(R.id.itxt7)
        txt8 = findViewById(R.id.itxt8)
        txt9 = findViewById(R.id.itxt9)
        total = findViewById(R.id.txtCant)

        share = findViewById(R.id.bt_share)
    }
}
