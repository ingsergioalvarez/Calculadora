import java.util.ArrayList;
import java.util.List;

public class Currency {
    private String currencyCode;
    private String currencyName;
    private String country;

    public Currency(String currencyCode, String currencyName, String country) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.country = country;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public String getCurrencyName() {
        return currencyName;
    }
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "Currency{" +
                "currencyCode='" + currencyCode + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    public static List<Currency> getDivisasValidas() {
        List<Currency> divisasValidas = new ArrayList<>();
        // Divisas disponibles
        divisasValidas.add(new Currency("AED", "UAE Dirham", "United Arab Emirates"));
        divisasValidas.add(new Currency("AFN", "Afghan Afghani", "Afghanistan"));
        divisasValidas.add(new Currency("ALL", "Albanian Lek", "Albania"));
        divisasValidas.add(new Currency("AMD", "Armenian Dram", "Armenia"));
        divisasValidas.add(new Currency("ANG", "Netherlands Antillian Guilder", "Netherlands Antilles"));
        divisasValidas.add(new Currency("AOA", "Angolan Kwanza", "Angola"));
        divisasValidas.add(new Currency("ARS", "Argentine Peso", "Argentina"));
        divisasValidas.add(new Currency("AUD", "Australian Dollar", "Australia"));
        divisasValidas.add(new Currency("AWG", "Aruban Florin", "Aruba"));
        divisasValidas.add(new Currency("AZN", "Azerbaijani Manat", "Azerbaijan"));
        divisasValidas.add(new Currency("BAM", "Bosnia and Herzegovina Mark", "Bosnia and Herzegovina"));
        divisasValidas.add(new Currency("BBD", "Barbados Dollar", "Barbados"));
        divisasValidas.add(new Currency("BDT", "Bangladeshi Taka", "Bangladesh"));
        divisasValidas.add(new Currency("BGN", "Bulgarian Lev", "Bulgaria"));
        divisasValidas.add(new Currency("BHD", "Bahraini Dinar", "Bahrain"));
        divisasValidas.add(new Currency("BIF", "Burundian Franc", "Burundi"));
        divisasValidas.add(new Currency("BMD", "Bermudian Dollar", "Bermuda"));
        divisasValidas.add(new Currency("BND", "Brunei Dollar", "Brunei"));
        divisasValidas.add(new Currency("BOB", "Bolivian Boliviano", "Bolivia"));
        divisasValidas.add(new Currency("BRL", "Brazilian Real", "Brazil"));
        divisasValidas.add(new Currency("BSD", "Bahamian Dollar", "Bahamas"));
        divisasValidas.add(new Currency("BTN", "Bhutanese Ngultrum", "Bhutan"));
        divisasValidas.add(new Currency("BWP", "Botswana Pula", "Botswana"));
        divisasValidas.add(new Currency("BYN", "Belarusian Ruble", "Belarus"));
        divisasValidas.add(new Currency("BZD", "Belize Dollar", "Belize"));
        divisasValidas.add(new Currency("CAD", "Canadian Dollar", "Canada"));
        divisasValidas.add(new Currency("CDF", "Congolese Franc", "Democratic Republic of the Congo"));
        divisasValidas.add(new Currency("CHF", "Swiss Franc", "Switzerland"));
        divisasValidas.add(new Currency("CLP", "Chilean Peso", "Chile"));
        divisasValidas.add(new Currency("CNY", "Chinese Renminbi", "China"));
        divisasValidas.add(new Currency("COP", "Colombian Peso", "Colombia"));
        divisasValidas.add(new Currency("CRC", "Costa Rican Colon", "Costa Rica"));
        divisasValidas.add(new Currency("CUP", "Cuban Peso", "Cuba"));
        divisasValidas.add(new Currency("CVE", "Cape Verdean Escudo", "Cape Verde"));
        divisasValidas.add(new Currency("CZK", "Czech Koruna", "Czech Republic"));
        divisasValidas.add(new Currency("DJF", "Djiboutian Franc", "Djibouti"));
        divisasValidas.add(new Currency("DKK", "Danish Krone", "Denmark"));
        divisasValidas.add(new Currency("DOP", "Dominican Peso", "Dominican Republic"));
        divisasValidas.add(new Currency("DZD", "Algerian Dinar", "Algeria"));
        divisasValidas.add(new Currency("EGP", "Egyptian Pound", "Egypt"));
        divisasValidas.add(new Currency("ERN", "Eritrean Nakfa", "Eritrea"));
        divisasValidas.add(new Currency("ETB", "Ethiopian Birr", "Ethiopia"));
        divisasValidas.add(new Currency("EUR", "Euro", "European Union"));
        divisasValidas.add(new Currency("FJD", "Fiji Dollar", "Fiji"));
        divisasValidas.add(new Currency("FKP", "Falkland Islands Pound", "Falkland Islands"));
        divisasValidas.add(new Currency("FOK", "Faroese Króna", "Faroe Islands"));
        divisasValidas.add(new Currency("GBP", "Pound Sterling", "United Kingdom"));
        divisasValidas.add(new Currency("GEL", "Georgian Lari", "Georgia"));
        divisasValidas.add(new Currency("GGP", "Guernsey Pound", "Guernsey"));
        divisasValidas.add(new Currency("GHS", "Ghanaian Cedi", "Ghana"));
        divisasValidas.add(new Currency("GIP", "Gibraltar Pound", "Gibraltar"));
        divisasValidas.add(new Currency("GMD", "Gambian Dalasi", "The Gambia"));
        divisasValidas.add(new Currency("GNF", "Guinean Franc", "Guinea"));
        divisasValidas.add(new Currency("GTQ", "Guatemalan Quetzal", "Guatemala"));
        divisasValidas.add(new Currency("GYD", "Guyanese Dollar", "Guyana"));
        divisasValidas.add(new Currency("HKD", "Hong Kong Dollar", "Hong Kong"));
        divisasValidas.add(new Currency("HNL", "Honduran Lempira", "Honduras"));
        divisasValidas.add(new Currency("HRK", "Croatian Kuna", "Croatia"));
        divisasValidas.add(new Currency("HTG", "Haitian Gourde", "Haiti"));
        divisasValidas.add(new Currency("HUF", "Hungarian Forint", "Hungary"));
        divisasValidas.add(new Currency("IDR", "Indonesian Rupiah", "Indonesia"));
        divisasValidas.add(new Currency("ILS", "Israeli New Shekel", "Israel"));
        divisasValidas.add(new Currency("IMP", "Manx Pound", "Isle of Man"));
        divisasValidas.add(new Currency("INR", "Indian Rupee", "India"));
        divisasValidas.add(new Currency("IQD", "Iraqi Dinar", "Iraq"));
        divisasValidas.add(new Currency("IRR", "Iranian Rial", "Iran"));
        divisasValidas.add(new Currency("ISK", "Icelandic Króna", "Iceland"));
        divisasValidas.add(new Currency("JEP", "Jersey Pound", "Jersey"));
        divisasValidas.add(new Currency("JMD", "Jamaican Dollar", "Jamaica"));
        divisasValidas.add(new Currency("JOD", "Jordanian Dinar", "Jordan"));
        divisasValidas.add(new Currency("JPY", "Japanese Yen", "Japan"));
        divisasValidas.add(new Currency("KES", "Kenyan Shilling", "Kenya"));
        divisasValidas.add(new Currency("KGS", "Kyrgyzstani Som", "Kyrgyzstan"));
        divisasValidas.add(new Currency("KHR", "Cambodian Riel", "Cambodia"));
        divisasValidas.add(new Currency("KID", "Kiribati Dollar", "Kiribati"));
        divisasValidas.add(new Currency("KMF", "Comorian Franc", "Comoros"));
        divisasValidas.add(new Currency("KRW", "South Korean Won", "South Korea"));
        divisasValidas.add(new Currency("KWD", "Kuwaiti Dinar", "Kuwait"));
        divisasValidas.add(new Currency("KYD", "Cayman Islands Dollar", "Cayman Islands"));
        divisasValidas.add(new Currency("KZT", "Kazakhstani Tenge", "Kazakhstan"));
        divisasValidas.add(new Currency("LAK", "Lao Kip", "Laos"));
        divisasValidas.add(new Currency("LBP", "Lebanese Pound", "Lebanon"));
        divisasValidas.add(new Currency("LKR", "Sri Lanka Rupee", "Sri Lanka"));
        divisasValidas.add(new Currency("LRD", "Liberian Dollar", "Liberia"));
        divisasValidas.add(new Currency("LSL", "Lesotho Loti", "Lesotho"));
        divisasValidas.add(new Currency("LYD", "Libyan Dinar", "Libya"));
        divisasValidas.add(new Currency("MAD", "Moroccan Dirham", "Morocco"));
        divisasValidas.add(new Currency("MDL", "Moldovan Leu", "Moldova"));
        divisasValidas.add(new Currency("MGA", "Malagasy Ariary", "Madagascar"));
        divisasValidas.add(new Currency("MKD", "Macedonian Denar", "North Macedonia"));
        divisasValidas.add(new Currency("MMK", "Burmese Kyat", "Myanmar"));
        divisasValidas.add(new Currency("MNT", "Mongolian Tögrög", "Mongolia"));
        divisasValidas.add(new Currency("MOP", "Macanese Pataca", "Macau"));
        divisasValidas.add(new Currency("MRU", "Mauritanian Ouguiya", "Mauritania"));
        divisasValidas.add(new Currency("MUR", "Mauritian Rupee", "Mauritius"));
        divisasValidas.add(new Currency("MVR", "Maldivian Rufiyaa", "Maldives"));
        divisasValidas.add(new Currency("MWK", "Malawian Kwacha", "Malawi"));
        divisasValidas.add(new Currency("MXN", "Mexican Peso", "Mexico"));
        divisasValidas.add(new Currency("MYR", "Malaysian Ringgit", "Malaysia"));
        divisasValidas.add(new Currency("MZN", "Mozambican Metical", "Mozambique"));
        divisasValidas.add(new Currency("NAD", "Namibian Dollar", "Namibia"));
        divisasValidas.add(new Currency("NGN", "Nigerian Naira", "Nigeria"));
        divisasValidas.add(new Currency("NIO", "Nicaraguan Córdoba", "Nicaragua"));
        divisasValidas.add(new Currency("NOK", "Norwegian Krone", "Norway"));
        divisasValidas.add(new Currency("NPR", "Nepalese Rupee", "Nepal"));
        divisasValidas.add(new Currency("NZD", "New Zealand Dollar", "New Zealand"));
        divisasValidas.add(new Currency("OMR", "Omani Rial", "Oman"));
        divisasValidas.add(new Currency("PAB", "Panamanian Balboa", "Panama"));
        divisasValidas.add(new Currency("PEN", "Peruvian Sol", "Peru"));
        divisasValidas.add(new Currency("PGK", "Papua New Guinean Kina", "Papua New Guinea"));
        divisasValidas.add(new Currency("PHP", "Philippine Peso", "Philippines"));
        divisasValidas.add(new Currency("PKR", "Pakistani Rupee", "Pakistan"));
        divisasValidas.add(new Currency("PLN", "Polish Złoty", "Poland"));
        divisasValidas.add(new Currency("PYG", "Paraguayan Guaraní", "Paraguay"));
        divisasValidas.add(new Currency("QAR", "Qatari Riyal", "Qatar"));
        divisasValidas.add(new Currency("RON", "Romanian Leu", "Romania"));
        divisasValidas.add(new Currency("RSD", "Serbian Dinar", "Serbia"));
        divisasValidas.add(new Currency("RUB", "Russian Ruble", "Russia"));
        divisasValidas.add(new Currency("RWF", "Rwandan Franc", "Rwanda"));
        divisasValidas.add(new Currency("SAR", "Saudi Riyal", "Saudi Arabia"));
        divisasValidas.add(new Currency("SBD", "Solomon Islands Dollar", "Solomon Islands"));
        divisasValidas.add(new Currency("SCR", "Seychellois Rupee", "Seychelles"));
        divisasValidas.add(new Currency("SDG", "Sudanese Pound", "Sudan"));
        divisasValidas.add(new Currency("SEK", "Swedish Krona", "Sweden"));
        divisasValidas.add(new Currency("SGD", "Singapore Dollar", "Singapore"));
        divisasValidas.add(new Currency("SHP", "Saint Helena Pound", "Saint Helena"));
        divisasValidas.add(new Currency("SLE", "Sierra Leonean Leone", "Sierra Leone"));
        divisasValidas.add(new Currency("SOS", "Somali Shilling", "Somalia"));
        divisasValidas.add(new Currency("SRD", "Surinamese Dollar", "Suriname"));
        divisasValidas.add(new Currency("SSP", "South Sudanese Pound", "South Sudan"));
        divisasValidas.add(new Currency("STN", "São Tomé and Príncipe Dobra", "São Tomé and Príncipe"));
        divisasValidas.add(new Currency("SYP", "Syrian Pound", "Syria"));
        divisasValidas.add(new Currency("SZL", "Eswatini Lilangeni", "Eswatini"));
        divisasValidas.add(new Currency("THB", "Thai Baht", "Thailand"));
        divisasValidas.add(new Currency("TJS", "Tajikistani Somoni", "Tajikistan"));
        divisasValidas.add(new Currency("TMT", "Turkmenistan Manat", "Turkmenistan"));
        divisasValidas.add(new Currency("TND", "Tunisian Dinar", "Tunisia"));
        divisasValidas.add(new Currency("TOP", "Tongan Paʻanga", "Tonga"));
        divisasValidas.add(new Currency("TRY", "Turkish Lira", "Turkey"));
        divisasValidas.add(new Currency("TTD", "Trinidad and Tobago Dollar", "Trinidad and Tobago"));
        divisasValidas.add(new Currency("TVD", "Tuvaluan Dollar", "Tuvalu"));
        divisasValidas.add(new Currency("TWD", "New Taiwan Dollar", "Taiwan"));
        divisasValidas.add(new Currency("TZS", "Tanzanian Shilling", "Tanzania"));
        divisasValidas.add(new Currency("UAH", "Ukrainian Hryvnia", "Ukraine"));
        divisasValidas.add(new Currency("UGX", "Ugandan Shilling", "Uganda"));
        divisasValidas.add(new Currency("USD", "United States Dollar", "United States"));
        divisasValidas.add(new Currency("UYU", "Uruguayan Peso", "Uruguay"));
        divisasValidas.add(new Currency("UZS", "Uzbekistani So'm", "Uzbekistan"));
        divisasValidas.add(new Currency("VES", "Venezuelan Bolívar Soberano", "Venezuela"));
        divisasValidas.add(new Currency("VND", "Vietnamese Đồng", "Vietnam"));
        divisasValidas.add(new Currency("VUV", "Vanuatu Vatu", "Vanuatu"));
        divisasValidas.add(new Currency("WST", "Samoan Tālā", "Samoa"));
        divisasValidas.add(new Currency("XAF", "Central African CFA Franc", "CEMAC"));
        divisasValidas.add(new Currency("XCD", "East Caribbean Dollar", "Organisation of Eastern Caribbean States"));
        divisasValidas.add(new Currency("XDR", "Special Drawing Rights", "International Monetary Fund"));
        divisasValidas.add(new Currency("XOF", "West African CFA franc", "CFA"));
        divisasValidas.add(new Currency("XPF", "CFP Franc", "Collectivités d'Outre-Mer"));
        divisasValidas.add(new Currency("YER", "Yemeni Rial", "Yemen"));
        divisasValidas.add(new Currency("ZAR", "South African Rand", "South Africa"));
        divisasValidas.add(new Currency("ZMW", "Zambian Kwacha", "Zambia"));
        divisasValidas.add(new Currency("ZWL", "Zimbabwean Dollar", "Zimbabwe"));


        return divisasValidas;
    }
}
