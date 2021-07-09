package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class currency extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner=(Spinner)findViewById(R.id.spinner);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        button=(Button)findViewById(R.id.button2);
        edittext1 = (EditText) findViewById(R.id.editText1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();

                String item = spinner.getSelectedItem().toString();
                String item2 = spinner2.getSelectedItem().toString();
                if (value1.isEmpty()) {
                    Toast.makeText(currency.this, "Please Enter The Value", Toast.LENGTH_LONG).show();

                } else {
                    double a = Double.parseDouble(value1);
                    switch (item) {
                        case "Afghanistan Afghani AFN":
                            z = 0.003998930865;
                            break;
                        case "Akrotiri and Dhekelia Euro EUR":
                            z = 0.36;
                            break;
                        case "Aland Islands Euro EUR":
                            z = 0.36;
                            break;
                        case "Albania Albanian Lek ALL":
                            z = 0.0029;
                            break;
                        case "Algeria Dinar DZD":
                            z = 0.0024;
                            break;
                        case "American Samoa Dollar USD":
                            z = 0.31;
                            break;
                        case "Andorra European Euro EUR":
                            z = 0.36;
                            break;
                        case "Angola Angolan Kwanza AOA":
                            z = 0.00048;
                            break;
                        case "Anguilla East Caribbean Dollar XCD":
                            z = 0.11;
                            break;
                        case "Antigua and Barbuda East Caribbean Dollar XCD":
                            z = 0.11;
                            break;
                        case "Argentina Argentine Peso ARS":
                            z = 0.0040;
                            break;
                        case "Armenia Armenian Dram AMD":
                            z = 0.00063;
                            break;
                        case "Aruba Aruban Florin AWG":
                            z = 0.17;
                            break;
                        case "Ascension Island Saint Helena Pound SHP":
                            z = 0.40;
                            break;
                        case "Australia Australian Dollar AUD":
                            z = 0.22;
                            break;
                        case "Austria European Euro EUR":
                            z = 0.36;
                            break;
                        case "Azerbaijan Azerbaijan Manat AZN":
                            z = 0.18;
                            break;
                        case "Bahamas Bahamian Dollar BSD":
                            z = 0.31;
                            break;
                        case "Bahrain Bahraini Dinar BHD":
                            z = 0.81;
                            break;
                        case "Bangladesh Bangladeshi Taka BDT":
                            z = 0.0036;
                            break;
                        case "Barbados Barbadian Dollar BBD":
                            z = 0.15;
                            break;
                        case "Belarus Belarusian Ruble BYN":
                            z = 0.12;
                            break;
                        case "Belgium Euro EUR":
                            z = 0.36;
                            break;
                        case "Belize Belize Dollar BZD":
                            z = 0.15;
                            break;
                        case "Benin Franc XOF":
                            z = 0.00055;
                            break;
                        case "Bermuda Bermudian Dollar BMD":
                            z = 0.31;
                            break;
                        case "Bhutan Bhutanese Ngultrum BTN":
                            z = 0.0042;
                            break;
                        case "Bolivia Bolivian Boliviano BOB":
                            z = 0.044;
                            break;
                        case "Bonaira United States Dollar USD":
                            z = 0.31;
                            break;
                        case "Bosnia and Herzegovina Convertible Mark BAM":
                            z = 0.18;
                            break;
                        case "Botswana Botswana Pula BWP":
                            z = 0.027;
                            break;
                        case "Brazil Brazilian Real BRL":
                            z = 0.055;
                            break;
                        case "British Indian Ocean Territory United States Dollar USD":
                            z = 0.31;
                            break;
                        case "British Virgin Islands United States Dollar USD":
                            z = 0.31;
                            break;
                        case "Brunei Dollar BND":
                            z = 0.22;
                            break;
                        case "Bulgaria Bulgarian Lev BGN":
                            z = 0.18;
                            break;
                        case "Burkina Faso Franc XOF":
                            z = 0.00055;
                            break;
                        case "Burundi Burundi Franc BIF":
                            z = 0.00016;
                            break;
                        case "Cabo Verde Cabo Verdean Escudo CVE":
                            z = 0.0033;
                            break;
                        case "Cambodia Cambodian Riel KHR":
                            z = 0.000074;
                            break;
                        case "Cameroon Franc XAF":
                            z = 0.00055;
                            break;
                        case "Canada Canadian Dollar CAD":
                            z = 0.23;
                            break;
                        case "Caribbean Netherlands USD":
                            z = 0.31;
                            break;
                        case "Cayman Islands Dollar KYD":
                            z = 0.37;
                            break;
                        case "Central African Republic Franc XAF":
                            z = 0.00055;
                            break;
                        case "Chad Franc XAF":
                            z = 0.00055;
                            break;
                        case "Chatham Islands Dollar NZD":
                            z = 0.20;
                            break;
                        case "Chile Chilean Peso CLP":
                            z = 0.00038;
                            break;
                        case "China Chinese Yuan Renminbi CNY":
                            z = 0.045;
                            break;
                        case "Christmas Island Dollar AUD":
                            z = 0.22;
                            break;
                        case "Cocos Islands Dollar AUD":
                            z = 0.22;
                            break;
                        case "Colombia Colombian Peso COP":
                            z = 0.000080;
                            break;
                        case "Comoros Comorian Franc KMF":
                            z = 0.00073;
                            break;
                        case "Congo Republic Congolese Franc CDF":
                            z = 0.00016;
                            break;
                        case "Congo Republic Central African CFA Franc XAF":
                            z = 0.00055;
                            break;
                        case "Cook Islands Cook Islands Dollar NZD":
                            z = 0.20;
                            break;
                        case "Costa Rica Costa Rican Colon CRC":
                            z = 0.00051;
                            break;
                        case "Cote D Ivoire Franc XOF":
                            z = 0.00055;
                            break;
                        case "Croatia Croatian Kuna HRK":
                            z = 0.048;
                            break;
                        case "Cuba Cuban Peso CUP":
                            z = 0.012;
                            break;
                        case "Curacao Antillean Guilder ANG":
                            z = 0.17;
                            break;
                        case "Cyprus Euro EUR":
                            z = 0.36;
                            break;
                        case "Czechia Czech Koruna CZK":
                            z = 0.013;
                            break;
                        case "Denmark Danish Krone DKK":
                            z = 0.048;
                            break;
                        case "Djibouti Djiboutian franc DJF":
                            z = 0.0017;
                            break;
                        case "Dominica East Caribbean Dollar XCD":
                            z = 0.11;
                            break;
                        case "Dominican Republic Dominican Peso DOP":
                            z = 0.0052;
                            break;
                        case "Ecuador Dollar USD":
                            z = 0.31;
                            break;
                        case "Egypt Egyptian Pound EGP":
                            z = 0.019;
                            break;
                        case "El Salvador USD":
                            z = 0.31;
                            break;
                        case "Equatorial Guinea Franc XAF":
                            z = 0.00055;
                            break;
                        case "Eritrea Eritrean Nakfa ERN":
                            z = 0.020;
                            break;
                        case "Estonia European Euro EUR":
                            z = 0.36;
                            break;
                        case "Eswatini Swazi Lilangeni SZL":
                            z = 0.018;
                            break;
                        case "Ethiopia Ethiopian Birr ETB":
                            z = 0.0083;
                            break;
                        case "Falkland Islands Pound FKP":
                            z = 0.40;
                            break;
                        case "Faroe Islands Krona FOK":
                            z = 0.048;
                            break;
                        case "Fiji Fijian Dollar FJD":
                            z = 0.14;
                            break;
                        case "Finland Euro EUR":
                            z = 0.36;
                            break;
                        case "France Euro EUR":
                            z = 0.36;
                            break;
                        case "French Guiana Euro EUR":
                            z = 0.36;
                            break;
                        case "French Polynesia Franc XPF":
                            z = 0.0030;
                            break;
                        case "Gabon Franc XAF":
                            z = 0.0030;
                            break;
                        case "Gambia Dalasi GMD":
                            z = 0.0059;
                            break;
                        case "Georgia Georgian Lari GEL":
                            z = 0.095;
                            break;
                        case "Germany European Euro EUR":
                            z = 0.36;
                            break;
                        case "Ghana Ghanaian Cedi GHS":
                            z = 0.053;
                            break;
                        case "Gibraltar Gibraltar Pound GIP":
                            z = 0.40;
                            break;
                        case "Greece Euro EUR":
                            z = 0.36;
                            break;
                        case "Greenland Krone DKK":
                            z = 0.048;
                            break;
                        case "Grenada Dollar XCD":
                            z = 0.11;
                            break;
                        case "Guadeloupe Euro EUR":
                            z = 0.36;
                            break;
                        case "Guam Dollar USD":
                            z = 0.31;
                            break;
                        case "Guatemala Guatemalan Quetzal GTQ":
                            z = 0.039;
                            break;
                        case "Guernsey Guernsey Pound GGP":
                            z = 0.40;
                            break;
                        case "Guinea Guinean Franc GNF":
                            z = 0.000031;
                            break;
                        case "Guinea Bissau Franc XOF":
                            z = 0.00055;
                            break;
                        case "Guyana Guyanese Dollar GYD":
                            z = 0.0015;
                            break;
                        case "Haiti Haitian Gourde HTG":
                            z = 0.0048;
                            break;
                        case "Honduras Honduran Lempira HNL":
                            z = 0.012;
                            break;
                        case "Hong Kong Dollar HKD":
                            z = 0.040;
                            break;
                        case "Hungary Hungarian Forint HUF":
                            z = 0.0010;
                            break;
                        case "Iceland Icelandic Krona ISK":
                            z = 0.0022;
                            break;
                        case "India Indian Rupee INR":
                            z = 0.0042;
                            break;
                        case "Indonesia Indonesian Rupiah IDR":
                            z = 0.000021;
                            break;
                        case "International Monetary Fund IMF XDR":
                            z = 0.43;
                            break;
                        case "Iran Iranian Rial IRR":
                            z = 0.0000073;
                            break;
                        case "Iraq Iraqi Dinar IQD":
                            z = 0.00026;
                            break;
                        case "Ireland European euro EUR":
                            z = 0.36;
                            break;
                        case "Isle of Man Manx Pound IMP":
                            z = 0.40;
                            break;
                        case "Israel Israeli New Shekel ILS":
                            z = 0.090;
                            break;
                        case "Italy European Euro EUR":
                            z = 0.36;
                            break;
                        case "Jamaica Jamaican Dollar JMD":
                            z = 0.0021;
                            break;
                        case "Japan Japanese Yen JPY":
                            z = 0.0029;
                            break;
                        case "Jersey Pound JEP":
                            z = 0.40;
                            break;
                        case "Jordan Jordanian Dinar JOD":
                            z = 0.43;
                            break;
                        case "Kazakhstan Kazakhstani Tenge KZT":
                            z = 0.00071;
                            break;
                        case "Kenya Kenyan Shilling KES":
                            z = 0.0028;
                            break;
                        case "Kiribati Australian Dollar AUD":
                            z = 0.22;
                            break;
                        case "Kosovo European Euro EUR":
                            z = 0.36;
                            break;
                        case "Kuwait Kuwaiti Dinar KWD":
                            z = 1.000;
                            break;
                        case "Kyrgyzstan Kyrgyzstani Som KGS":
                            z = 0.0038;
                            break;
                        case "Laos Lao Kip LAK":
                            z = 0.000033;
                            break;
                        case "Latvia Euro EUR":
                            z = 0.000033;
                            break;
                        case "Lebanon Lebanese Pound LBP":
                            z = 0.00020;
                            break;
                        case "Lesotho Lesotho Loti LSL":
                            z = 0.018;
                            break;
                        case "Liberia Liberian Dollar LRD":
                            z = 0.0015;
                            break;
                        case "Libya Libyan Dinar LYD":
                            z = 0.22;
                            break;
                        case "Liechtenstein Swiss Franc CHF":
                            z = 0.33;
                            break;
                        case "Lithuania Euro EUR":
                            z = 0.36;
                            break;
                        case "Luxembourg Euro EUR":
                            z = 0.36;
                            break;
                        case "Macau Macanese Pataca MOP":
                            z = 0.038;
                            break;
                        case "Madagascar Malagasy Ariary MGA":
                            z = 0.000079;
                            break;
                        case "Malawi Malawian Kwacha MWK":
                            z = 0.00041;
                            break;
                        case "Malaysia Malaysian Ringgit MYR":
                            z = 0.074;
                            break;
                        case "Maldives Maldivian Rufiyaa MVR":
                            z = 0.020;
                            break;
                        case "Mali Franc XOF":
                            z = 0.00055;
                            break;
                        case "Malta Euro EUR":
                            z = 0.36;
                            break;
                        case "Marshall Islands Dollar USD":
                            z = 0.31;
                            break;
                        case "Martinique Euro EUR":
                            z = 0.36;
                            break;
                        case "Mauritania Mauritanian Ouguiya MRO":
                            z = 0.00086;
                            break;
                        case "Mauritius Mauritian Rupee MUR":
                            z = 0.0077;
                            break;
                        case "Mayotte Euro EUR":
                            z = 0.36;
                            break;
                        case "Mexico Mexican Peso MXN":
                            z = 0.014;
                            break;
                        case "Micronesia Dollar USD":
                            z = 0.31;
                            break;
                        case "Moldova Moldovan Leu MDL":
                            z = 0.018;
                            break;
                        case "Monaco Euro EUR":
                            z = 0.36;
                            break;
                        case "Mongolia Mongolian Tugrik MNT":
                            z = 0.00011;
                            break;
                        case "Montenegro Euro EUR":
                            z = 0.36;
                            break;
                        case "Montserrat East Caribbean Dollar XCD":
                            z = 0.11;
                            break;
                        case "Morocco Moroccan Dirham MAD":
                            z = 0.033;
                            break;
                        case "Mozambique Mozambican Metical MZN":
                            z = 0.0042;
                            break;
                        case "Myanmar Myanmar Kyat MMK":
                            z = 0.00024;
                            break;
                        case "Namibia Namibian Dollar NAD":
                            z = 0.00024;
                            break;
                        case "Nauru Australian Dollar AUD":
                            z = 0.22;
                            break;
                        case "Nepal Nepalese Rupee NPR":
                            z = 0.0026;
                            break;
                        case "Netherlands European Euro EUR":
                            z = 0.36;
                            break;
                        case "New Caledonia CFP Franc XPF":
                            z = 0.0030;
                            break;
                        case "New Zealand Dollar NZD":
                            z = 0.20;
                            break;
                        case "Nicaragua Nicaraguan Cordoba NIO":
                            z = 0.0088;
                            break;
                        case "Niger Franc XOF":
                            z = 0.00055;
                            break;
                        case "Nigeria Nigerian Naira NGN":
                            z = 0.00079;
                            break;
                        case "Niue Dollar NZD":
                            z = 0.20;
                            break;
                        case "Norfolk Island Dollar AUD":
                            z = 0.22;
                            break;
                        case "Northern Mariana Islands Dollar USD":
                            z = 0.31;
                            break;
                        case "North Korea North Korean Won KPW":
                            z = 0.00034;
                            break;
                        case "North Macedonia Macedonian Denar MKD":
                            z = 0.0058;
                            break;
                        case "Norway Norwegian Krone NOK":
                            z = 0.033;
                            break;
                        case "Oman Omani Rial OMR":
                            z = 0.80;
                            break;
                        case "Pakistan Pakistani Rupee PKR":
                            z = 0.0019;
                            break;
                        case "Palau Dollar USD":
                            z = 0.31;
                            break;
                        case "Palestine Shekel ILS":
                            z = 0.090;
                            break;
                        case "Panama Dollar USD":
                            z = 0.31;
                            break;
                        case "Papua New Guinea Kina PGK":
                            z = 0.087;
                            break;
                        case "Paraguay Paraguayan Guarani PYG":
                            z = 0.000044;
                            break;
                        case "Peru Peruvian Sol PEN":
                            z = 0.085;
                            break;
                        case "Philippines Philippine Peso PHP":
                            z = 0.0063;
                            break;
                        case "Pitcairn Islands Dollar NZD":
                            z = 0.20;
                            break;
                        case "Poland Polish Zloty PLN":
                            z = 0.080;
                            break;
                        case "Portugal European Euro EUR":
                            z = 0.36;
                            break;
                        case "Puerto Rico Dollar USD":
                            z = 0.31;
                            break;
                        case "Qatar Qatari Riyal QAR":
                            z = 0.084;
                            break;
                        case "Reunion Euro EUR":
                            z = 0.36;
                            break;
                        case "Romania Romanian Leu RON":
                            z = 0.074;
                            break;
                        case "Russia Russian Ruble RUB":
                            z = 0.0039;
                            break;
                        case "Rwanda Rwandan Franc RWF":
                            z = 0.00031;
                            break;
                        case "Saba Dollar USD":
                            z = 0.31;
                            break;
                        case "Saint Euro EUR":
                            z = 0.36;
                            break;
                        case "Saint Helena Saint Helena Pound SHP":
                            z = 0.40;
                            break;
                        case "Saint Kitts Dollar XCD":
                            z = 0.40;
                            break;
                        case "Saint Lucia Dollar XCD":
                            z = 0.11;
                            break;
                        case "Saint Martin Euro EUR":
                            z = 0.36;
                            break;
                        case "Saint Pierre and Miquelon Euro EUR":
                            z = 0.36;
                            break;
                        case "Saint Vincent Dollar XCD":
                            z = 0.11;
                            break;
                        case "Samoa Samoan Tala WST":
                            z = 0.12;
                            break;
                        case "San Marino Euro EUR":
                            z = 0.36;
                            break;
                        case "Sao Tome and Principe Sao Dobra STN":
                            z = 0.0147008;
                            break;
                        case "Saudi Arabia Riyal SAR":
                            z = 0.082;
                            break;
                        case "Senegal West African CFA Franc XOF":
                            z = 0.00055;
                            break;
                        case "Serbia Serbian Dinar RSD":
                            z = 0.0031;
                            break;
                        case "Seychelles Seychellois Rupee SCR":
                            z = 0.017;
                            break;
                        case "Sierra Leone Sierra Leonean Leone SLL":
                            z = 0.000031;
                            break;
                        case "Singapore Singapore Dollar SGD":
                            z = 0.23;
                            break;
                        case "Sint Eustatius Dollar USD":
                            z = 0.31;
                            break;
                        case "Sint Maarten Guilder ANG":
                            z = 0.17;
                            break;
                        case "Slovakia Euro EUR":
                            z = 0.36;
                            break;
                        case "Solomon Island Dollar SBD":
                            z = 0.038;
                            break;
                        case "Somalia Somali Dhilling SOS":
                            z = 0.00052;
                            break;
                        case "South Africa South African Rand ZAR":
                            z = 0.018;
                            break;
                        case "South Georgia Island Pound Sterling GBP":
                            z = 0.40;
                            break;
                        case "South Korea South Korean Won KRW":
                            z = 0.00026;
                            break;
                        case "South Sudan South Sudanese Pound SSP":
                            z = 0.002351;
                            break;
                        case "Spain Euro EUR":
                            z = 0.36;
                            break;
                        case "Sri Lanka Sri Lankan Rupee LKR":
                            z = 0.0017;
                            break;
                        case "Sudan Sudanese Pound SDG":
                            z = 0.0055;
                            break;
                        case "Suriname Surinamese Dollar SRD":
                            z = 0.022;
                            break;
                        case "Svalbard and Jan Mayen Norwegian Krone NOK":
                            z = 0.033;
                            break;
                        case "Sweden Swedish Krona SEK":
                            z = 0.034;
                            break;
                        case "Switzerland Swiss Franc CHF":
                            z = 0.33;
                            break;
                        case "Syria Syrian Pound SYP":
                            z = 0.00060;
                            break;
                        case "Taiwan New Taiwan Dollar TWD":
                            z = 0.011;
                            break;
                        case "Tajikistan Tajikistani Somoni TJS":
                            z = 0.030;
                            break;
                        case "Tanzania Tanzanian Shilling TZS":
                            z = 0.00013;
                            break;
                        case "Thailand Thai Baht THB":
                            z = 0.0098;
                            break;
                        case "Timor Leste Dollar USD":
                            z = 0.31;
                            break;
                        case "Togo Franc XOF":
                            z = 0.00055;
                            break;
                        case "Tokelau Dollar NZD":
                            z = 0.20;
                            break;
                        case "Tonga Tongan Pa anga TOP":
                            z = 0.13;
                            break;
                        case "Trinidad and Tobago Dollar TTD":
                            z = 0.045;
                            break;
                        case "Tristan Da Cunha Pound Sterling GBP":
                            z = 0.40;
                            break;
                        case "Tunisia Tunisian Dinar TND":
                            z = 0.11;
                            break;
                        case "Turkey Turkish Lira TRY":
                            z = 0.039;
                            break;
                        case "Turkmenistan Turkmen Manat TMT":
                            z = 0.087;
                            break;
                        case "Turks and Caicos Islands Dollar USD":
                            z = 0.31;
                            break;
                        case "Tuvalu Australian Dollar AUD":
                            z = 0.22;
                            break;
                        case "Uganda Ugandan Shilling UGX":
                            z = 0.000083;
                            break;
                        case "Ukraine Ukrainian Hryvnia UAH":
                            z = 0.011;
                            break;
                        case "United Arab Emirates UAE Dirham AED":
                            z = 0.083;
                            break;
                        case "United Kingdom Pound Sterling GBP":
                            z = 0.40;
                            break;
                        case "United States of America Dollar USD":
                            z = 0.31;
                            break;
                        case "Uruguay Uruguayan Peso UYU":
                            z = 0.0072;
                            break;
                        case "US Virgin Islands Dollar USD":
                            z = 0.31;
                            break;
                        case "Uzbekistan Uzbekistani Som UZS":
                            z = 0.000030;
                            break;
                        case "Vanuatu Vanuatu Vatu VUV":
                            z = 0.0027;
                            break;
                        case "Vatican City Euro EUR":
                            z = 0.36;
                            break;
                        case "Venezuela Venezuelan Bolivar VEB":
                            z = 0.000001232;
                            break;
                        case "Vietnam Vietnamese Dong VND":
                            z = 0.000013;
                            break;
                        case "Wake Island Dollar USD":
                            z = 0.31;
                            break;
                        case "Wallis and Futuna CFP Franc XPF":
                            z = 0.0030;
                            break;
                        case "Yemen Yemeni Rial YER":
                            z = 0.0012;
                            break;
                        case "Zambia Zambian Kwacha ZMW":
                            z = 0.015;
                            break;
                        case "Zimbabwe Dollar USD":
                            z = 0.31;
                            break;

                    }

                    if (item2.equals("Afghanistan Afghani AFN")) {
                        double x = 250.67;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AFN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Akrotiri and Dhekelia Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Aland Islands Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Albania Albanian Lek ALL")) {
                        double x = 342.74;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ALL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Algeria Dinar DZD")) {
                        double x = 421.90;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "DZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("American Samoa Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Andorra European Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Angola Angolan Kwanza AOA")) {
                        double x = 2040.37;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AOA=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Anguilla East Caribbean Dollar XCD")) {
                        double x = 8.82;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Antigua and Barbuda East Caribbean Dollar XCD")) {
                        double x = 8.82;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Argentina Argentine Peso ARS")) {
                        double x = 251.41;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ARS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Armenia Armenian Dram AMD")) {
                        double x = 1594.78;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AMD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Aruba Aruban Florin AWG")) {
                        double x = 5.81;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AWG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ascension Island Saint Helena Pound SHP")) {
                        double x = 2.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SHP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }


                    if (item2.equals("Australia Australian Dollar AUD")) {
                        double x = 4.57;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Austria European Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Azerbaijan Azerbaijan Manat AZN")) {
                        double x = 5.55;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AZN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bahamas Bahamian Dollar BSD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BSD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bahrain Bahraini Dinar BHD")) {
                        double x = 1.23;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BHD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bangladesh Bangladeshi Taka BDT")) {
                        double x = 277.15;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BDT=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Barbados Barbadian Dollar BBD")) {
                        double x = 6.61;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BBD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Belarus Belarusian Ruble BYN")) {
                        double x = 8.57;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BYN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Belgium Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Belize Belize Dollar BZD")) {
                        double x = 6.53;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Benin Franc XOF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XOFN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bermuda Bermudian Dollar BMD")) {
                        double x = 3.27;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BMD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bhutan Bhutanese Ngultrum BTN")) {
                        double x = 239.89;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BTN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }


                    if (item2.equals("Bolivia Bolivian Boliviano BOB")) {
                        double x = 22.25;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BOB=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bonaire United States Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bosnia and Herzegovina Convertible Mark BAM")) {
                        double x = 5.43;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BAM=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Botswana Botswana Pula BWP")) {
                        double x = 37.43;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BWP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Brazil Brazilian Real BRL")) {
                        double x = 18.39;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BRL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("British Indian Ocean Territory United States Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("British Virgin Islands United States Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Brunei Dollar BND")) {
                        double x = 4.45;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BND=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Bulgaria Bulgarian Lev BGN")) {
                        double x = 5.43;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BGN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Burkina Faso Franc XOF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Burundi Burundi Franc BIF")) {
                        double x = 6262.52;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "BIF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cabo Verde Cabo Verdean Escudo CVE")) {
                        double x = 307.33;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CVE=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Cambodia Cambodian Riel KHR")) {
                        double x = 13383.78;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "KHR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Cameroon Franc XAF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Canada Canadian Dollar CAD")) {
                        double x = 4.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CAD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Caribbean Netherlands USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Cayman Islands Dollar KYD")) {
                        double x = 2.71;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "KYD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Central African Republic Franc XAF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Chad Franc XAF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Chatham Islands Dollar NZD")) {
                        double x = 4.92;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Chile Chilean Peso CLP")) {
                        double x = 2583.92;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CLP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("China Chinese Yuan Renminbi CNY")) {
                        double x = 22.19;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CNY=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Christmas Island Dollar AUD")) {
                        double x = 4.57;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cocos Islands Dollar AUD")) {
                        double x = 4.57;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Colombia Colombian Peso COP")) {
                        double x = 12683.55;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "COP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Comoros Comorian Franc KMF")) {
                        double x = 1365.71;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "KMF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Congo Republic Congolese Franc CDF")) {
                        double x = 6421.11;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CDF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Congo Republic Central African CFA Franc XAF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Congo Republic Central African CFA Franc XAF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Costa Rica Costa Rican Colon CRC")) {
                        double x = 1953.89;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CRC=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cote D Ivoire Franc XOF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Croatia Croatian Kuna HRK")) {
                        double x = 20.97;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "HRK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cuba Cuban Peso CUP")) {
                        double x = 86.57;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CUP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Curacao Antillean Guilder ANG")) {
                        double x = 5.84;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ANG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cyprus Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Czechia Czech Koruna CZK")) {
                        double x = 75.23;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CZK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Denmark Danish Krone DKK")) {
                        double x = 20.66;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "DKK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Djibouti Djiboutian franc DJF")) {
                        double x = 580.00;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "DJF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dominica East Caribbean Dollar XCD")) {
                        double x = 8.82;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dominican Republic Dominican Peso DOP")) {
                        double x = 190.63;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "DOP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ecuador Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Egypt Egyptian Pound EGP")) {
                        double x = 51.27;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EGP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("El Salvador USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Equatorial Guinea Franc XAF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Eritrea Eritrean Nakfa ERN")) {
                        double x = 49.24;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ERN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Estonia European Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Eswatini Swazi Lilangeni SZL")) {
                        double x = 53.49;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SZL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ethiopia Ethiopian Birr ETB")) {
                        double x = 119.91;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ETB=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Falkland Islands Pound FKP")) {
                        double x = 2.52;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "FKP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Faroe Islands Krona FOK")) {
                        double x = 20.62;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "FOK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Fiji Fijian Dollar FJD")) {
                        double x = 6.91;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "FJD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Finland Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("France Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("French Guiana Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("French Polynesia Franc XPF")) {
                        double x = 331.91;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XPF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gabon Franc XAF")) {
                        double x = 331.91;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XAF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gambia Dalasi GMD")) {
                        double x = 167.69;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GMD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Georgia Georgian Lari GEL")) {
                        double x = 10.41;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GEL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Germany European Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ghana Ghanaian Cedi GHS")) {
                        double x = 18.78;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GHS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gibraltar Gibraltar Pound GIP")) {
                        double x = 2.53;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GIP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Greece Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Greenland Krone DKK")) {
                        double x = 20.61;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "DKK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Grenada Dollar XCD")) {
                        double x = 8.82;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guadeloupe Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guam Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guatemala Guatemalan Quetzal GTQ")) {
                        double x = 25.43;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GTQ=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guernsey Guernsey Pound GGP")) {
                        double x = 2.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GGP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guinea Guinean Franc GNF")) {
                        double x = 31798.81;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GNF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guinea Bissau Franc XOF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Guyana Guyanese Dollar GYD")) {
                        double x = 678.59;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GYD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Haiti Haitian Gourde HTG")) {
                        double x = 206.81;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "HTG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Honduras Honduran Lempira HNL")) {
                        double x = 79.74;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "HNL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Hong Kong Dollar HKD")) {
                        double x = 25.32;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "HKD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Hungary Hungarian Forint HUF")) {
                        double x = 998.79;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "HUG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Iceland Icelandic Krona ISK")) {
                        double x = 450.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ISK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("India Indian Rupee INR")) {
                        double x = 239.39;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "INR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Indonesia Indonesian Rupiah IDR")) {
                        double x = 48092.06;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "IDR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("International Monetary Fund IMF XDR")) {
                        double x = 2.3;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XDR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Iran Iranian Rial IRR")) {
                        double x = 136128.82;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "IRR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Iraq Iraqi Dinar IQD")) {
                        double x = 3884.96;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "IQD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ireland European euro EUR")) {
                        double x = 3884.96;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Isle of Man Manx Pound IMP")) {
                        double x = 2.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "IMP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Israel Israeli New Shekel ILS")) {
                        double x = 11.18;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ILS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Italy European Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jamaica Jamaican Dollar JMD")) {
                        double x = 459.79;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "JMD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Japan Japanese Yen JPY")) {
                        double x = 344.98;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "JYP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jersey Pound JEP")) {
                        double x = 2.52;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "JEP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jordan Jordanian Dinar JOD")) {
                        double x = 2.31;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "JOD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kazakhstan Kazakhstani Tenge KZT")) {
                        double x = 1404.24;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "KZT=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kenya Kenyan Shilling KES")) {
                        double x = 354.18;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "KES=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kiribati Australian Dollar AUD")) {
                        double x = 4.57;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kosovo European Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kuwait Kuwaiti Dinar KWD")) {
                        double x = 1;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "KWD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kyrgyzstan Kyrgyzstani Som KGS")) {
                        double x = 260.06;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "KGS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Laos Lao Kip LAK")) {
                        double x = 30093.11;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "LAK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Latvia Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Lebanon Lebanese Pound LBP")) {
                        double x = 4919.83;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "LBP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Lesotho Lesotho Loti LSL")) {
                        double x = 54.15;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "LSL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Liberia Liberian Dollar LRD")) {
                        double x = 643.72;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "LRD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Libya Libyan Dinar LYD")) {
                        double x = 4.47;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "LYD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Liechtenstein Swiss Franc CHF")) {
                        double x = 2.98;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CHF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Lithuania Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Luxembourg Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Macau Macanese Pataca MOP")) {
                        double x = 26.08;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MOP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Madagascar Malagasy Ariary MGA")) {
                        double x = 12563.46;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MGA=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Malawi Malawian Kwacha MWK")) {
                        double x = 2436.91;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MWK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Malaysia Malaysian Ringgit MYR")) {
                        double x = 13.59;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MYR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Maldives Maldivian Rufiyaa MVR")) {
                        double x = 50.87;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MVR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mali Franc XOF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Malta Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Marshall Islands Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Martinique Euro EUR")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mauritania Mauritanian Ouguiya MRO")) {
                        double x = 1159.99;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MRO=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mauritius Mauritian Rupee MUR")) {
                        double x = 130.78;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mayotte Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mexico Mexican Peso MXN")) {
                        double x = 69.91;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MXN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Micronesia Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Moldova Moldovan Leu MDL")) {
                        double x = 54.83;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MDL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Monaco Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Mongolia Mongolian Tugrik MNT")) {
                        double x = 9328.40;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MNT=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Montenegro Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Montserrat East Caribbean Dollar XCD")) {
                        double x = 8.82;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Morocco Moroccan Dirham MAD")) {
                        double x = 30.22;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MAD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Mozambique Mozambican Metical MZN")) {
                        double x = 234.18;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MZN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Myanmar Myanmar Kyat MMK")) {
                        double x = 4221.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MMK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Namibia Namibian Dollar NAD")) {
                        double x = 54.19;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NAD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Nauru Australian Dollar AUD")) {
                        double x = 4.57;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Nepal Nepalese Rupee NPR")) {
                        double x = 383.33;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NPR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Netherlands European Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("New Caledonia CFP Franc XPF")) {
                        double x = 331.91;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XPF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("New Zealand Dollar NZD")) {
                        double x = 4.92;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Nicaragua Nicaraguan Cordoba NIO")) {
                        double x = 112.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NIO=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Niger Franc XOF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Nigeria Nigerian Naira NGN")) {
                        double x = 1234.89;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NGN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Niue Dollar NZD")) {
                        double x = 4.92;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Norfolk Island Dollar AUD")) {
                        double x = 4.57;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AUS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Northern Mariana Islands Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("North Korea North Korean Won KPW")) {
                        double x = 2940.52;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "KPW=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("North Macedonia Macedonian Denar MKD")) {
                        double x = 170.7;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "MKD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Norway Norwegian Krone NOK")) {
                        double x = 30.22;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NOK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Oman Omani Rial OMR")) {
                        double x = 1.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "OMR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Pakistan Pakistani Rupee PKR ")) {
                        double x = 535.69;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "PKR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Palau Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Palestine Shekel ILS")) {
                        double x = 11.12;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ILS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Panama Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Papua New Guinea Kina PGK")) {
                        double x = 11.42;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "PGK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Paraguay Paraguayan Guarani PYG")) {
                        double x = 22844.92;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "PYG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Peru Peruvian Sol PEN")) {
                        double x = 11.80;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "PEN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Philippines Philippine Peso PHP")) {
                        double x = 158.35;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "PHP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Pitcairn Islands Dollar NZD")) {
                        double x = 4.92;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Poland Polish Zloty PLN")) {
                        double x = 12.45;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "PLN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Portugal European Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Puerto Rico Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Qatar Qatari Riyal QAR")) {
                        double x = 11.89;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "QAR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Reunion Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Romania Romanian Leu RON")) {
                        double x = 13.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "RON=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Russia Russian Ruble RUB")) {
                        double x = 255.28;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "RUB=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Rwanda Rwandan Franc RWF")) {
                        double x = 3096.49;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "RWF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saba Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Helena Saint Helena Pound SHP")) {
                        double x = 2.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SHP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Kitts Dollar XCD")) {
                        double x = 8.82;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Lucia Dollar XCD")) {
                        double x = 8.82;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saint Martin Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Pierre and Miquelon Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Saint Vincent Dollar XCD")) {
                        double x = 8.82;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XCD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Samoa Samoan Tala WST")) {
                        double x = 8.66;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "WST=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("San Marino Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sao Tome and Principe Sao Dobra STN")) {
                        double x = 68.2983;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "STN=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Saudi Arabia Riyal SAR")) {
                        double x = 12.25;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SAR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Senegal West African CFA Franc XOF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Serbia Serbian Dinar RSD")) {
                        double x = 328.32;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "RSD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Seychelles Seychellois Rupee SCR")) {
                        double x = 58.75;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SCR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sierra Leone Sierra Leonean Leone SLL")) {
                        double x = 32094.28;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SLL=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Singapore Singapore Dollar SGD")) {
                        double x = 4.45;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SGD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Sint Eustatius Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sint Maarten Guilder ANG")) {
                        double x = 5.84;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ANG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Slovakia Euro EUR")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Solomon Island Dollar SBD")) {
                        double x = 26.66;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SBD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Somalia Somali Dhilling SOS")) {
                        double x = 1872.32;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SOS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("South Africa South African Rand ZAR")) {
                        double x = 53.60;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ZAR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("South Georgia Island Pound Sterling GBP")) {
                        double x = 2.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GBP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("South Korea South Korean Won KRW")) {
                        double x = 3792.94;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "KRW=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("South Sudan South Sudanese Pound SSP")) {
                        double x = 425.38;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SSP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Spain Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sri Lanka Sri Lankan Rupee LKR")) {
                        double x = 603.44;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "LKR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sudan Sudanese Pound SDG")) {
                        double x = 179.39;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SDG=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Suriname Surinamese Dollar SRD")) {
                        double x = 45.81;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SRD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Svalbard and Jan Mayen Norwegian Krone NOK")) {
                        double x = 30.1;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NOK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Sweden Swedish Krona SEK")) {
                        double x = 29.12;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SEK=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Switzerland Swiss Franc CHF")) {
                        double x = 2.99;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "CHF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Syria Syrian Pound SYP")) {
                        double x = 4103.90;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "SYP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Taiwan New Taiwan Dollar TWD")) {
                        double x = 93.86;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "TWD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tajikistan Tajikistani Somoni TJS")) {
                        double x = 33.75;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "TJS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Tanzania Tanzanian Shilling TZS")) {
                        double x = 7564.20;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "TZS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Thailand Thai Baht THB")) {
                        double x = 102.95;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "THB=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Timor Leste Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Togo Franc XOF")) {
                        double x = 1817.34;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XOF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Tokelau Dollar NZD")) {
                        double x = 4.92;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "NZD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tonga Tongan Pa anga TOP")) {
                        double x = 7.73;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "TOP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Trinidad and Tobago Dollar TTD")) {
                        double x = 21.93;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "TTD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Tristan Da Cunha Pound Sterling GBP")) {
                        double x = 2.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GBP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tunisia Tunisian Dinar TND")) {
                        double x = 9.04;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "TND=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Turkey Turkish Lira TRY")) {
                        double x = 25.35;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "TRY=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Turkmenistan Turkmen Manat TMT")) {
                        double x = 11.13;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "TMT=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Turks and Caicos Islands Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Tuvalu Australian dollar AUD")) {
                        double x = 4.57;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AUD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Uganda Ugandan Shilling UGX")) {
                        double x = 12097.81;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "UGX=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ukraine Ukrainian Hryvnia UAH")) {
                        double x = 92.53;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "UAH=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("United Arab Emirates UAE Dirham AED")) {
                        double x = 12.00;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "AED=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("United Kingdom Pound Sterling GBP")) {
                        double x = 2.51;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "GBP=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("United States of America Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Uruguay Uruguayan Peso UYU")) {
                        double x = 138.85;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "UYU=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("US Virgin Islands Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Uzbekistan Uzbekistani Som UZS")) {
                        double x = 33768.02;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "UZS=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Vanuatu Vanuatu Vatu VUV")) {
                        double x = 364.68;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "VUV=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Vatican City Euro EUR")) {
                        double x = 2.77;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "EUR=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Venezuela Venezuelan Bolivar VES")) {
                        double x = 1.98;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "VES=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Vietnam Vietnamese Dong VND")) {
                        double x = 75726.11;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "VND=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Wake Island Dollar USD")) {
                        double x = 75726.11;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Wallis and Futuna CFP Franc XPF")) {
                        double x = 331.91;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "XPF=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Yemen Yemeni Rial YER")) {
                        double x = 807.46;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "YER=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Zambia Zambian Kwacha ZMW")) {
                        double x = 65.37;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "ZMW=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Zimbabwe Dollar USD")) {
                        double x = 3.26;
                        double ans = a * x * z;
                        Toast.makeText(currency.this, "USD=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}