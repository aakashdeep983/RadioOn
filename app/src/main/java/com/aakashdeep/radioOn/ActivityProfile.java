package com.aakashdeep.radioOn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aakashdeep.radioOn.Models.User;
import com.aakashdeep.radioOn.Services.DataContext;
import com.aakashdeep.radioOn.Services.LocalUserService;
import com.aakashdeep.radioOn.Services.Tools;

public class ActivityProfile extends AppCompatActivity {

    DataContext db = new DataContext(this, null, null, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        User user = LocalUserService.getLocalUserFromPreferences(this);
        TextView tv_UserFullName = (TextView) findViewById(R.id.tv_UserFullName);
        tv_UserFullName.setText(Tools.toProperName(user.FirstName) + " " + Tools.toProperName(user.LastName));
    }
}
