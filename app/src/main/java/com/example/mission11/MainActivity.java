package com.example.mission11;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();

    int summ;
    int nums;
    int count=0;
    
    int sum=0;
    int sum2=0;
    int sum3=0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    TextView tV1;
    TextView tV2;
    TextView tV3;
    TextView tV4;
    TextView tV5;
    TextView tV6;
    TextView tV7;

    EditText eT1;
    EditText eT2;
    EditText eT3;
    ImageView[] iV=new ImageView[3];

    int [] id=new int[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 =findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        btn3 =findViewById(R.id.btn3);
        btn4 =findViewById(R.id.btn4);



        tV1 =findViewById(R.id.tV1);
        tV2 =findViewById(R.id.tV2);
        tV3 =findViewById(R.id.tV3);
        tV4 =findViewById(R.id.tV4);
        tV5 =findViewById(R.id.tV5);
        tV6 =findViewById(R.id.tV6);
        tV7 =findViewById(R.id.tV7);



        eT1 = (EditText) findViewById(R.id.eT1);
        eT2 = (EditText) findViewById(R.id.eT2);
        eT3 = (EditText) findViewById(R.id.eT3);
        iV[0] =(ImageView) findViewById(R.id.iV);
        iV[1] =(ImageView) findViewById(R.id.iV2);
        iV[2] = (ImageView) findViewById(R.id.iV3);

        // תמונות

        id[0]=R.drawable.correct;
        id[1]=R.drawable.worng;

        // נותן מספר רנדומלי
        int randomNumber = rnd.nextInt(100) + 1;

        // הצגת המספר
        tV1.setText(String.valueOf(randomNumber));

        // נותן מספר רנדומלי
        int randomNumber3 = rnd.nextInt(100) + 1;

        // הצגת המספר
        tV6.setText(String.valueOf(randomNumber3));

        // נותן מספר רנדומלי
        int randomNumber1 = rnd.nextInt(100) + 1;

        // הצגת המספר
        tV5.setText(String.valueOf(randomNumber1));


        // נותן מספר רנדומלי
        int randomNumber2 = rnd.nextInt(100) + 1;

        // הצגת המספר
        tV4.setText(String.valueOf(randomNumber2));

        // מחשב את הsum
        sum2 = randomNumber + randomNumber2 + randomNumber1 ;
        sum = randomNumber + randomNumber2 ;
        sum3 = sum2+randomNumber3;

        //הצגת מספרים
        tV3.setText(String.valueOf(sum2));
        tV2.setText(String.valueOf(sum));

        // הופך אותם לבלתי נראה
        tV2.setVisibility(View.INVISIBLE);
        tV5.setVisibility(View.INVISIBLE);
        eT2.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        tV3.setVisibility(View.INVISIBLE);
        tV6.setVisibility(View.INVISIBLE);
        eT3.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
    }
    //  בודק אם הטוסט ריק אם כן הוא שולח הודעה מסוימת
    public void clicked5(View view) {
        if (eT1.getText().toString().isEmpty()) {
            Toast.makeText(this, "please enter a number and please do not use letters ", Toast.LENGTH_SHORT).show();
        }
    }
    //שורה ראשונה

    public void clicked1(View view) {


        if (Integer.parseInt(eT1.getText().toString()) == sum) {

            iV[0].setImageResource(id[0]);
            tV2.setVisibility(View.VISIBLE);
            tV5.setVisibility(View.VISIBLE);
            eT2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            count ++;
            nums = nums + 33;
            summ++;
        } else {
            iV[0].setImageResource(id[1]);
            tV2.setVisibility(View.VISIBLE);
            tV5.setVisibility(View.VISIBLE);
            eT2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            summ++;
        }

    }

    //  בודק אם הטוסט ריק אם כן הוא שולח הודעה מסוימת
    public void clicked6(View view) {
        if (eT2.getText().toString().isEmpty()) {
            Toast.makeText(this, "please enter a number and please do not use letters ", Toast.LENGTH_SHORT).show();
        }
    }
    // שורה שניה

    public void clicked2(View view) {

        if (Integer.parseInt(eT1.getText().toString()) == sum) {
            iV[1].setImageResource(id[0]);
            tV3.setVisibility(View.VISIBLE);
            tV6.setVisibility(View.VISIBLE);
            eT3.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            count ++;
            nums = nums + 33;
            summ++;
        } else {
            iV[1].setImageResource(id[1]);
            tV3.setVisibility(View.VISIBLE);
            tV6.setVisibility(View.VISIBLE);
            eT3.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            summ++;
        }
    }

    //  בודק אם הטוסט ריק אם כן הוא שולח הודעה מסוימת
    public void clicked7(View view) {
            if (eT3.getText().toString().isEmpty())
            {
                Toast.makeText(this, "please enter a number and please do not use letters ", Toast.LENGTH_SHORT).show();
            }
    }

    // שורה שלישית

    public void clicked3(View view)
    {

        if(Integer.parseInt(eT1.getText().toString()) == sum)
        {

            iV[2].setImageResource(id[0]);
            count ++;
            nums = nums + 34;
            summ++;
        }else
        {
            iV[2].setImageResource(id[1]);
            summ++;
        }

        //התוצאות

        if (summ == 3)
        {

            tV7.setText(count + "/3   ,"+ nums + "/100" );
            Toast.makeText(this, "Game over", Toast.LENGTH_SHORT).show();

        }

    }

    // איפוס
    public void clicked4(View view)
    {

        Intent t= new Intent(MainActivity.this,MainActivity.class);
        startActivity(t);
        finish();

    }
}