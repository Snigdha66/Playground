#include<iostream>
int main()
{
  int maxwt, w;
  std::cin>>maxwt>>w;
  if(maxwt>w)
    std::cout<<"Yes, you can enter.";
  else if(maxwt==w)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else if(maxwt<w)
    std::cout<<"Sorry, you can't enter";
}