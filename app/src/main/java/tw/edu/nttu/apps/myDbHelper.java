package tw.edu.nttu.apps;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class myDbHelper extends SQLiteOpenHelper {
    public dbhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase arg0){
        // TODO Auto-generated method stub
        arg0.execSQL("Create Table t05note("+"_id integer primary key autoincrement,"+"tnote text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0,int arg1,int arg2){
        // TODO Auto-generated method stub
        arg0.execSQL("Drop Table if exists t05note");
        onCreate(arg0);
    }

}
