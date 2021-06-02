package com.musicplayer.commons.samples.activities

import android.os.Bundle
import com.musicplayer.commons.activities.BaseSimpleActivity
import com.musicplayer.commons.extensions.appLaunched
import com.musicplayer.commons.samples.BuildConfig
import com.musicplayer.commons.samples.R
import java.util.*

class MainActivity : BaseSimpleActivity() {
    override fun getAppLauncherName() = getString(R.string.smtco_app_name)

    override fun getAppIconIDs(): ArrayList<Int> {
        val ids = ArrayList<Int>()
        ids.add(R.mipmap.commons_launcher)
        return ids
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appLaunched(BuildConfig.APPLICATION_ID)

        /*val letters = arrayListOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q")
        StringsAdapter(this, letters, media_grid, media_refresh_layout) {
        }.apply {
            media_grid.adapter = this
        }

        media_refresh_layout.setOnRefreshListener {
            Handler().postDelayed({
                media_refresh_layout.isRefreshing = false
            }, 1000L)
        }*/
    }
}
