package org.fossify.calendar.helpers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import org.fossify.calendar.extensions.launchNewEventOrTaskActivity

class MyWidgetActionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            "prev" -> MyWidgetMonthlyProvider().getPrevMonth(context)
            "next" -> MyWidgetMonthlyProvider().getNextMonth(context)
            "go_to_today" -> MyWidgetMonthlyProvider().goToToday(context)
            "new_event" -> context.launchNewEventOrTaskActivity()
        }
    }
}
