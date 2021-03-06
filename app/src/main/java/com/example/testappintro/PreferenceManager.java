package com.example.testappintro;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {

private Context context;
private SharedPreferences sharedPreferences;
private void getSharedPreferences(){
    sharedPreferences=context.getSharedPreferences(context.getString(R.string.my_preference),context.MODE_PRIVATE);
}
public PreferenceManager(Context context){
    this.context=context;
    getSharedPreferences();
}
public void writePreference()
{
    SharedPreferences.Editor editor=sharedPreferences.edit();
    editor.putString(context.getString(R.string.my_preference_key),"INIT_OK");
    editor.commit();

}
public boolean checkPreference()
{
    boolean status=false;
    if(sharedPreferences.getString(context.getString(R.string.my_preference_key),"null").equals("null"))
    {
        status=false;
    }
    else
    {
        status=true;
    }
    return status;
}
public void clearPreference()
{
    sharedPreferences.edit().clear().commit();
}


}
