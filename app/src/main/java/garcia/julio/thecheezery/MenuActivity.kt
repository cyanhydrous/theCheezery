package garcia.julio.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //btn_colddrinks.setOnClickListener{
       //     var intent = Intent(this, ColdDrinkActivity::class.java)
       //     startActivity(intent)
//
        //}

        btn_colddrinks.setOnClickListener{
            var intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }

        //Crear los metodos para todos los produtos en ProductosActivity ya que este es para hot drinks
        btn_hotdrinks.setOnClickListener{
            var intent = Intent(this, ProductosActivity::class.java)
            startActivity(intent)
        }
    }
}
