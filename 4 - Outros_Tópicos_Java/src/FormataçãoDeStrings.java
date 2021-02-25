public class FormataçãoDeStrings {
	public static void main(String[] args) {
        //Original
        String original = "abcde FGHIJ ABC abc DEFG ";

        //Menpuscula
        String s01 = original.toLowerCase();
        // Maiúscula
        String s02 = original.toUpperCase();
        System.out.println();
        //trim
        String s03 = original.trim();
        //substring.
        String s04 = original.substring(2);
        //substring.02
        String s05 = original.substring(2, 9);
        //Substituir: Replace(char, char)
        String s06 = original.replace('a', 'x');
        //Replace(string, string)
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        


        //imp. Original.
        System.out.println("Original: " + "-" + original + "   -");
        //imp.Minúscula.
        System.out.println("ToLowerCase: " + "-" + s01 + "-");
        //imp. Maiúcula
        System.out.println("ToUpperCase: " + "-"+ s02 + "-");
        //imp. trim.
        System.out.println("Trim: " +  "-" + s03 + "-");
        //imp. substring.
        System.out.println("Substring (2): " + "-" + s04 + "-");
        //imp. substring(inicio, fim).
        System.out.println("substring(inicio, fim : " + s05);
        //imp. Replace.
        System.out.println(" Replace(a, x) " + s06);
        //imp. Replace(string, string)
        System.out.println("(Replace(abc, xy) " + s07);
        //imp. IndexOf
        System.out.println("IndexOf: " + i);
        //imp. LastIndexOf
        System.out.println("LastIndexOf : " + j);
        
        
        
        
	}

}
