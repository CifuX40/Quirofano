package aplicacion.quirofano

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CirugiaGeneralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cirugia_general)

        val btnTiroidectomia = findViewById<Button>(R.id.button)
        btnTiroidectomia.setOnClickListener {
            val intent = Intent(this, TiroidectomiaActivity::class.java)
            startActivity(intent)
        }

        val btnColecistectomia = findViewById<Button>(R.id.button2)
        btnColecistectomia.setOnClickListener {
            val intent = Intent(this, ColecistectomiaActivity::class.java)
            startActivity(intent)
        }

        val btnHerniaAbierta = findViewById<Button>(R.id.button3)
        btnHerniaAbierta.setOnClickListener {
            val intent = Intent(this, HerniaAbiertaActivity::class.java)
            startActivity(intent)
        }
    }
}