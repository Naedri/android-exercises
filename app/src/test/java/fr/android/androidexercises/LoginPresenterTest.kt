package fr.android.androidexercises

import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class LoginPresenterTest {
    @Test
    fun testNoLogin() {
        val activity = mockk<LoginActivity>(relaxed = true)
        val presenter = LoginPresenter(activity)
        presenter.checkCredentials("no")

        verify { activity.notLogged() }
    }

    fun testLogin() {
        val activity = mockk<LoginActivity>(relaxed = true)
        val presenter = LoginPresenter(activity)
        presenter.checkCredentials("okok")

        verify { activity.logged() }
    }
}