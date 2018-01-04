package tw.com.pcschool.dd2018010402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str[] = new String[] {"AA", "BB", "CC"};
        ListView lv = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    MainActivity.this,
                android.R.layout.simple_list_item_1,
                str
        );
        lv.setAdapter(adapter);


    }
}
