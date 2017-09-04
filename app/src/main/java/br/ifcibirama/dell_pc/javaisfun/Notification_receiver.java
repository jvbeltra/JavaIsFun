package br.ifcibirama.dell_pc.javaisfun;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

/**
 * Created by Joao on 08/08/2017.
 */

public class Notification_receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService
                (context.NOTIFICATION_SERVICE);

        Intent repeating_intent = new Intent(context, MainActivity.class);
        repeating_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 100, repeating_intent, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder.setSmallIcon(R.drawable.microchip);
            builder.setVisibility(Notification.VISIBILITY_PUBLIC);
            builder.setPriority(1);
            builder.setVibrate(new long[]{1000, 1000});
            builder.setContentIntent(pendingIntent);
            builder.setSmallIcon(R.mipmap.ic_launcher);
            builder.setContentTitle("Não esqueça de praticar!");
            builder.setContentText("Que tal dar uma praticada no bom e velho Java?");
//          builder.setAutoCancel(true);
            notificationManager.notify(100, builder.build());

        } else {
            builder.setSmallIcon(R.drawable.microchip);
            builder.setVisibility(Notification.VISIBILITY_PUBLIC);
            builder.setPriority(1);
            builder.setVibrate(new long[]{1000, 1000});
            builder.setContentIntent(pendingIntent);
            builder.setSmallIcon(R.mipmap.ic_launcher);
            builder.setContentTitle("Não esqueça de praticar!");
            builder.setContentText("Que tal dar uma praticada no bom e velho Java?");
//          builder.setAutoCancel(true);
            notificationManager.notify(100, builder.build());

        }


//        NotificationCompat.Builder builder = new NotificationCompat.Builder(context)


    }


}

//NotificationCompat.Builder builder = new NotificationCompat.Builder(context)