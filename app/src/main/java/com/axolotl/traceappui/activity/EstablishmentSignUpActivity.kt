package com.axolotl.traceappui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axolotl.traceappui.R
import com.axolotl.traceappui.utility.launchActivity
import kotlinx.android.synthetic.main.activity_establishment_sign_up.*

class EstablishmentSignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_establishment_sign_up)

        ivEstablishmentSignUpActivityReturn.setOnClickListener {
            launchActivity<FirstActivity> {

            }
        }

        layoutGotoEstablishmentSignIn.setOnClickListener {
            launchActivity<EstablishmentSignInActivity> {

            }
        }
    }
}