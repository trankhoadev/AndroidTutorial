package com.example.customgridview;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVcourses);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.java));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.java_fx));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.php));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.ruby));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.web));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.wordpress));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}
