package sg.edu.rp.soi.c346p09quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Formula> alFormula;
    ArrayAdapter<Formula> aaFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        //arrayList
        alFormula = new ArrayList<>();
        Formula a = new Formula("Area of rectangle","Length x Length","Formula type is: Area");
        Formula b = new Formula("Area of triangle","Length of base x Length 1/2","Formula type is: Area");
        Formula c = new Formula("Volume of cube","Length x Length x Length","Formula type is: volume");

        alFormula.add(a);
        alFormula.add(b);
        alFormula.add(c);

        //array adapter
        FormulaAdapter adapter = new FormulaAdapter(MainActivity.this,R.layout.row,alFormula);
        lv.setAdapter(adapter);

    }
}
