package aplicacion.quirofano

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CirugiaPlasticaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cirugia_plastica)

        val btnMastectomia = findViewById<Button>(R.id.buttonMastectomia)
        btnMastectomia.setOnClickListener {
            val intent = Intent(this, MastectomiaActivity::class.java)
            startActivity(intent)
        }

        val btnProtesisMamaria = findViewById<Button>(R.id.buttonProtesisMamaria)
        btnProtesisMamaria.setOnClickListener {
            val intent = Intent(this, ProtesisMamariaActivity::class.java)
            startActivity(intent)
        }
    }
}
