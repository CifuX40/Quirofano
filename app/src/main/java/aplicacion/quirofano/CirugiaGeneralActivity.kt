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

        val btnHerniaLaparoscopia = findViewById<Button>(R.id.button4)
        btnHerniaLaparoscopia.setOnClickListener {
            val intent = Intent(this, HerniaLaparoscopiaActivity::class.java)
            startActivity(intent)
        }

        val btnColectomia = findViewById<Button>(R.id.button5)
        btnColectomia.setOnClickListener {
            val intent = Intent(this, ColectomiaActivity::class.java)
            startActivity(intent)
        }

        val btnPancreatectomia = findViewById<Button>(R.id.button6)
        btnPancreatectomia.setOnClickListener {
            val intent = Intent(this, PancreatectomiaActivity::class.java)
            startActivity(intent)
        }

        val btnApendicetomia = findViewById<Button>(R.id.button7)
        btnApendicetomia.setOnClickListener {
            val intent = Intent(this, ApendicetomiaActivity::class.java)
            startActivity(intent)
        }

        val btnLaparotomia = findViewById<Button>(R.id.button8)
        btnLaparotomia.setOnClickListener {
            val intent = Intent(this, LaparotomiaActivity::class.java)
            startActivity(intent)
        }

        val btnHerniaHiato = findViewById<Button>(R.id.button9)
        btnHerniaHiato.setOnClickListener {
            val intent = Intent(this, HerniaHiatoActivity::class.java)
            startActivity(intent)
        }

        val btnHemorroidectomia = findViewById<Button>(R.id.button10)
        btnHemorroidectomia.setOnClickListener {
            val intent = Intent(this, HemorroidectomiaActivity::class.java)
            startActivity(intent)
        }
    }
}