package com.mario.evaluacin_1_pdm_00046517

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var prod1: LinearLayout
    private lateinit var prod2: LinearLayout
    private lateinit var prod3: LinearLayout
    private lateinit var prod4: LinearLayout
    private lateinit var prod5: LinearLayout
    private lateinit var prod6: LinearLayout
    private lateinit var prod7: LinearLayout
    private lateinit var prod8: LinearLayout
    private lateinit var prod9: LinearLayout

    private lateinit var txt2: TextView
    private lateinit var txt3: TextView
    private lateinit var txt4: TextView
    private lateinit var txt5: TextView
    private lateinit var txt6: TextView
    private lateinit var txt7: TextView
    private lateinit var txt8: TextView
    private lateinit var txt9: TextView
    private lateinit var txt1: TextView

    private lateinit var etUser: EditText
    private lateinit var etEmail: EditText
    private lateinit var btnSend: Button


    private var contador1: Int = 0
    private var contador2: Int = 0
    private var contador3: Int = 0
    private var contador4: Int = 0
    private var contador5: Int = 0
    private var contador6: Int = 0
    private var contador7: Int = 0
    private var contador8: Int = 0
    private var contador9: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        prod1.setOnClickListener(View.OnClickListener {
            contador1++
            txt1.setText((contador1).toString())
        })

        prod2.setOnClickListener(View.OnClickListener {
            contador2++
            txt2.setText((contador2).toString())
        })

        prod3.setOnClickListener(View.OnClickListener {
            contador3++
            txt3.setText((contador3).toString())
        })

        prod4.setOnClickListener(View.OnClickListener {
            contador4++
            txt4.setText((contador4).toString())
        })

        prod5.setOnClickListener(View.OnClickListener {
            contador5++
            txt5.setText((contador5).toString())
        })

        prod6.setOnClickListener(View.OnClickListener {
            contador6++
            txt6.setText((contador6).toString())
        })

        prod7.setOnClickListener(View.OnClickListener {
            contador7++
            txt7.setText((contador7).toString())
        })

        prod8.setOnClickListener(View.OnClickListener {
            contador8++
            txt8.setText((contador8).toString())
        })

        prod9.setOnClickListener(View.OnClickListener {
            contador9++
            txt9.setText((contador9).toString())
        })

        btnSend.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this,Factura::class.java)



            val jsonInfo: String = "{user:\""+etUser.text+"\",email:\""+etEmail.text+"\",pr1:\""+txt1.text+"\",pr2:\""+txt2.text+"\",pr3:\""+txt3.text+"\",pr4:\""+txt4.text+"\",pr5:\""+txt5.text+"\",pr6:\""+txt6.text+"\",pr7:\""+txt7.text+"\",pr8:\""+txt8.text+"\",pr9:\""+txt9.text+"\"}"

            intent.putExtra(Intent.EXTRA_TEXT,jsonInfo)
            startActivity(intent)
        })

    }

    fun bind(){
        prod1 = findViewById(R.id.bt_1)
        prod2 = findViewById(R.id.bt_2)
        prod3 = findViewById(R.id.bt_3)
        prod4 = findViewById(R.id.bt_4)
        prod5 = findViewById(R.id.bt_5)
        prod6 = findViewById(R.id.bt_6)
        prod7 = findViewById(R.id.bt_7)
        prod8 = findViewById(R.id.bt_8)
        prod9 = findViewById(R.id.bt_9)

        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)
        txt3 = findViewById(R.id.txt3)
        txt4 = findViewById(R.id.txt4)
        txt5 = findViewById(R.id.txt5)
        txt6 = findViewById(R.id.txt6)
        txt7 = findViewById(R.id.txt7)
        txt8 = findViewById(R.id.txt8)
        txt9 = findViewById(R.id.txt9)

        etUser = findViewById(R.id.txt_user)
        etEmail = findViewById(R.id.txt_corroe)
        btnSend = findViewById(R.id.btn_send)
    }
}
