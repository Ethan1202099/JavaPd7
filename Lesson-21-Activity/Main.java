class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    
  }

    void allowance(double target){
        double amount = 0.01;
        int days = 1;

    while(amount < target){
        amount = amount * 2;
        days++;
    }

    void addTwoNumbers(){
      int n1 = randInt(0,100);
      int n2 = randInt(0,100);
      print("What is sum of  "+ n1 + " and "+n2);
      int answer = Input.readInt();

      while ( answer == n1 + n2){
        print("Incorrect, try again...");
        answer = Input.readInt();
      }

      print("Correct!");
    }                                                                                                                                                                                                                                                                     

      int GCF(int n1, int n2){
        int divisor = Math.min(n1, n2);

        while(  !(n1%divsor == 0 && n2%disisor)  ){
            divisor --;
        }
        return divisor;
      }

}





  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}