#include <stdio.h>

int main() {
  int n, cont=0;
  float media, sum=0;
  for(int i=0;i!=-1;i++){
    printf("inserisci numero positivo:\n");
    scanf("%d",&n);
    if(n<0){
      printf("avevo detto positivo, addio \n");
      return 0;
    }
    sum=sum+n;
    cont++;
    media=sum/cont;
    printf("la media è %.2f \n", media);
  }
}
  