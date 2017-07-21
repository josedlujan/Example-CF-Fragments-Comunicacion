package comunicacion.fragments.ejemplo.com.ejemplofragmentscomunicacion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jose on 08/06/17.
 */

public class FragmentA extends Fragment {
    EditText editText;
    Button send;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmenta,container,false);
         editText = (EditText) view.findViewById(R.id.data);
        send = (Button) view.findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                send();
            }
        });


        return view;
    }

    private void send(){
        Send send = (Send) getActivity();
        send.SendData(editText.getText().toString());
    }
}
