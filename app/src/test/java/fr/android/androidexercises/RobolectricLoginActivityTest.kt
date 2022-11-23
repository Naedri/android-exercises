package fr.android.androidexercises

import android.opengl.Visibility
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric.buildActivity
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class RobolectricLoginActivityTest {
    @Test
    fun uiTestOk() {
        // GIVEN
        val controller = buildActivity(LoginActivity::class.java).setup()


        // WHEN
        controller.get().findViewById<EditText>(R.id.passwordEdit).setText("okok")
        controller.get().findViewById<Button>(R.id.loginButton).performClick()

        // THEN
        assert(
            controller.get().findViewById<TextView>(R.id.loggedText).visibility == View.VISIBLE
        )
    }

    @Test
    fun uiTestKo() {
        // GIVEN
        val controller = buildActivity(LoginActivity::class.java).setup()


        // WHEN
        controller.get().findViewById<EditText>(R.id.passwordEdit).setText("ko")
        controller.get().findViewById<Button>(R.id.loginButton).performClick()

        // THEN
        assert(
            controller.get().findViewById<TextView>(R.id.loggedText).visibility == View.GONE
        )
    }
}