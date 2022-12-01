package fr.android.androidexercises

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LibraryActivity : AppCompatActivity(), Step0Fragment.OnNextStep0Listener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // replace Step0Fragment in containerFrameLayout
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerFrameLayout, Step0Fragment() )
            .commit()
    }

    // implement onNext() from Step0Fragment.OnNextStep0Listener
    override fun onNext(){
        supportFragmentManager.beginTransaction()
            //.replace(R.id.containerFrameLayout, Step1Fragment(), "Step2Fragment")
            .replace(R.id.containerFrameLayout, Step1Fragment())
            //.addToBackStack("Step1Fragment")
            .addToBackStack(Step1Fragment::class.java.name)
            .commit()
    }
}
