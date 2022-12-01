package fr.android.androidexercises

import io.mockk.mockk
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class LoginPresenterTest {
    // TODO test login presenter with JUnit and MockK

    @Before
    fun setUp(){

    }

    @Test
    fun check_valid_password(){
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