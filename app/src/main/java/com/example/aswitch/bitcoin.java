package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class bitcoin extends AppCompatActivity {
    Spinner spinner2;
    private EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bitcoin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        button=(Button)findViewById(R.id.button2);
        edittext1 = (EditText) findViewById(R.id.editText1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();
                String item2 = spinner2.getSelectedItem().toString();
                if(value1.isEmpty())
                {
                    Toast.makeText(bitcoin.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                    if (item2.equals("Afghanistan Afghani AFN")) {
                        double x = 0.0000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Akrotiri and Dhekelia Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Aland Islands Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Albania Albanian Lek ALL")) {
                        double x = 0.00000084;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Algeria Dinar DZD")) {
                        double x = 0.00000068;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("American Samoa Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Andorra European Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Angola Angolan Kwanza AOA")) {
                        double x = 0.00000014;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Anguilla East Caribbean Dollar XCD")) {
                        double x = 0.000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Antigua and Barbuda East Caribbean Dollar XCD")) {
                        double x = 0.000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Argentina Argentine Peso ARS")) {
                        double x = 0.0000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Armenia Armenian Dram AMD")) {
                        double x = 0.00000018;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Aruba Aruban Florin AWG")) {
                        double x = 5.81;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ascension Island Saint Helena Pound SHP")) {
                        double x = 0.000049;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Australia Australian Dollar AUD")) {
                        double x = 0.000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Austria European Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Azerbaijan Azerbaijan Manat AZN")) {
                        double x = 5.55;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bahamas Bahamian Dollar BSD")) {
                        double x = 0.000052;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bahrain Bahraini Dinar BHD")) {
                        double x = 0.00023;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bangladesh Bangladeshi Taka BDT")) {
                        double x = 0.0000010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Barbados Barbadian Dollar BBD")) {
                        double x = 0.000044;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Belarus Belarusian Ruble BYN")) {
                        double x = 0.000034;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Belgium Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Belize Belize Dollar BZD")) {
                        double x = 0.000044;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Benin Franc XOF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bermuda Bermudian Dollar BMD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bhutan Bhutanese Ngultrum BTN")) {
                        double x = 0.0000012;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bolivia Bolivian Boliviano BOB")) {
                        double x = 0.000013;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bonaire United States Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bosnia and Herzegovina Convertible Mark BAM")) {
                        double x = 0.000053;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Botswana Botswana Pula BWP")) {
                        double x = 0.0000077;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Brazil Brazilian Real BRL")) {
                        double x = 0.000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("British Indian Ocean Territory United States Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("British Virgin Islands United States Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Brunei Dollar BND")) {
                        double x = 0.000065;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bulgaria Bulgarian Lev BGN")) {
                        double x = 0.000053;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Burkina Faso Franc XOF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Burundi Burundi Franc BIF")) {
                        double x = 0.000000046;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cabo Verde Cabo Verdean Escudo CVE")) {
                        double x = 0.00000094;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cambodia Cambodian Riel KHR")) {
                        double x = 0.000000021;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cameroon Franc XAF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Canada Canadian Dollar CAD")) {
                        double x = 0.000067;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Caribbean Netherlands USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cayman Islands Dollar KYD")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Central African Republic Franc XAF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Chad Franc XAF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Chatham Islands Dollar NZD")) {
                        double x = 0.000059;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Chile Chilean Peso CLP")) {
                        double x = 0.00000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("China Chinese Yuan Renminbi CNY")) {
                        double x = 0.000013;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Christmas Island Dollar AUD")) {
                        double x = 0.000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cocos Islands Dollar AUD")) {
                        double x = 0.000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Colombia Colombian Peso COP")) {
                        double x = 0.000000023;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Comoros Comorian Franc KMF")) {
                        double x = 0.00000021;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Congo Republic Congolese Franc CDF")) {
                        double x = 0.000000049;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Congo Republic Central African CFA Franc XAF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Congo Republic Central African CFA Franc XAF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Costa Rica Costa Rican Colon CRC")) {
                        double x = 0.00000015;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cote D Ivoire Franc XOF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Croatia Croatian Kuna HRK")) {
                        double x = 0.000014;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cuba Cuban Peso CUP")) {
                        double x = 0.0000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Curacao Antillean Guilder ANG")) {
                        double x = 0.000049;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cyprus Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Czechia Czech Koruna CZK")) {
                        double x = 0.0000039;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Denmark Danish Krone DKK")) {
                        double x = 0.000014;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Djibouti Djiboutian franc DJF")) {
                        double x = 0.00000050;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dominica East Caribbean Dollar XCD")) {
                        double x = 0.000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dominican Republic Dominican Peso DOP")) {
                        double x = 0.0000015;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ecuador Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Egypt Egyptian Pound EGP")) {
                        double x = 0.0000056;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("El Salvador USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Equatorial Guinea Franc XAF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Eritrea Eritrean Nakfa ERN")) {
                        double x = 0.0000059;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Estonia European Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Eswatini Swazi Lilangeni SZL")) {
                        double x = 0.0000053;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ethiopia Ethiopian Birr ETB")) {
                        double x = 0.0000024;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Falkland Islands Pound FKP")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Faroe Islands Krona FOK")) {
                        double x = 0.00031;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Fiji Fijian Dollar FJD")) {
                        double x = 6.91;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Finland Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("France Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("French Guiana Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("French Polynesia Franc XPF")) {
                        double x = 0.000041;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gabon Franc XAF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gambia Dalasi GMD")) {
                        double x = 0.0000017;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Georgia Georgian Lari GEL")) {
                        double x = 0.000027;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Germany European Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ghana Ghanaian Cedi GHS")) {
                        double x = 0.000015;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gibraltar Gibraltar Pound GIP")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Greece Euro EUR")) {
                        double x = 0.0010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Greenland Krone DKK")) {
                        double x = 0.000014;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Grenada Dollar XCD")) {
                        double x = 0.000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guadeloupe Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guam Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guatemala Guatemalan Quetzal GTQ")) {
                        double x = 0.000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guernsey Guernsey Pound GGP")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guinea Guinean Franc GNF")) {
                        double x = 0.0000000090;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guinea Bissau Franc XOF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guyana Guyanese Dollar GYD")) {
                        double x = 0.00000042;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Haiti Haitian Gourde HTG")) {
                        double x = 0.0000014;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Honduras Honduran Lempira HNL")) {
                        double x = 0.0000036;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Hong Kong Dollar HKD")) {
                        double x = 0.000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Hungary Hungarian Forint HUF")) {
                        double x = 0.00000029;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Iceland Icelandic Krona ISK")) {
                        double x = 0.00000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("India Indian Rupee INR")) {
                        double x = 0.0000012;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Indonesia Indonesian Rupiah IDR")) {
                        double x = 0.0000000060;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("International Monetary Fund IMF XDR")) {
                        double x = 0.00012;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Iran Iranian Rial IRR")) {
                        double x = 0.0000000021;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Iraq Iraqi Dinar IQD")) {
                        double x = 0.000000074;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ireland European euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Isle of Man Manx Pound IMP")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Israel Israeli New Shekel ILS")) {
                        double x = 0.000026;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Italy European Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jamaica Jamaican Dollar JMD")) {
                        double x = 0.00000061;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Japan Japanese Yen JPY")) {
                        double x = 0.00000083;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jersey Pound JEP")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jordan Jordanian Dinar JOD")) {
                        double x = 0.00012;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kazakhstan Kazakhstani Tenge KZT")) {
                        double x = 0.00000021;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kenya Kenyan Shilling KES")) {
                        double x = 354.18;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kiribati Australian Dollar AUD")) {
                        double x = 0.00000081;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kosovo European Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kuwait Kuwaiti Dinar KWD")) {
                        double x = 0.00029;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kyrgyzstan Kyrgyzstani Som KGS")) {
                        double x = 0.0000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Laos Lao Kip LAK")) {
                        double x = 0.0000000095;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Latvia Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Lebanon Lebanese Pound LBP")) {
                        double x = 0.000000058;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Lesotho Lesotho Loti LSL")) {
                        double x = 0.0000053;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Liberia Liberian Dollar LRD")) {
                        double x = 0.00000044;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Libya Libyan Dinar LYD")) {
                        double x = 0.000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Liechtenstein Swiss Franc CHF")) {
                        double x = 0.000097;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Lithuania Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Luxembourg Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Macau Macanese Pataca MOP")) {
                        double x = 0.000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Madagascar Malagasy Ariary MGA")) {
                        double x = 0.000000023;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Malawi Malawian Kwacha MWK")) {
                        double x = 0.00000012;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Malaysia Malaysian Ringgit MYR")) {
                        double x = 0.000021;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Maldives Maldivian Rufiyaa MVR")) {
                        double x = 0.0000057;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mali Franc XOF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Malta Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Marshall Islands Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Martinique Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mauritania Mauritanian Ouguiya MRO")) {
                        double x = 0.00000025;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mauritius Mauritian Rupee MUR")) {
                        double x = 0.0000022;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mayotte Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mexico Mexican Peso MXN")) {
                        double x = 0.0000042;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Micronesia Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Moldova Moldovan Leu MDL")) {
                        double x = 0.0000052;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Monaco Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mongolia Mongolian Tugrik MNT")) {
                        double x = 0.000000031;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Montenegro Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Montserrat East Caribbean Dollar XCD")) {
                        double x = 0.000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Morocco Moroccan Dirham MAD")) {
                        double x = 0.0000096;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mozambique Mozambican Metical MZN")) {
                        double x = 0.0000012;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Myanmar Myanmar Kyat MMK")) {
                        double x = 0.000000069;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Namibia Namibian Dollar NAD")) {
                        double x = 0.0000053;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Nauru Australian Dollar AUD")) {
                        double x = 0.000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Nepal Nepalese Rupee NPR")) {
                        double x = 0.00000075;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Netherlands European Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("New Caledonia CFP Franc XPF")) {
                        double x = 0.00000087;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("New Zealand Dollar NZD")) {
                        double x = 0.000059;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                   if (item2.equals("Nicaragua Nicaraguan Cordoba NIO")) {
                        double x = 0.0000025;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Niger Franc XOF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Nigeria Nigerian Naira NGN")) {
                        double x = 0.00000023;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Niue Dollar NZD")) {
                        double x = 0.000059;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Norfolk Island Dollar AUD")) {
                        double x = 0.000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Northern Mariana Islands Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("North Korea North Korean Won KPW")) {
                        double x = 0.000000098;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("North Macedonia Macedonian Denar MKD")) {
                        double x = 0.0000017;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Norway Norwegian Krone NOK")) {
                        double x = 0.0000096;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Oman Omani Rial OMR")) {
                        double x = 0.00023;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Pakistan Pakistani Rupee PKR ")) {
                        double x = 0.00000054;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Palau Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Palestine Shekel ILS")) {
                        double x = 0.000026;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Panama Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Papua New Guinea Kina PGK")) {
                        double x = 0.000025;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Paraguay Paraguayan Guarani PYG")) {
                        double x = 0.000000013;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Peru Peruvian Sol PEN")) {
                        double x = 0.000025;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Philippines Philippine Peso PHP")) {
                        double x = 0.0000018;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Pitcairn Islands Dollar NZD")) {
                        double x = 0.000059;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Poland Polish Zloty PLN")) {
                        double x = 0.000023;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Portugal European Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Puerto Rico Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Qatar Qatari Riyal QAR")) {
                        double x = 0.000024;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Reunion Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Romania Romanian Leu RON")) {
                        double x = 0.000021;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Russia Russian Ruble RUB")) {
                        double x = 0.0000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Rwanda Rwandan Franc RWF")) {
                        double x = 0.000000091;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saba Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Helena Saint Helena Pound SHP")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Kitts Dollar XCD")) {
                        double x = 0.000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Lucia Dollar XCD")) {
                        double x = 0.000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Martin Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Pierre and Miquelon Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Vincent Dollar XCD")) {
                        double x = 0.000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Samoa Samoan Tala WST")) {
                        double x = 0.000033;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("San Marino Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Sao Tome and Principe Sao Dobra STN")) {
                        double x = 0.00000424200;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saudi Arabia Riyal SAR")) {
                        double x = 0.000023;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Senegal West African CFA Franc XOF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Serbia Serbian Dinar RSD")) {
                        double x = 0.00000089;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Seychelles Seychellois Rupee SCR")) {
                        double x = 0.0000047;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Sierra Leone Sierra Leonean Leone SLL")) {
                        double x = 0.0000000089;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Singapore Singapore Dollar SGD")) {
                        double x = 0.000065;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Sint Eustatius Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Sint Maarten Guilder ANG")) {
                        double x = 0.000049;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Slovakia Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Solomon Island Dollar SBD")) {
                        double x = 0.000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Somalia Somali Dhilling SOS")) {
                        double x = 0.00000015;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("South Africa South African Rand ZAR")) {
                        double x = 0.0000054;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("South Georgia Island Pound Sterling GBP")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("South Korea South Korean Won KRW")) {
                        double x = 0.000000077;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("South Sudan South Sudanese Pound SSP")) {
                        double x = 0.0000000675;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Spain Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Sri Lanka Sri Lankan Rupee LKR")) {
                        double x = 0.00000048;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                   if (item2.equals("Sudan Sudanese Pound SDG")) {
                        double x = 0.0000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Suriname Surinamese Dollar SRD")) {
                        double x = 0.0000062;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Svalbard and Jan Mayen Norwegian Krone NOK")) {
                        double x = 0.0000096;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Sweden Swedish Krona SEK")) {
                        double x = 0.000010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Switzerland Swiss Franc CHF")) {
                        double x = 0.000097;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Syria Syrian Pound SYP")) {
                        double x = 0.00000017;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Taiwan New Taiwan Dollar TWD")) {
                        double x = 0.0000031;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tajikistan Tajikistani Somoni TJS")) {
                        double x = 0.0000085;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                   if (item2.equals("Tanzania Tanzanian Shilling TZS")) {
                        double x = 0.000000038;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Thailand Thai Baht THB")) {
                        double x = 0.0000028;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Timor Leste Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Togo Franc XOF")) {
                        double x = 0.00000016;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tokelau Dollar NZD")) {
                        double x = 0.000059;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tonga Tongan Pa anga TOP")) {
                        double x = 0.000038;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Trinidad and Tobago Dollar TTD")) {
                        double x = 0.000013;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tristan Da Cunha Pound Sterling GBP")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tunisia Tunisian Dinar TND")) {
                        double x = 0.000032;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Turkey Turkish Lira TRY")) {
                        double x = 0.000011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Turkmenistan Turkmen Manat TMT")) {
                        double x = 0.000025;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Turks and Caicos Islands Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tuvalu Australian dollar AUD")) {
                        double x = 0.000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Uganda Ugandan Shilling UGX")) {
                        double x = 0.000000024;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ukraine Ukrainian Hryvnia UAH")) {
                        double x = 0.0000031;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("United Arab Emirates UAE Dirham AED")) {
                        double x = 0.000024;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("United Kingdom Pound Sterling GBP")) {
                        double x = 0.00011;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("United States of America Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Uruguay Uruguayan Peso UYU")) {
                        double x = 0.000021;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("US Virgin Islands Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Uzbekistan Uzbekistani Som UZS")) {
                        double x = 0.0000000085;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                    if (item2.equals("Vanuatu Vanuatu Vatu VUV")) {
                        double x = 0.00000078;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Vatican City Euro EUR")) {
                        double x = 0.00010;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Venezuela Venezuelan Bolivar VES")) {
                        double x = 0.0000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Vietnam Vietnamese Dong VND")) {
                        double x = 0.0000000038;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Wake Island Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Wallis and Futuna CFP Franc XPF")) {
                        double x = 0.00000087;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Yemen Yemeni Rial YER")) {
                        double x = 0.00000035;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Zambia Zambian Kwacha ZMW")) {
                        double x = 0.0000044;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Zimbabwe Dollar USD")) {
                        double x = 0.000088;
                        double ans = a * x;
                        Toast.makeText(bitcoin.this, "BTC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}