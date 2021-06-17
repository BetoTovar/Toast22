package com.example.toast22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String Codigo="1231as";
    String Descripcion="1231as";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buton = (Button)findViewById(R.id.button);
        Button buton2 = (Button)findViewById(R.id.button3);



    }



public void toast1 (View view){
    Context context =getApplicationContext();
    CharSequence mensaje="Mensaje en toast";
    int duration=Toast.LENGTH_LONG;

    Toast toast= Toast.makeText(context,mensaje,duration);

    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
    toast.show();

}



public void toast2(View view){
    LayoutInflater inflater = getLayoutInflater();
    View layout = inflater.inflate(R.layout.toast2,null);

    Toast toast = new Toast(getApplicationContext());
    toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
    toast.setDuration(Toast.LENGTH_LONG);
    toast.setView(layout);
    toast.show();


}





}