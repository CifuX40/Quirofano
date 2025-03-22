package aplicacion.quirofano

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OtorrinoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otorrino)

        val btnSeptoplastia = findViewById<Button>(R.id.buttonSeptoplastia)
        btnSeptoplastia.setOnClickListener {
            val intent = Intent(this, SeptoplastiaActivity::class.java)
            startActivity(intent)
        }

        val btnFracturaNasal = findViewById<Button>(R.id.buttonFracturaNasal)
        btnFracturaNasal.setOnClickListener {
            val intent = Intent(this, FracturaNasalActivity::class.java)
            startActivity(intent)
        }

        val btnAdenoidectomia = findViewById<Button>(R.id.buttonAdenoidectomia)
        btnAdenoidectomia.setOnClickListener {
            val intent = Intent(this, AdenoidectomiaActivity::class.java)
            startActivity(intent)
        }

        val btnTimpanoplastia = findViewById<Button>(R.id.buttonTimpanoplastia)
        btnTimpanoplastia.setOnClickListener {
            val intent = Intent(this, TimpanoplastiaActivity::class.java)
            startActivity(intent)
        }
    }
}