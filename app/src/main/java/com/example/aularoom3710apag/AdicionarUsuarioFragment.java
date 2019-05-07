package com.example.aularoom3710apag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdicionarUsuarioFragment extends Fragment {

    EditText edId, edNome, edEmail;
    Button btSalvar;

    public AdicionarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_adicionar_usuario, container, false);

        edId = view.findViewById(R.id.editTextIdInserirUsuario);
        edEmail = view.findViewById(R.id.editTextEmailInserirUsuario);
        edNome = view.findViewById(R.id.editTextNomeInserirUsuario);
        btSalvar = view.findViewById(R.id.buttonInserirUsuario_);

        return view;
    }

    //TODO ação do botão, pegar valores do form, salvar no banco.

}
