class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    
  }

    int allowance(double target){
        double amount = 0.01;
        int days = 1;

    while(amount < target){
        amount = amount * 2;
        days++;
    }

    return days;
}





  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}