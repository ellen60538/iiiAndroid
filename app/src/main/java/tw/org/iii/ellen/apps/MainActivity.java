package tw.org.iii.ellen.apps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private TextView tv1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tx1) ;
    }

    public void click(View view) {

        HashSet<Integer> set = new HashSet<>() ;
        while (set.size() < 6){
            set.add((int)(Math.random()*49 + 1)) ;
        }
        Log.v("ellen",set.toString()) ;
        tv1.setText(set.toString()) ;

    }
}
