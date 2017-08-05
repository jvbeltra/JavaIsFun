package com.example.dell_pc.javaisfun;

import android.animation.LayoutTransition;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.transition.ArcMotion;
import android.transition.ChangeBounds;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.Log;
import android.util.SparseArray;
import android.view.DragEvent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TableRow;

import com.google.android.flexbox.FlexboxLayout;

public class Calculos7 extends AppCompatActivity {
    public int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos7);
        findViewById(R.id.textView192).setVisibility(View.GONE);
        findViewById(R.id.textView193).setVisibility(View.GONE);
        findViewById(R.id.imageButton77).setVisibility(View.GONE);
        findViewById(R.id.button28).setOnLongClickListener(new Calculos7.MyOnLongClickListener());
        findViewById(R.id.button19).setOnLongClickListener(new Calculos7.MyOnLongClickListener());
        findViewById(R.id.button23).setOnLongClickListener(new Calculos7.MyOnLongClickListener());
        findViewById(R.id.button24).setOnLongClickListener(new Calculos7.MyOnLongClickListener());
        findViewById(R.id.button25).setOnLongClickListener(new Calculos7.MyOnLongClickListener());
        findViewById(R.id.button26).setOnLongClickListener(new Calculos7.MyOnLongClickListener());
        findViewById(R.id.button27).setOnLongClickListener(new Calculos7.MyOnLongClickListener());
        findViewById(R.id.button21).setOnLongClickListener(new Calculos7.MyOnLongClickListener());
        findViewById(R.id.button22).setOnLongClickListener(new Calculos7.MyOnLongClickListener());



        findViewById(R.id.flexTop).setOnDragListener(new Calculos7.MyOnDragListener(1));
        findViewById(R.id.flexDown).setOnDragListener(new Calculos7.MyOnDragListener(2));
    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Calculos7.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
    public void proximo(View view){
        Intent intent = new Intent(this, Calculos8.class);
        startActivity(intent);
    }


    class MyOnLongClickListener implements View.OnLongClickListener{


        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("simple_text", "text");


            View.DragShadowBuilder sb = new View.DragShadowBuilder(v);

            v.startDrag(data, sb, v, 0);

            v.setVisibility(View.INVISIBLE);




            return (true);
        }
    }
    class MyOnDragListener implements View.OnDragListener{

        private int num;
        public MyOnDragListener(int num){
            super();
            this.num = num;
        }

        @Override
        public boolean onDrag(View v, DragEvent event){
            int action = event.getAction();

            switch (action){
                case DragEvent.ACTION_DRAG_STARTED:
                    Log.i("Script", num+" - ACTION_DRAG_STARTED");
                    if(event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)){
                        return (true);
                    }
                    return (false);
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Script", num+" - ACTION_DRAG_ENTERED");
                    break;
                case DragEvent.ACTION_DRAG_LOCATION:
                    Log.i("Script", num+" - ACTION_DRAG_LOCATION");
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Script", num+" - ACTION_DRAG_EXITED");
                    break;
                case DragEvent.ACTION_DROP:
                    Log.i("Script", num+" - ACTION_DROP");

                    View view = (View) event.getLocalState();
                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);
                    FlexboxLayout container = (FlexboxLayout) v;
                    container.addView(view);
                    view.setVisibility(View.VISIBLE);

                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    Log.i("Script", num+" - ACTION_DRAG_ENDED");

                    break;
            }

            return (true);
        }
    }



    public void verif(View view){

        findViewById(R.id.imageButton77).setVisibility(View.VISIBLE);
        findViewById(R.id.button30).setVisibility(View.GONE);

        FlexboxLayout flexboxLayout = (FlexboxLayout) findViewById(R.id.flexTop);
        int count = flexboxLayout.getChildCount();
        int laco=0;
        for(int i =0;i<count;i++){
            View v = flexboxLayout.getChildAt(i);
            laco++;
            if(laco==1){
                if(v==findViewById(R.id.button28)){
                    cont++;
                }
            }else if(laco==2){
                if(v==findViewById(R.id.button19)){
                    cont++;
                }
            }else if(laco==3){
                if(v==findViewById(R.id.button23)){
                    cont++;
                }
            }else if(laco==4){
                if(v==findViewById(R.id.button21)){
                    cont++;
                }
            }else if(laco==5){
                if(v==findViewById(R.id.button25)){
                    cont++;
                }
            }else if(laco==6){
                if(v==findViewById(R.id.button22)){
                    cont++;
                }
            }else if(laco==7){
                if(v==findViewById(R.id.button24)){
                    cont++;
                }
            }


        }

        if(cont>=7){
            findViewById(R.id.textView192).setVisibility(View.VISIBLE);
            findViewById(R.id.textView193).setVisibility(View.GONE);
            findViewById(R.id.flexDown).setVisibility(View.GONE);






        }else{
            findViewById(R.id.textView192).setVisibility(View.GONE);
            findViewById(R.id.textView193).setVisibility(View.VISIBLE);
            findViewById(R.id.flexDown).setVisibility(View.GONE);
        }
    }
}
