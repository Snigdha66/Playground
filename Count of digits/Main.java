#include<iostream>
int main()
{
  // Type your code here
  int a,n=0;
  std::cin>>a;
  do
  {
    a/=10;
    n++;
  }while(a!=0);
    std::cout<<n;
}