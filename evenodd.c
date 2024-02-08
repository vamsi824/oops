#include <iostream>
#include<string>
using namespace std;
string evenodd(int i);
int main() {
   int n;
   cout<<"Enter an integer : ";
   cin>>n;
   cout<<" "<<evenodd(n);
}
string evenodd(int n) 
{
   if (n%2 == 0) 
   {
        return "Number you entered is a even number\n";
   } 
   else 
   {
        return "Number you entered is a odd number\n";
   }
}
