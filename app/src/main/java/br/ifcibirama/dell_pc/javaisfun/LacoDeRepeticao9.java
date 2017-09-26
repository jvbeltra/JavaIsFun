package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.flexbox.FlexboxLayout;

public class LacoDeRepeticao9 extends AppCompatActivity {
    public int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laco_de_repeticao9);
        setTitle("Repetição");
        findViewById(R.id.textView259).setVisibility(View.GONE);
        findViewById(R.id.textView260).setVisibility(View.GONE);
        findViewById(R.id.imageView66).setVisibility(View.GONE);
        findViewById(R.id.imageButton118).setVisibility(View.GONE);
        findViewById(R.id.button28).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());
        findViewById(R.id.button19).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());
        findViewById(R.id.button23).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());
        findViewById(R.id.button24).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());
        findViewById(R.id.button25).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());
        findViewById(R.id.button26).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());
        findViewById(R.id.button27).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());
        findViewById(R.id.button21).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());
        findViewById(R.id.button22).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());
        findViewById(R.id.button9).setOnLongClickListener(new LacoDeRepeticao9.MyOnLongClickListener());


        findViewById(R.id.flexTop).setOnDragListener(new LacoDeRepeticao9.MyOnDragListener(1));
        findViewById(R.id.flexDown).setOnDragListener(new LacoDeRepeticao9.MyOnDragListener(2));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_go_back_green, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_go:
                Intent intent = new Intent(this, LacoDeRepeticao10.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left_in, R.anim.left_out);
                finishAffinity();
                return true;

            case R.id.menu_home:
                AlertDialog.Builder builder;

                builder = new AlertDialog.Builder(this);

                builder.setTitle("Home")
                        .setMessage("Você tem certeza que quer voltar ao menu principal?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(LacoDeRepeticao9.this, MainActivity.class);
                                startActivity(intent);
                                finishAffinity();
                                overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        })
                        .setIcon(R.drawable.warning)
                        .show();
                return true;
            case R.id.menu_back:
                Intent intent2 = new Intent(this, LacoDeRepeticao8.class);
                startActivity(intent2);
                overridePendingTransition(R.anim.rigth_in, R.anim.rigth_out);
                finishAffinity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


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
            View view = (View) event.getLocalState();

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




                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);
                    FlexboxLayout container = (FlexboxLayout) v;
                    container.addView(view);


                    view.setVisibility(View.VISIBLE);









                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    Log.i("Script", num+" - ACTION_DRAG_ENDED");


                    if (dropEventNotHandled(event)) {

                        view.setVisibility(View.VISIBLE);

                    }



                    break;
            }


            return (true);
        }

        private boolean dropEventNotHandled(DragEvent dragEvent) {

            return !dragEvent.getResult();

        }

    }



    public void verif(View view){

        findViewById(R.id.imageButton118).setVisibility(View.VISIBLE);
        findViewById(R.id.button15).setVisibility(View.GONE);

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

                if (v==findViewById(R.id.button21)){
                    cont++;
                }
                if(v==findViewById(R.id.button22)){
                    cont++;
                }
            }else if(laco==5){
                if(v==findViewById(R.id.button25)){
                    cont++;
                }
            }else if(laco==6){

                if (v==findViewById(R.id.button21)){
                    cont++;
                }
                if(v==findViewById(R.id.button22)){
                    cont++;
                }
            }else if(laco==7){
                if(v==findViewById(R.id.button24)){
                    cont++;
                }

            }else if(laco==8){
                if(v==findViewById(R.id.button26)){
                    cont++;
                }


            }else if(laco==9){
                if (v==findViewById(R.id.button9 )){
                    cont++;
                }
            }else if (laco==10){
                if (v==findViewById(R.id.button27 )){
                    cont++;
                }
            }




        }
        ImageView imageView = (ImageView) findViewById(R.id.imageView66);
        if(cont>=10){

            findViewById(R.id.textView259).setVisibility(View.VISIBLE);
            findViewById(R.id.textView260).setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);

            findViewById(R.id.flexDown).setVisibility(View.GONE);






        }else{

            findViewById(R.id.textView259).setVisibility(View.GONE);
            findViewById(R.id.textView260).setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.sad);
            imageView.setVisibility(View.VISIBLE);
            findViewById(R.id.flexDown).setVisibility(View.GONE);
        }
    }
}
