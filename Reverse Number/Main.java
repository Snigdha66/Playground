#include <iostream>
int main() 
{
	// Type your code here
  int n, reversedNumber = 0, remainder;
    std::cin >> n;

    while(n != 0)
    {
        remainder = n%10;
        reversedNumber = reversedNumber*10 + remainder;
        n /= 10;
    }

   std::cout<<reversedNumber;
 return 0;
}