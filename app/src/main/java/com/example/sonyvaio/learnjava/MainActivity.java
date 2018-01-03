package com.example.sonyvaio.learnjava;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class MainActivity extends AppCompatActivity {

    private View botao01;
    private View botao02;
    private View botao03;
    private Toolbar toolbar;
    private Drawer navigationDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar01);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Learn Java");
        botao01 = findViewById(R.id.ico01);
        botao02 = findViewById(R.id.ico02);
        botao03 = findViewById(R.id.ico03);
        botao01.setOnClickListener(new ClickListner(this, ConceitosBasicosActivity.class));
        botao02.setOnClickListener(new ClickListner(this, LacosActivity.class));
        botao03.setOnClickListener(new ClickListner(this, OrientacaoObjetosActivity.class));
        this.onNavigationDrawer();
    }

    private class ClickListner implements View.OnClickListener {

        private Context context;
        private Class aClass;

        public Context getContext() {
            return context;
        }

        public ClickListner(Context context, Class aClass) {
            this.context = context;
            this.aClass = aClass;
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(), aClass);
            startActivity(intent);
        }
    }

    public void onNavigationDrawer() {
        DrawerBuilder drawer = new DrawerBuilder();
        drawer.withActivity(this);
        drawer.withToolbar(this.toolbar);
        drawer.withActionBarDrawerToggleAnimated(true);
        drawer.withDrawerGravity(Gravity.LEFT);


        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.background)
                .addProfiles(
                        new ProfileDrawerItem().withName("Learn Java").withEmail("Em qualquer lugar, em qualquer hora!")
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();
        drawer.withAccountHeader(headerResult)

        .addDrawerItems(
                new PrimaryDrawerItem().withName(getResources().getString(R.string.title_home))
                        .withIcon(getResources().getDrawable(R.drawable.ic_home))
        );
        drawer.addDrawerItems(new PrimaryDrawerItem().withName(getResources().getString(R.string.title_tutorial))
                        .withIcon(getResources().getDrawable(R.drawable.ic_tutorial))
        );
        drawer.addDrawerItems(new PrimaryDrawerItem().withName(getResources().getString(R.string.title_glossario))
                        .withIcon(getResources().getDrawable(R.drawable.ic_glossario))
        );
        drawer.addDrawerItems(new PrimaryDrawerItem().withName(getResources().getString(R.string.title_ranking))
                        .withIcon(getResources().getDrawable(R.drawable.ic_trofeu))
        );
        drawer.addDrawerItems(
                new DividerDrawerItem()
        );
        drawer.addDrawerItems(new PrimaryDrawerItem().withName(getResources().getString(R.string.title_configurações))
                        .withIcon(getResources().getDrawable(R.drawable.ic_settings_24dp))
        );
        drawer.withOnDrawerItemClickListener(
                new Drawer.OnDrawerItemClickListener() {

                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        onClickDrawer(position);
                        return true;
                    }
                }
        ).build();


    }

    private void onClickDrawer(int i) {
        Intent intent;

        switch (i){
            case 0:
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case 1:
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case 2:
                Toast.makeText(this, "Em breve!",Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case 3:
                Toast.makeText(this, "Em breve!",Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case 4:
                Toast.makeText(this, "Em breve!",Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case 5:
                Toast.makeText(this, "Em breve!",Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case 6:
                Toast.makeText(this, "Em breve!",Toast.LENGTH_SHORT).show();
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                break;

        }

    }



}