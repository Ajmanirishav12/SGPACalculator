package com.example.sgpa_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText et1, et2, et3, et4, et5, et6,et7,et8,c1,c2,c3,c4,c5,c6,c7,c8;
    int marks,tot_crr;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tot_crr=0;
        marks=0;
    }
    public void calc(View view) {
        int temp_cre = 0;
        marks = 0;
        tot_crr=0;
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);
        et7 = findViewById(R.id.et7);
        et8 = findViewById(R.id.et8);
        int a, b, c, d, e, f, g, h;
        a = Integer.parseInt(et1.getText().toString());
        b = Integer.parseInt(et2.getText().toString());
        c = Integer.parseInt(et3.getText().toString());
        d = Integer.parseInt(et4.getText().toString());
        e = Integer.parseInt(et5.getText().toString());
        f = Integer.parseInt(et6.getText().toString());
        g = Integer.parseInt(et7.getText().toString());
        h = Integer.parseInt(et8.getText().toString());
        String grade1 = finder(a);
        String grade2 = finder(b);
        String grade3 = finder(c);
        String grade4 = finder(d);
        String grade5 = finder(e);
        String grade6 = finder(f);
        String grade7 = finder(g);
        String grade8 = finder(h);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);
        int cr1, cr2, cr3, cr4, cr5, cr6, cr7, cr8;
        cr1 = Integer.parseInt(c1.getText().toString());
        cr2 = Integer.parseInt(c2.getText().toString());
        cr3 = Integer.parseInt(c3.getText().toString());
        cr4 = Integer.parseInt(c4.getText().toString());
        cr5 = Integer.parseInt(c5.getText().toString());
        cr6 = Integer.parseInt(c6.getText().toString());
        cr7 = Integer.parseInt(c7.getText().toString());
        cr8 = Integer.parseInt(c8.getText().toString());
        tot_crr = cr1 + cr2 + cr3 + cr4 + cr5 + cr6 + cr7 + cr8;
        temp_cre = findcred(grade1, cr1);
        marks = marks + temp_cre;
        temp_cre = findcred(grade2, cr2);
        marks = marks + temp_cre;
        temp_cre = findcred(grade3, cr3);
        marks = marks + temp_cre;
        temp_cre = findcred(grade4, cr4);
        marks = marks + temp_cre;
        temp_cre = findcred(grade5, cr5);
        marks = marks + temp_cre;
        temp_cre = findcred(grade6, cr6);
        marks = marks + temp_cre;
        temp_cre = findcred(grade6, cr7);
        marks = marks + temp_cre;
        temp_cre = findcred(grade6, cr8);
        marks = marks + temp_cre;
        double Sgpa = (double) ((double) marks / (double) tot_crr);
        if (tot_crr != 0)
            Toast.makeText(MainActivity.this, "SGPA is =" + (String.format("%.2f", Sgpa)), Toast.LENGTH_LONG).show();
        else
        {
            Toast.makeText(MainActivity.this, "SGPA is = NULL",Toast.LENGTH_LONG).show();
        }
        }
    public String finder(int num)
        {
         if(num>=90 &&  num<=100)
             return "O";
         else
         {
         if(num>=80 && num<=89)
             return "E";
         else
         {
          if(num>=70 && num<=79)
              return "A";
          else
          {
           if(num>=60 && num<=69)
               return "B";
           else
           {
            if(num>=50 && num<=59)
                return "C";
            else
                return "F";
            }
           }
          }
         }
         }
         public int findcred(String s,int c)
         {
          if(s.equals("O"))
             return 10*c;
          else
          {
           if(s.equals("E"))
               return 9*c;
           else
           {
           if(s.equals("A"))
             return 8*c;
           else
           {
            if(s.equals("B"))
                return 7*c;
            else
            {
            if(s.equals("C"))
                return 6*c;
            else
                return 5*c;
            }
           }
           }
          }
         }

}