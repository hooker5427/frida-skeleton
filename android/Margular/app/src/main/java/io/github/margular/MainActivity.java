package io.github.margular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSpeak = (Button) findViewById(R.id.btnSpeak);
        btnSpeak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSpeak:
                Toast.makeText(getApplicationContext(), getBestLanguage() + " is the best"
                        + " programming language of the world!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private String getBestLanguage() {
        return "Python";
    }
}