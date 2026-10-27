class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
    

    
    
  }

String spaces(int N){
  String bld = "";

  for(int x=0; x<N; x++){
    bld+="";
  }
  return bld;
}
double harmonic(int N){
  double sum=0;
  for(int x-1; x<=N; x++){
    bld+= 1./x;
  }
  return sum;
}

double sine(int N, double x){
    double sum= 0;
    int sign= 1;
    for(int i= 1; i< 2*N; i+=2){
      sum += sign * Math.pow(x,i);
      sign = -1;
    }
    return sum;
}

double sine2(int N, double x){
    double sum= 0;
    for(int i=0; i<=N;i++){
      sum+= (Math.pow(-1,i)*Math.pow(x,2*i+1))/fact(2*i+1);
    }
    return sum;
  }

}