package com.matthewchen.togetherad

import android.app.Application
import com.matthewchen.togetherad.utils.Kits
import com.rumtel.ad.TogetherAd

/* 
 * (●ﾟωﾟ●)
 * 
 * Created by Matthew_Chen on 2018/12/26.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        TogetherAd.setPreMoiveMarginTopSize(Kits.StatuBar.getStatusBarHeight(this))
    }
}