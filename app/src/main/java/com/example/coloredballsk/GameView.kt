package com.example.coloredballsk

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.Log
import android.view.MotionEvent
import android.view.View

class GameView (ctx: Context) : View(ctx) {
    var h = 1000; var w = 1000 // значения по умолчанию, будут заменены в onLayout()
    val paint = Paint() // краска, цвет и стиль отрисовки

    // TODO: определить класс Circle со следующими свойствами:
    // координаты центра, радиус, метод для определения касания (находится ли точка внутри круга)

    // TODO: сгенерировать массив кружков со случайными координатами без перекрытий

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        h = bottom - top; w = right - left
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paint.color = Color.GRAY
        paint.style = Paint.Style.STROKE
        canvas.drawColor(Color.GREEN)

        // TODO: нарисовать шарики и лузу в текущем положении
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        event?.let  {
            when (it.action) {
                // координаты касания тут >> it.x и it.y
                MotionEvent.ACTION_DOWN -> Log.d("mytag","нажали")
                MotionEvent.ACTION_UP -> Log.d("mytag","отпустили")
                // TODO: при отпускании проверить, находится ли кружок в "лузе"

                else -> {}
            }
            // TODO: когда срабатывает нажатие - определить какого кружка коснулся пользователь
            // Предусмотрите два состояния: тащим кружок или нет
            // Если состояние "тащим кружок", меняйте его координату в соответствии с точкой касания

            //
        }
        return super.onTouchEvent(event)
    }
}