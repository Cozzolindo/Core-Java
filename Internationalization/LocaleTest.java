package Internationalization;

import java.util.Locale;

public class LocaleTest {
    
    public static void main(String[] args) {
        
        
        Locale.setDefault(Locale.US);
        
        Locale l = Locale.getDefault();

        System.out.println(l.getCountry() + " " + l.getLanguage());
        System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage());
    }
}
