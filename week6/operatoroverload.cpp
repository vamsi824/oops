#include <iostream>
using namespace std;
class Operator{
    public:
        int real;
        int imag;
    void input(){
        cout<<"Enter real and imaginary number : ";
        cin>>real;
        cin>>imag;
    }
    Operator operator*(Operator obj){
        Operator obj1;
        obj1.real=real*obj.real;
        obj1.imag=imag*obj.imag;
        return obj1;
    }
    void output() {
        if (imag < 0)
            cout<<"Complex number: " << real << imag << "i";
        else
            cout<<"Complex number: " << real << "+" << imag << "i";
    }
};
int main()
{
    Operator a1,a2,result;
    cout<<"Enter first number\n";
    a1.input();
    cout<<"Enter second number\n";
    a2.input();
    result=a1*a2;
    result.output();
}
