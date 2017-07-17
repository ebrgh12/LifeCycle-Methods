package com.example.girish.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Context context;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext()," OnCreate method", Toast.LENGTH_SHORT).show();
    button1 =(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.myCoordinatorLayout),"SnackBar display ", Snackbar.LENGTH_INDEFINITE);
                snackbar.show();
                //Intent i =new Intent(MainActivity.this,Main2Activity.class);
                //Or use this
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);

            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext()," OnStart method", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext()," OnResume method", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext()," OnPause method", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext()," OnStop method", Toast.LENGTH_SHORT).show();
    }
@Override
    protected void onDestroy(){
    super.onDestroy();
    Toast.makeText(getApplicationContext()," OnDestroy method", Toast.LENGTH_SHORT).show();
}




}
