package com.example.dell_pc.javaisfun;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;


public class Notificacoes extends AppCompatActivity {

    TimePicker timePicker;
    public int h;
    public int m;
    AlarmManager alarmManager;
    PendingIntent pendingIntent;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacoes);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);
        findViewById(R.id.setAlarmButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h = timePicker.getCurrentHour();
                m = timePicker.getCurrentMinute();
                startAlarm();
            }
        });
        findViewById(R.id.cancelAlarm).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                cancelAlarm();
            }
        });
    }

    public void cancelAlarm() {
        if (alarmManager != null) {
            alarmManager.cancel(pendingIntent);
        }

    }


    public void startAlarm() {
        Calendar calendar = Calendar.getInstance();
        Intent intent = new Intent(getApplicationContext(), Notification_receiver.class);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 100, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        calendar.set(Calendar.HOUR_OF_DAY, h);
        calendar.set(Calendar.MINUTE, m);
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 1000 * 60 * 60 * 24, pendingIntent);
        Toast.makeText(Notificacoes.this, "Alarme definido para " + h + ":0" + m + "min", Toast.LENGTH_SHORT).show();
    }
}

