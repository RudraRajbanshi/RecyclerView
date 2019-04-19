package com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    private CircleImageView circleImage;
    TextView tvName, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circleImage = findViewById(R.id.circleImage);
        tvName = findViewById(R.id.tvName);
        tvPhone = findViewById(R.id.tvPhone);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            circleImage.setImageResource(bundle.getInt("image"));
            tvName.setText(bundle.getString("name"));
            tvPhone.setText(bundle.getString("phone"));
        }
    }
}
