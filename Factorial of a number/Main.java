#include<iostream>
int main(){
  // Type your code 
  int a,i,fact=1;
  std::cin>>a;
  for(i=1;i<=a;i++)
  {
  fact=fact*i;
  }
  std::cout<<fact;
}