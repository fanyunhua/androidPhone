package com.example.ojbk_waber_pro;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.*;
import android.view.Menu;
import android.widget.Toast;


public class InLookActivity extends AppCompatActivity {
    private My_Sql_DataBase dataBase;
    private In_for_mation auto;
    String name;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_data_inlook);
        Intent intent = getIntent();
        //获取要查看的联系人
        name = intent.getStringExtra("name");
        initDataBase();
        initAuto();

    }

    private void initAuto() {

        SQLiteDatabase db = dataBase.getWritableDatabase();
        Cursor cursor = db.query(dataBase.tableName,new String[]{"name","tel","camera","location","postbox"},
                "name=?",new String[]{name},null,null,null,null);
////                String sql = "create table stdinfo(
// id integer primary key autoincrement ,name varchar(10),tel varchar(11),camera varchar(10) ,location varchar(10) ,postbox varchar(15))";
       // Cursor cursor = db.query(dataBase.tableName,new String[]{"name","tel","camera","location","postbox"}
       // ,null,null,null,null,null,null);
//        Toast.makeText(InLookActivity.this,cursor.getString(1),Toast.LENGTH_SHORT).show();
        while (cursor.moveToNext())
        {
                    Toast.makeText(InLookActivity.this,cursor.getString(1),Toast.LENGTH_SHORT).show();

        }
    }

    private void initDataBase() {
        //初始化数据库
        dataBase = new My_Sql_DataBase(InLookActivity.this);
        dataBase.getWritableDatabase();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main2,menu);

        return true;
    }
}
