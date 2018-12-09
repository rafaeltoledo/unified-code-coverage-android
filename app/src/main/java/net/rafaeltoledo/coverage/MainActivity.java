package net.rafaeltoledo.coverage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.com.another.AnotherModuleActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.hide).setOnClickListener(this);
        text = findViewById(R.id.text);

        findViewById(R.id.navigate).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            text.setText("Hello World!");
        } else if(v.getId() == R.id.navigate) {
            startActivity(new Intent(this, AnotherModuleActivity.class));
        } else {
            v.setVisibility(View.GONE);
        }
    }
}
