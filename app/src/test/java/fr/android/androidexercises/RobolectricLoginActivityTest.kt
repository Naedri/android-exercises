package fr.android.androidexercises

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class RobolectricLoginActivityTest {
    // TODO test login activity with Robolectric and MockK

    @Test
    fun check_valid_password(){
        //onView(withId(R.id.name_field)).perform(typeText("Steve"))

        //GIVEN
        val activity: LoginActivity = mockk(relaxed=true)
        val presenter = LoginPresenter(activity)
        // WHEN
        presenter.checkCredentials("toto")
        // THEN
        verify {
            // on appelle le mock, cela plante pas mais on pourra vérfier qu'il a été appelé
            activity.logged()
        }
    }

}