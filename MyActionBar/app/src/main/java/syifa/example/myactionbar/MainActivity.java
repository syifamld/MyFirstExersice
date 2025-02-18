package syifa.example.myactionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import static syifa.example.myactionbar.R.*;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }

    public boolean onCreateOptionMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        SearchManager searchManager = (SearchManager) getSystemService
                (Context.SEARCH_SERVICE);

                 if(searchManager != null){
                         SearchView searchView = (SearchView)(menu.findItem(R.id.search)).
                    getActionView();
                         searchView.setSearchableInfo(searchManager.getSearchableInfo
                    (getComponentName()));
                         searchView.setQueryHint(getResources().getString(R.string.
                    search_hint));
                         searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                                 @Override
                                 public boolean onQueryTextSubmit(String query) {
                                         Toast.makeText(MainActivity.this, query, Toast.LENGTH_SHORT);
                                         return true;
                                     }
                         @Override
                                          public boolean onQueryTextChange(String newText) {
                                                  return false;
                                              }
                                      });
                              }
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
                switch (item.getItemId()){
                         case R.id.menu1:
                                 Intent activity1 = new Intent(this, MenuActivity1.class)
                        ;
                                 startActivity(activity1);
                                 return true;
                         case R.id.menu2:
                                 Intent activity2 = new Intent(this, MenuActivity2.class)
                        ;
                                 startActivity(activity2);
                                 return true;
                         default:
                                 return true;
                     }
             }
}
