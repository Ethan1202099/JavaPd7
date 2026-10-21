class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  String creditCardType(String num){
    if (num.Substring(0,2).equals("4"))
        return "Visa";
    else if (num.Substring(0,2).equals("34") || num.Substring(0,2).equals("37"))
        return "American Express";
    else if (num.Substring(0,2).equals("36"))
        return "Diner Club";
    else if (num.Substring(0,2).equals("51") || num.Substring(0,2).equals("55"))
        return "Mastercard";
     else if (num.Substring(0,2).equals("65") || num.Substring(0,2).equals("6011"))
        return "Discover";
  }


    String pigLatin(String word){
      return word.substring(1) + word.substring(0,1) + "ay";
    }

    String nycLocate(String zip){
      String pre = zip.substring(0,3);

      if(pre.equals("100") || pre.equals("101") || ("102"))
        return "Manhattan";
      else if (pre.equals("103"))
        return "Staten Island";
      else if (pre.equals("104"))
        return "Bronx";
      else if (pre.equals("112"))
        return "Brooklyn";
      else if (pre.equals("113") || pre.equals("111") || ("114"))
        return "Queens";
      else
        return "Unknown";
    }
  
}