package br.com.casadocodigo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import br.com.casadocodigo.boaviagem.R;

public class DashboardActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);

	}

	public void selecionarOpcao(View view) {
		/*
		 * com base na view que foi clicada iremos tomar a a��o correta
		 */
		switch (view.getId()) {
		case R.id.nova_viagem:
			startActivity(new Intent(this,ViagemActivity.class));
			break;

		default:
			break;
		}
		
		TextView textView = (TextView) view;
		String opcao = "Op��o: " + textView.getText().toString();
		Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();
	}

}
