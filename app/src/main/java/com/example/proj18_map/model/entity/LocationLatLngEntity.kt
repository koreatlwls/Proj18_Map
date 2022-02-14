package com.example.proj18_map.model.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LocationLatLngEntity(
    val latitude : Float,
    val longitude:Float
): Parcelable
