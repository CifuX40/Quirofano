package aplicacion.quirofano

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TraumatologiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.traumatologia)

        findViewById<Button>(R.id.buttonLigamentosCruzados).setOnClickListener {
            startActivity(Intent(this, LigamentosCruzadosActivity::class.java))
        }

        findViewById<Button>(R.id.buttonMeniscectomia).setOnClickListener {
            startActivity(Intent(this, MeniscectomiaActivity::class.java))
        }

        findViewById<Button>(R.id.buttonTendonAquiles).setOnClickListener {
            startActivity(Intent(this, TendonAquilesActivity::class.java))
        }

        findViewById<Button>(R.id.buttonTumorPartesBlandas).setOnClickListener {
            startActivity(Intent(this, TumorPartesBlandasProfundasActivity::class.java))
        }

        findViewById<Button>(R.id.buttonFracturaHumero).setOnClickListener {
            startActivity(Intent(this, FracturaHumeroActivity::class.java))
        }

        findViewById<Button>(R.id.buttonTunelCarpiano).setOnClickListener {
            startActivity(Intent(this, TunelCarpianoActivity::class.java))
        }

        findViewById<Button>(R.id.buttonArtroplastiaHombro).setOnClickListener {
            startActivity(Intent(this, ArtroplastiaHombroActivity::class.java))
        }

        findViewById<Button>(R.id.buttonMicrocirugiaNervios).setOnClickListener {
            startActivity(Intent(this, MicrocirugiaNerviosActivity::class.java))
        }

        findViewById<Button>(R.id.buttonFusionesVertebrales).setOnClickListener {
            startActivity(Intent(this, FusionesVertebralesActivity::class.java))
        }

        findViewById<Button>(R.id.buttonRizolisis).setOnClickListener {
            startActivity(Intent(this, RizolisisActivity::class.java))
        }
    }
}