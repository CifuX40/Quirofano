package aplicacion.quirofano

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CirugiaVascularActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cirugia_vascular)

        val btnEndarterectomia = findViewById<Button>(R.id.buttonEndarterectomia)
        btnEndarterectomia.setOnClickListener {
            val intent = Intent(this, EndarterectomiaActivity::class.java)
            startActivity(intent)
        }

        val btnVaricesConvencional = findViewById<Button>(R.id.buttonVaricesConvencional)
        btnVaricesConvencional.setOnClickListener {
            val intent = Intent(this, VaricesConvencionalActivity::class.java)
            startActivity(intent)
        }

        val btnVaricesRadiofrecuencia = findViewById<Button>(R.id.buttonVaricesRadiofrecuencia)
        btnVaricesRadiofrecuencia.setOnClickListener {
            val intent = Intent(this, VaricesRadiofrecuenciaActivity::class.java)
            startActivity(intent)
        }
    }
}