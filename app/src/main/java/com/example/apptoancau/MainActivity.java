package com.example.apptoancau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtThongTin;
    Button btnXacNhan;
    EditText edtHoTen, edtEmail, edtSDT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoten = edtHoTen.getText().toString();
                String email = edtEmail.getText().toString();
                String sdt = edtSDT.getText().toString();
                String txtChaoBan = getResources().getString(R.string.text_ChaoBan);
                String txtEmail = getResources().getString(R.string.text_Email);
                String txtSDT = getResources().getString(R.string.text_SoDT);


                txtThongTin.setText(txtChaoBan + ": "+ hoten +"\n" +txtEmail + ": "+  email +"\n" + txtSDT + ": "+ sdt );


            }
        });
    }

    private void AnhXa() {
        txtThongTin = (TextView) findViewById(R.id.textViewThongTin);
        btnXacNhan = (Button) findViewById(R.id.buttonXacNhan);
        edtHoTen = (EditText) findViewById(R.id.editTextHoTen);
        edtEmail = (EditText) findViewById(R.id.editTextEmail);
        edtSDT = (EditText) findViewById(R.id.editTextSDT);
    }
}