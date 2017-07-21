package comunicacion.fragments.ejemplo.com.ejemplofragmentscomunicacion;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Send{
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        addFragmentA();
        addFragmentB();
    }


    public void addFragmentA(){
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.containerA,fragmentA,"fragmentA");
        transaction.commit();

    }

    public void addFragmentB(){
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction  transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.containerB,fragmentB,"fragmentB");
        transaction.commit();
    }

    @Override
    public void SendData(String dato) {
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentByTag("fragmentB");
        fragmentB.receiveData(dato);
    }
}
