package com.example.kotlin_sharedpreferences

import android.content.Context

class Prefs (val context: Context) {
//necesitamos darle un contexto pues por defecto no tiene ninguno
    val SHARED_NAME = "MyDataBase" //nombgre de mi BBDD, LO PONgo en mayus porq quiero q sea una cte
    val SHARED_USERNAME = "username"
    val SHARED_VIP ="vip"
    val storage = context.getSharedPreferences(SHARED_NAME, 0)  //modo de BBDD: 0
    fun saveName(name:String){
        storage.edit().putString(SHARED_USERNAME, name).apply()  //con esto guardo el nombre del usuario

    }
    fun saveVIP(vip:Boolean){
        storage.edit().putBoolean(SHARED_VIP,vip).apply()
    }
    //CON LO escrito anteriormente puedo guardar valores, pero no puedo recuperar
    fun getName(): String {
        return storage.getString(SHARED_USERNAME, "") !!//necesita un valor vacio si no hay nada
    }

    fun getVip(): Boolean {
        return storage.getBoolean(SHARED_VIP, false)

    }
}