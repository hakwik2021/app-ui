package com.axolotl.traceappui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.axolotl.traceappui.R
import com.axolotl.traceappui.utility.launchActivity
import kotlinx.android.synthetic.main.activity_customer.*

class CustomerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)

        ivCustomerActivityReturn.setOnClickListener {
            launchActivity<FirstActivity> {

            }
        }
    }
}