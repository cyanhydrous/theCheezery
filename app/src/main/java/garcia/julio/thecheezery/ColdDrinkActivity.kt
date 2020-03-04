package garcia.julio.thecheezery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cold_drink.*

class ColdDrinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cold_drink)

        btn_naranja.setOnClickListener{
            Toast.makeText(applicationContext, "Mmm... juguito de naranja", Toast.LENGTH_SHORT).show()
        }

        btn_uva.setOnClickListener{
            Toast.makeText(applicationContext, "Mmm... juguito de uva", Toast.LENGTH_SHORT).show()
        }
    }
}
