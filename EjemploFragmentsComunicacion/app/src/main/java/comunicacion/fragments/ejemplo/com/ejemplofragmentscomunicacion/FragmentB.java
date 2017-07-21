package comunicacion.fragments.ejemplo.com.ejemplofragmentscomunicacion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jose on 08/06/17.
 */

public class FragmentB  extends Fragment{
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentb,container,false);
        textView = (TextView) view.findViewById(R.id.textview);
        return view;
    }

    public void receiveData(String data){
        textView.setText("Recibimos el dato: " + data);
    }
}
