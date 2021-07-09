package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class bitcoin2 extends AppCompatActivity {
    Spinner spinner2;
    private EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bitcoin2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        button=(Button)findViewById(R.id.button2);
        edittext1 = (EditText) findViewById(R.id.editText1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();

                String item2 = spinner2.getSelectedItem().toString();
                if (value1.isEmpty()) {
                    Toast.makeText(bitcoin2.this, "Please Enter The Value", Toast.LENGTH_LONG).show();
                } else {
                    double a = Double.parseDouble(value1);
                    if (item2.equals("Afghanistan Afghani AFN")) {
                        double x = 871063.26;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AFN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Akrotiri and Dhekelia Euro EUR")) {
                        double x = 9631.97;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Aland Islands Euro EUR")) {
                        double x = 9631.97;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Albania Albanian Lek ALL")) {
                        double x = 1187169.73;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ALL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Algeria Dinar DZD")) {
                        double x = 1463470.34;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "DZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("American Samoa Dollar USD")) {
                        double x = 11360.90;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Andorra European Euro EUR")) {
                        double x = 9631.97;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Angola Angolan Kwanza AOA")) {
                        double x = 7206750.95;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AOA=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Anguilla East Caribbean Dollar XCD")) {
                        double x = 30687.61;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Antigua and Barbuda East Caribbean Dollar XCD")) {
                        double x = 30687.61;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                   if (item2.equals("Argentina Argentine Peso ARS")) {
                        double x = 876386.21;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ARS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Armenia Armenian Dram AMD")) {
                        double x = 5571807.45;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AMD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Aruba Aruban Florin AWG")) {
                        double x = 20229.73;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AWG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ascension Island Saint Helena Pound SHP")) {
                        double x = 8710.28;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SHP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Australia Australian Dollar AUD")) {
                        double x = 15825.19;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Austria European Euro EUR")) {
                        double x = 9631.97;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Azerbaijan Azerbaijan Manat AZN")) {
                        double x = 19307.63;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AZN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bahamas Bahamian Dollar BSD")) {
                        double x = 11311.55;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BSD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bahrain Bahraini Dinar BHD")) {
                        double x = 4271.92;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BHD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bangladesh Bangladeshi Taka BDT")) {
                        double x = 962512.38;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BDT=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Barbados Barbadian Dollar BBD")) {
                        double x = 22946.30;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BBD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Belarus Belarusian Ruble BYN")) {
                        double x = 29204.38;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BYN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Belgium Euro EUR")) {
                        double x = 9631.97;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Belize Belize Dollar BZD")) {
                        double x = 22695.99;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Benin Franc XOF")) {
                        double x = 6341007.76;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XOFN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bermuda Bermudian Dollar BMD")) {
                        double x = 11360.90;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BMD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bhutan Bhutanese Ngultrum BTN")) {
                        double x = 832507.85;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BTN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }


                    if (item2.equals("Bolivia Bolivian Boliviano BOB")) {
                        double x = 832507.85;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BOB=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bonaire United States Dollar USD")) {
                        double x = 11360.90;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bosnia and Herzegovina Convertible Mark BAM")) {
                        double x = 18832.91;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BAM=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Botswana Botswana Pula BWP")) {
                        double x = 130285.52;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BWP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Brazil Brazilian Real BRL")) {
                        double x = 62924.68;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BRL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("British Indian Ocean Territory United States Dollar USD")) {
                        double x = 11360.90;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("British Virgin Islands United States Dollar USD")) {
                        double x = 11360.90;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Brunei Dollar BND")) {
                        double x = 15411.07;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BND=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bulgaria Bulgarian Lev BGN")) {
                        double x = 18838.44;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BGN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Burkina Faso Franc XOF")) {
                        double x = 6345279.42;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Burundi Burundi Franc BIF")) {
                        double x = 21788988.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "BIF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cabo Verde Cabo Verdean Escudo CVE")) {
                        double x = 1059525.50;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CVE=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Cambodia Cambodian Riel KHR")) {
                        double x = 46651464.98;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "KHR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Cameroon Franc XAF")) {
                        double x = 6320517.13;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Canada Canadian Dollar CAD")) {
                        double x = 14923.67;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CAD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Caribbean Netherlands USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Cayman Islands Dollar KYD")) {
                        double x = 9315.97;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "KYD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Central African Republic Franc XAF")) {
                        double x = 6320517.13;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Chad Franc XAF")) {
                        double x = 6320517.13;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Chatham Islands Dollar NZD")) {
                        double x = 17066.4;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Chile Chilean Peso CLP")) {
                        double x = 9057479.03;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CLP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("China Chinese Yuan Renminbi CNY")) {
                        double x = 76292.20;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CNY=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Christmas Island Dollar AUD")) {
                        double x = 0.000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cocos Islands Dollar AUD")) {
                        double x = 15699.61;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Colombia Colombian Peso COP")) {
                        double x = 43622713.31;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "COP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Comoros Comorian Franc KMF")) {
                        double x = 4736256.98;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "KMF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Congo Republic Congolese Franc CDF")) {
                        double x = 20644933.36;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CDF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Congo Republic Central African CFA Franc XAF")) {
                        double x = 6320517.13;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Congo Republic Central African CFA Franc XAF")) {
                        double x = 6320517.13;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Costa Rica Costa Rican Colon CRC")) {
                        double x = 6811877.23;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CRC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cote D Ivoire Franc XOF")) {
                        double x = 6345279.42;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Croatia Croatian Kuna HRK")) {
                        double x = 72792.18;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "HRK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cuba Cuban Peso CUP")) {
                        double x = 301343.73;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CUP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Curacao Antillean Guilder ANG")) {
                        double x = 20413.91;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ANG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cyprus Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Czechia Czech Koruna CZK")) {
                        double x = 261107.71;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CZK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Denmark Danish Krone DKK")) {
                        double x = 71682.85;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "DKK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Djibouti Djiboutian franc DJF")) {
                        double x = 2016370.39;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "DJF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dominica East Caribbean Dollar XCD")) {
                        double x = 30731.94;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dominican Republic Dominican Peso DOP")) {
                        double x = 663735.81;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "DOP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ecuador Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Egypt Egyptian Pound EGP")) {
                        double x = 177917.66;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EGP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("El Salvador USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Equatorial Guinea Franc XAF")) {
                        double x = 6320517.13;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Eritrea Eritrean Nakfa ERN")) {
                        double x = 170985.80;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ERN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Estonia European Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Eswatini Swazi Lilangeni SZL")) {
                        double x = 187178.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SZL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ethiopia Ethiopian Birr ETB")) {
                        double x = 418291.84;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ETB=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Falkland Islands Pound FKP")) {
                        double x = 8782.73;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "FKP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Faroe Islands Krona FOK")) {
                        double x = 8782.73;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "FOK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Fiji Fijian Dollar FJD")) {
                        double x = 24031.13;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "FJD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Finland Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("France Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("French Guiana Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("French Polynesia Franc XPF")) {
                        double x = 1152501.78;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XPF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gabon Franc XAF")) {
                        double x = 6320517.13;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gambia Dalasi GMD")) {
                        double x = 585364.67;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GMD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Georgia Georgian Lari GEL")) {
                        double x = 36505.47;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GEL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Germany European Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ghana Ghanaian Cedi GHS")) {
                        double x = 65294.34;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GHS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gibraltar Gibraltar Pound GIP")) {
                        double x = 8780.82;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GIP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Greece Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Greenland Krone DKK")) {
                        double x = 71539.04;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "DKK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Grenada Dollar XCD")) {
                        double x = 30731.94;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guadeloupe Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guam Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guatemala Guatemalan Quetzal GTQ")) {
                        double x = 88324.86;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GTQ=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guernsey Guernsey Pound GGP")) {
                        double x = 8716.15;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GGP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guinea Guinean Franc GNF")) {
                        double x = 110484148.75;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GNF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guinea Bissau Franc XOF")) {
                        double x = 6345279.42;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guyana Guyanese Dollar GYD")) {
                        double x = 2359412.22;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GYD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Haiti Haitian Gourde HTG")) {
                        double x = 704491.51;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "HTG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Honduras Honduran Lempira HNL")) {
                        double x = 277081.36;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "HNL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Hong Kong Dollar HKD")) {
                        double x = 88061.44;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "HKD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Hungary Hungarian Forint HUF")) {
                        double x = 3419133.75;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "HUG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Iceland Icelandic Krona ISK")) {
                        double x = 0.00000064;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ISK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("India Indian Rupee INR")) {
                        double x = 831735.35;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "INR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Indonesia Indonesian Rupiah IDR")) {
                        double x = 166722784.60;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "IDR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("International Monetary Fund IMF XDR")) {
                        double x = 8057.26;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XDR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Iran Iranian Rial IRR")) {
                        double x = 472423721.01;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "IRR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Iraq Iraqi Dinar IQD")) {
                        double x = 13508036.76;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "IQD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ireland European euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Isle of Man Manx Pound IMP")) {
                        double x = 8716.15;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "IMP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Israel Israeli New Shekel ILS")) {
                        double x = 38411.19;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ILS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Italy European Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jamaica Jamaican Dollar JMD")) {
                        double x = 1624762.95;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "JMD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Japan Japanese Yen JPY")) {
                        double x = 1203800.51;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "JYP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jersey Pound JEP")) {
                        double x = 8782.73;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "JEP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jordan Jordanian Dinar JOD")) {
                        double x = 8043.51;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "JOD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kazakhstan Kazakhstani Tenge KZT")) {
                        double x = 4852984.02;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "KZT=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kenya Kenyan Shilling KES")) {
                        double x = 1232081.99;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "KES=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kiribati Australian Dollar AUD")) {
                        double x = 15699.61;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kosovo European Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kuwait Kuwaiti Dinar KWD")) {
                        double x = 3469.41;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "KWD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kyrgyzstan Kyrgyzstani Som KGS")) {
                        double x = 904231.49;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "KGS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Laos Lao Kip LAK")) {
                        double x = 104634268.22;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "LAK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Latvia Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Lebanon Lebanese Pound LBP")) {
                        double x = 17106228.58;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "LBP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Lesotho Lesotho Loti LSL")) {
                        double x = 186902.57;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "LSL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Liberia Liberian Dollar LRD")) {
                        double x = 2242726.41;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "LRD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Libya Libyan Dinar LYD")) {
                        double x = 15517.73;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "LYD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Liechtenstein Swiss Franc CHF")) {
                        double x = 10342.99;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CHF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Lithuania Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Luxembourg Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Macau Macanese Pataca MOP")) {
                        double x = 90783.41;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MOP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Madagascar Malagasy Ariary MGA")) {
                        double x = 44291847.41;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MGA=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Malawi Malawian Kwacha MWK")) {
                        double x = 8579810.39;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MWK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Malaysia Malaysian Ringgit MYR")) {
                        double x = 47119.31;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MYR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Maldives Maldivian Rufiyaa MVR")) {
                        double x = 174515.50;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MVR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mali Franc XOF")) {
                        double x = 6345279.42;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Malta Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Marshall Islands Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Martinique Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mauritania Mauritanian Ouguiya MRO")) {
                        double x = 4033753.52;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MRO=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mauritius Mauritian Rupee MUR")) {
                        double x = 454737.12;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mayotte Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mexico Mexican Peso MXN")) {
                        double x = 240649.00;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MXN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Micronesia Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Moldova Moldovan Leu MDL")) {
                        double x = 190764.92;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MDL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Monaco Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mongolia Mongolian Tugrik MNT")) {
                        double x = 32432270.96;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MNT=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Montenegro Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Montserrat East Caribbean Dollar XCD")) {
                        double x = 30731.94;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Morocco Moroccan Dirham MAD")) {
                        double x = 104245.83;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MAD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Mozambique Mozambican Metical MZN")) {
                        double x = 825511.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MZN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Myanmar Myanmar Kyat MMK")) {
                        double x = 14473765.96;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MMK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Namibia Namibian Dollar NAD")) {
                        double x = 186902.57;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NAD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Nauru Australian Dollar AUD")) {
                        double x = 15699.61;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Nepal Nepalese Rupee NPR")) {
                        double x = 1329339.28;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NPR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Netherlands European Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("New Caledonia CFP Franc XPF")) {
                        double x = 1152501.78;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XPF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("New Zealand Dollar NZD")) {
                        double x = 17223.92;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Nicaragua Nicaraguan Cordoba NIO")) {
                        double x = 391766.01;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NIO=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Niger Franc XOF")) {
                        double x = 6345279.42;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Nigeria Nigerian Naira NGN")) {
                        double x = 4294761.10;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NGN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Niue Dollar NZD")) {
                        double x = 17223.92;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Norfolk Island Dollar AUD")) {
                        double x = 15699.61;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AUS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Northern Mariana Islands Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("North Korea North Korean Won KPW")) {
                        double x = 10224319.87;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "KPW=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("North Macedonia Macedonian Denar MKD"))//start
                    {
                        double x = 0.0000017;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "MKD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Norway Norwegian Krone NOK")) {
                        double x = 104624.86;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NOK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Oman Omani Rial OMR")) {
                        double x = 4357.73;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "OMR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Pakistan Pakistani Rupee PKR ")) {
                        double x = 1855209.81;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "PKR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Palau Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Palestine Shekel ILS")) {
                        double x = 38411.19;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ILS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Panama Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Papua New Guinea Kina PGK")) {
                        double x = 39109.83;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "PGK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Paraguay Paraguayan Guarani PYG")) {
                        double x = 79603560.88;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "PYG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Peru Peruvian Sol PEN")) {
                        double x = 40539.93;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "PEN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Philippines Philippine Peso PHP")) {
                        double x = 549608.10;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "PHP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Pitcairn Islands Dollar NZD")) {
                        double x = 17066.4;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Poland Polish Zloty PLN")) {
                        double x = 43072.68;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "PLN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Portugal European Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Puerto Rico Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Qatar Qatari Riyal QAR")) {
                        double x = 41263.53;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "QAR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Reunion Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Romania Romanian Leu RON")) {
                        double x = 46763.73;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "RON=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Russia Russian Ruble RUB")) {
                        double x = 875112.32;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "RUB=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Rwanda Rwandan Franc RWF")) {
                        double x = 10791292.02;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "RWF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saba Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Helena Saint Helena Pound SHP")) {
                        double x = 8780.82;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SHP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Kitts Dollar XCD")) {
                        double x = 30731.94;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Lucia Dollar XCD")) {
                        double x = 30731.94;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Martin Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Pierre and Miquelon Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Vincent Dollar XCD")) {
                        double x = 30731.94;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Samoa Samoan Tala WST")) {
                        double x = 30194.76;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "WST=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("San Marino Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sao Tome and Principe Sao Dobra STN")) {
                        double x = 243414052.77;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "STN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saudi Arabia Riyal SAR")) {
                        double x = 42510.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SAR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Senegal West African CFA Franc XOF")) {
                        double x = 6345279.42;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Serbia Serbian Dinar RSD")) {
                        double x = 1141574.26;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "RSD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Seychelles Seychellois Rupee SCR")) {
                        double x = 207744.72;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SCR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sierra Leone Sierra Leonean Leone SLL")) {
                        double x = 111603391.47;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SLL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Singapore Singapore Dollar SGD")) {
                        double x = 15411.07;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SGD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Sint Eustatius Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sint Maarten Guilder ANG")) {
                        double x = 20435.65;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ANG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Slovakia Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Solomon Island Dollar SBD")) {
                        double x = 92337.09;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SBD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Somalia Somali Dhilling SOS")) {
                        double x = 6487240.11;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SOS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("South Africa South African Rand ZAR")) {
                        double x = 187320.19;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ZAR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("South Georgia Island Pound Sterling GBP")) {
                        double x = 8724.05;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GBP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("South Korea South Korean Won KRW")) {
                        double x = 13018769.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "KRW=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("South Sudan South Sudanese Pound SSP")) {
                        double x = 1487804.53;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SSP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Spain Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sri Lanka Sri Lankan Rupee LKR")) {
                        double x = 2092549.05;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "LKR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sudan Sudanese Pound SDG")) {
                        double x = 622573.90;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SDG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Suriname Surinamese Dollar SRD")) {
                        double x = 159286.06;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SRD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Svalbard and Jan Mayen Norwegian Krone NOK")) {
                        double x = 104014.34;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NOK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sweden Swedish Krona SEK")) {
                        double x = 100004.14;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SEK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Switzerland Swiss Franc CHF")) {
                        double x = 10354.01;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "CHF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Syria Syrian Pound SYP")) {
                        double x = 14269323.34;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "SYP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Taiwan New Taiwan Dollar TWD")) {
                        double x = 325746.74;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "TWD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tajikistan Tajikistani Somoni TJS")) {
                        double x = 117490.54;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "TJS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Tanzania Tanzanian Shilling TZS")) {
                        double x = 26300770.43;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "TZS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Thailand Thai Baht THB")) {
                        double x = 353551.42;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "THB=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Timor Leste Dollar USD")) {
                        double x = 11383.57;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Togo Franc XOF")) {
                        double x = 6345279.42;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Tokelau Dollar NZD")) {
                        double x = 17066.4;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tonga Tongan Pa anga TOP")) {
                        double x = 26969.35;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "TOP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Trinidad and Tobago Dollar TTD")) {
                        double x = 76361.11;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "TTD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Tristan Da Cunha Pound Sterling GBP")) {
                        double x = 8724.05;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GBP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tunisia Tunisian Dinar TND")) {
                        double x = 31274.16;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "TND=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Turkey Turkish Lira TRY")) {
                        double x = 89257.41;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "TRY=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Turkmenistan Turkmen Manat TMT")) {
                        double x = 38243.83;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "TMT=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Turks and Caicos Islands Dollar USD")) {
                        double x = 11383.57;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Tuvalu Australian dollar AUD")) {
                        double x = 15699.61;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Uganda Ugandan Shilling UGX")) {
                        double x = 41997611.55;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "UGX=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ukraine Ukrainian Hryvnia UAH")) {
                        double x = 321119.68;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "UAH=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("United Arab Emirates UAE Dirham AED")) {
                        double x = 41811.3;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "AED=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("United Kingdom Pound Sterling GBP")) {
                        double x = 8724.05;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "GBP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("United States of America Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Uruguay Uruguayan Peso UYU")) {
                        double x = 483588.94;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "UYU=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("US Virgin Islands Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Uzbekistan Uzbekistani Som UZS")) {
                        double x = 116846394.85;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "UZS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Vanuatu Vanuatu Vatu VUV")) {
                        double x = 1270840.44;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "VUV=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Vatican City Euro EUR")) {
                        double x = 9611.7;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Venezuela Venezuelan Bolivar VES")) {
                        double x = 2788612242.05;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "VES=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Vietnam Vietnamese Dong VND")) {
                        double x = 263300873.95;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "VND=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Wake Island Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Wallis and Futuna CFP Franc XPF")) {
                        double x = 1152501.78;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "XPF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Yemen Yemeni Rial YER")) {
                        double x = 2838482.81;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "YER=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Zambia Zambian Kwacha ZMW")) {
                        double x = 228029.62;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "ZMW=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Zimbabwe Dollar USD")) {
                        double x = 11371.46;
                        double ans = a * x;
                        Toast.makeText(bitcoin2.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}