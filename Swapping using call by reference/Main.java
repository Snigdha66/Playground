#include <iostream>
int swap(int &, int &);
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
}
int swap(int &x, int &y)
{
  int temp;
  temp=x;
  x=y;
  y=temp;
}