package com.bh.mycurrencyconveter.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "exchange_rates", primaryKeys = ["currency", "timestamp"])
data class ExchangeRate(
    @ColumnInfo(name = "currency")
    val currency: String,
    @ColumnInfo(name = "usd_convertible_amount")
    val usdConvertibleAmount: Double,
    @ColumnInfo(name = "timestamp")
    val timestamp: Long
)