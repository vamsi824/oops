#include <iostream>
using namespace std;
class Multiplication{
    public:
        float multiplication(int a,int b)
        {
            return a*b;
        }
        float multiplication(int a,int b,int c)
        {
            return a*b*c;
        }
};
int main()
{
    Multiplication obj;
    cout<<"Product of two number: "<<obj.multiplication(2,3)<<endl;
    cout<<"Product of three number: "<<obj.multiplication(8,2,4)<<endl;
}
