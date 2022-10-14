package ravi.mycompany.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onConvertINRToUSD(View view) {
        Double multiplier = 82.3;

        EditText inputtedINRValue = (EditText) findViewById(R.id.editINRCurrency);
        Double formattedINRValue = Double.parseDouble(inputtedINRValue.getText().toString());

        Double inrToUSD = formattedINRValue * multiplier;

        Toast.makeText(this, inputtedINRValue.getText().toString()+ " INR in USD is $"+inrToUSD.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}