package aplicacion.quirofano

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UrologiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.urologia)

        val btnCircuncision = findViewById<Button>(R.id.buttonCircuncision)
        btnCircuncision.setOnClickListener {
            val intent = Intent(this, CircuncisionActivity::class.java)
            startActivity(intent)
        }

        val btnCistoscopia = findViewById<Button>(R.id.buttonCistoscopia)
        btnCistoscopia.setOnClickListener {
            val intent = Intent(this, CistoscopiaActivity::class.java)
            startActivity(intent)
        }

        val btnVasectomia = findViewById<Button>(R.id.buttonVasectomia)
        btnVasectomia.setOnClickListener {
            val intent = Intent(this, VasectomiaActivity::class.java)
            startActivity(intent)
        }
    }
}