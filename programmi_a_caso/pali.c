#include <stdio.h>
#include <string.h>

int main() {
  int lung;
  char parola[100];
  int flag=1;
  int i=0;
  printf("inserisci parola\n");
  scanf("%s", parola);
  lung = strlen(parola);
  int meta=lung/2;

  while((i<meta)&&(flag==1)){
    if(parola[i]!=parola[lung-i-1]){
      flag=0;
    }else{
      i++;
    }
  }
  if(flag==1){
     printf("la parola è palindroma\n");
  }else{
     printf("la parola non è palindroma\n");
  }
  return 0;
}
  