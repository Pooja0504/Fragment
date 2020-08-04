package pooja.jadhav.fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText editText;
    static String s_username;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edName);
        button=findViewById(R.id.activity_my_button);
        s_username=editText.getText().toString();



    }

    public void go(View view) {
        Intent intent=new Intent(MainActivity.this,MainActivity3.class);
        startActivity(intent);
    }
}