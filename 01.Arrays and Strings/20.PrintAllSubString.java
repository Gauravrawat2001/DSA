 class PrintAllSubString {
    
    public static void main(String[] args) {
    String str = "ABCDE" ;

    for(int i = 0; i < str.length(); i++){
        for(int j = i; j < str.length(); j++){
            String substr = str.substring(i, j + 1);
            System.out.println(substr);
        }
    }
   }
 }
