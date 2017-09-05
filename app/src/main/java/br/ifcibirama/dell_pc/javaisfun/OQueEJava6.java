package br.ifcibirama.dell_pc.javaisfun;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OQueEJava6 extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, OQueEJava5.class);
        startActivity(intent);
        overridePendingTransition( R.anim.rigth_in, R.anim.rigth_out);
        finishAffinity();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oque_ejava6);
    }
    public void TextDialog(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        builder.setTitle("Home")
                .setMessage("Você tem certeza que quer voltar ao menu principal?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(OQueEJava6.this, MainActivity.class);
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
    }
    public void next(View view){
        Intent intent = new Intent(this, OQueEJava7.class);
        startActivity(intent);
        finishAffinity();
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }
    public void imageDialog1(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(R.drawable.step1);
        builder.setTitle("Vá nesta parte da IDE e clique com o botão direito do mouse...")
                .setView(imageView)
                .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
    public void imageDialog2(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(R.drawable.step2);
        builder.setTitle("Clique em 'Novo projeto'...")
                .setView(imageView)
                .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
    public void imageDialog3(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(R.drawable.step3);
        builder.setMessage("\n Não se assuste, esta são as opções do projeto, como queremos programar em Java, clique em 'Próximo'...\n" +
                "\n")
                .setView(imageView)
                .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
    public void imageDialog4(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(R.drawable.step4);
        builder.setMessage("\n Coloque o nome do projeto de acordo com o que pretende fazer nele, e depois clique em 'Finalizar'...\n"+
                "\n")
                .setView(imageView)
                .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
    public void imageDialog5(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(R.drawable.step5);
        builder.setTitle("Contemple seu projeto montado...")
                .setView(imageView)
                .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
    public void imageDialog6(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(R.drawable.step6);
        builder.setMessage("Bom aqui temos os seguintes componentes do Projeto: \n"+
                "\n"+
                "NomeDoProjeto -----> é a pasta do seu projeto, ela conterá tudo que o engloba.\n" +
                "\n" +
                "Pacotes De Códigos Fonte -----> é a pasta que conterá todos os pacotes do programa.\n" +
                "\n" +
                "nomedoprojeto -----> é um Pacote Java, pacotes são responsáveis por organizar as Classes\n" +
                "\n" +
                "nomedoprojeto.java ------> é uma Classe Java, onde será escrito o código do programa.\n" +
                "\n" +
                "Bibliotecas -----> é onde se encontram as bibliotecas do JDK que permitem o funcionamento do programa, isso não é relevante por enquanto.\n")

                .setView(imageView)
                .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
    public void imageDialog7(View view){
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(this);

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(R.drawable.step7);
        builder.setMessage("\n Aqui é onde você poderá escrever seu código livremente. O java já cria um projeto com uma geralmente.\n"+
                "\n")
                .setView(imageView)
                .setNegativeButton("Voltar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }
}
