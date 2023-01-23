package cn.year.jarforthenewyear

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javafx.application.Platform

class Delay {
    companion object {

        private val cachedPool: ExecutorService = Executors.newCachedThreadPool()

        private val fixedPool: ExecutorService = Executors.newFixedThreadPool(4)

        fun runCached(run: Runnable) {
            cachedPool.submit(run)
        }

        fun runFixed(run: Runnable) {
            fixedPool.submit(run)
        }

        fun runInUIThread(run: Runnable) {
            Platform.runLater(run)
        }
        @JvmStatic
        fun delayRunInUIThread(run: Runnable, delay: Int) {
            Delay.runCached {
                try {
                    Thread.sleep(delay.toLong())
                    Delay.runInUIThread(run)
                } catch (e: InterruptedException) {
                }
            }
        }

    }
}