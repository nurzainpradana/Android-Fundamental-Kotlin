package com.zainpradana.belajarkotlin.jetpack.myunittesting.viewmodel

import com.zainpradana.belajarkotlin.jetpack.myunittesting.model.CuboidModel

class MainViewModel(private val cuboidModel: CuboidModel) {
    fun getCircumference() = cuboidModel.getCircumference()

    fun getSurfaceArea() = cuboidModel.getSurfaceArea()

    fun getVolume() = cuboidModel.getVolume()

    fun save(w: Double, l: Double, h: Double) {
        cuboidModel.save(w, l, h)
    }
}