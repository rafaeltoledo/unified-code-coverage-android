package net.rafaeltoledo.coverage.another;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AnotherModuleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_module);
    }

    public void onClick(View view) {
        ((Button)view).setText("hello");
    }
}
