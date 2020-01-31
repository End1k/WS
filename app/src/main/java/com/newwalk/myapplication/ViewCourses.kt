package com.newwalk.myapplication

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

class ViewCourses(context: Context, attributeSet: AttributeSet) : View(context, attributeSet){

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        //g?.draw(canvas)
        invalidate()
    }
}