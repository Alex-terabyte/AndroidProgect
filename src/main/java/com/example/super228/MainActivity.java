package com.example.super228;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void  onButtonClick(View v){
         EditText Diam = (EditText)findViewById(R.id.Diametr);
         EditText Cost = (EditText)findViewById(R.id.Cost);
         TextView CostSM2 = (TextView) findViewById(R.id.Cost_sm2);
         TextView S = (TextView)findViewById(R.id.S);
         TextView ukus = (TextView)findViewById(R.id.ukus);

         int Diam1 = Integer.parseInt(Diam.getText().toString());
         int Cost1 = Integer.parseInt(Cost.getText().toString());
         double DiamPol = Diam1*0.5;
         double D2 = Math.pow(DiamPol,2);
         double S1 = 3.14*D2;
         double ResCostSM2 = Cost1/S1;
         CostSM2.setText(Double.toString(ResCostSM2));
         S.setText(Double.toString(S1));
         double U = ResCostSM2*2.5;
         ukus.setText(Double.toString(U));

     }
}

