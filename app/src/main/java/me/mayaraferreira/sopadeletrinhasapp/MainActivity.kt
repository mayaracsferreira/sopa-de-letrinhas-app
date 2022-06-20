package me.mayaraferreira.sopadeletrinhasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import me.mayaraferreira.sopadeletrinhasapp.moduleone.ModuleOneActivity
import me.mayaraferreira.sopadeletrinhasapp.moduletwo.ModuleTwoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButtons()
    }

    private fun setupButtons() {
        findViewById<Button>(R.id.btn_module_one).setOnClickListener {
            navigateToModuleOne()
        }
        findViewById<Button>(R.id.btn_module_two).setOnClickListener {
            navigateToModuleTwo()
        }
    }

    private fun navigateToModuleOne() {
        val intent = Intent(this, ModuleOneActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToModuleTwo() {
        val intent = Intent(this, ModuleTwoActivity::class.java)
        startActivity(intent)
    }
}