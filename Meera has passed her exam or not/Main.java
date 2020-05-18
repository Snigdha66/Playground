#include<iostream>
int main()
{
  // Type your code here
  int n, reg,i,value,a[10], flag;
  std::cin>>n;
for(i=0;i<n;i++)
{
  std::cin>>a[i];
}
 std::cin>>reg;
  for(i=0;i<n;i++)
{
 if(a[i]==reg)
 { value=a[i];
  std::cout<<"She passed her exam";
  flag=1;
 }
}
  if(flag!=1)
  {
    std::cout<<"She failed";
  }
  else
    return 0;
}