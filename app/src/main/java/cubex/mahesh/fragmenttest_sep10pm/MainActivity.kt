package cubex.mahesh.fragmenttest_sep10pm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fManager = supportFragmentManager
        var tx = fManager.beginTransaction()
        tx.add(R.id.frag1,HomeFrag())
        tx.commit()

        home.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,HomeFrag())
            tx.commit()
        }
        courses.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,CoursesFrag())
            tx.commit()
        }
        materials.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,MaterialsFrag())
            tx.commit()
        }

    }
}
