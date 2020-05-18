#include<iostream>
using namespace std;
int main()
{
int n,max,i;
cin>>n;
int arr[10];
for(i=0;i<n;i++)
{
std::cin>>arr[i];
}
max=arr[0];
for(int i=1;i<n;i++)
{
if(arr[i]>max)
max=arr[i];
}
std::cout<<max;
}
