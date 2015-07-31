package br.com.casadocodigo.activity;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import br.com.casadocodigo.boaviagem.R;

public class GastoActivity extends Activity {

	private int dia, mes, ano;
	private Button dataGasto;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gasto);

		Calendar calendar = Calendar.getInstance();
		ano = calendar.get(Calendar.YEAR);
		mes = calendar.get(Calendar.MONTH);
		dia = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);

		dataGasto = (Button) findViewById(R.id.data);
		dataGasto.setText(dia + "/" + (mes + 1) + "/" + ano);

	}

	public void selecionarData(View view) {
		showDialog(view.getId());
	}
}
