package fr.android.androidexercises

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.CoreMatchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class LoginActivityTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun isVisible() {
        onView(withId(R.id.passwordEdit)).perform(typeText("okok"))
        onView(withId(R.id.loginButton)).perform(click())
        onView(withId(R.id.loggedText)).check(matches(isDisplayed()))
    }

    @Test
    fun isNotVisible() {
        onView(withId(R.id.passwordEdit)).perform(typeText("ko"))
        onView(withId(R.id.loginButton)).perform(click())
        onView(withId(R.id.loggedText)).check(matches(not(isDisplayed())))
    }
}