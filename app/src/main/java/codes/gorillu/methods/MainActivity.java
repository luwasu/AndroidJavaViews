package codes.gorillu.methods;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("lalalalalalalalalalalalalalalalalala");
        textView.setTextColor(Color.GREEN);
        textView.setTextSize(56);
        textView.setMaxLines(1);


        setContentView(textView);
    }
}
