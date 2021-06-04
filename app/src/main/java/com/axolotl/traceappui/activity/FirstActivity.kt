package com.axolotl.traceappui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axolotl.traceappui.R
import com.axolotl.traceappui.utility.launchActivity
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        btnContinueCustomer.setOnClickListener {
            launchActivity<CustomerActivity> {

            }
        }

        btnContinueEstablishment.setOnClickListener {
            launchActivity<EstablishmentSignInActivity> {

            }
        }
    }
}