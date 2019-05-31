package sg.edu.rp.c346.demotips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listViewExamTips;
    String [] lvExamTips;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewExamTips = findViewById(R.id.listViewExamTips);
        lvExamTips = new String[5];
        lvExamTips[0] = "Prepaid way before the exam";
        lvExamTips[1] = "Practice coding";
        lvExamTips[2] = "Seek help from lecturer";
        lvExamTips[3] = "Prepare template code";
        lvExamTips[4] = "Create empty projects for MSA";

        aa = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,lvExamTips);
        listViewExamTips.setAdapter(aa);



    }
}
