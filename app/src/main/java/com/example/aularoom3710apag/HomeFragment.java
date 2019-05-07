package com.example.aularoom3710apag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{

    Button btCad, btList, btAlt, btExcluir;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_home, container, false);

         btCad = view.findViewById(R.id.buttonCadUsuario);
         btAlt = view.findViewById(R.id.buttonAltUsuario);
         btExcluir = view.findViewById(R.id.buttonExcUsuario);
         btList = view.findViewById(R.id.buttonListUsuario);

         btList.setOnClickListener(this);
         btExcluir.setOnClickListener(this);
         btAlt.setOnClickListener(this);
         btCad.setOnClickListener(this);

         return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonCadUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(R.id.frameLayout, new AdicionarUsuarioFragment()).
                        addToBackStack(null).commit();
                break;
            case R.id.buttonListUsuario:
                break;
            case R.id.buttonAltUsuario:
                break;
            case R.id.buttonExcUsuario:
                break;

        }
    }
}
