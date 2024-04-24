#include<iostream>
using namespace std;
//template function
template <typename Digit> Digit add(Digit num1,Digit num2)
{
    return num1+num2;
}

//template class
template <typename TempData>
class Report
{
    TempData value;
    public:
    Report(TempData num1)
    {
        value=num1;
    }
    void displayValue()
    {
        cout<<"The value is "<<value<<endl;
    }
};

int main()
{
    int intResult=add(1,5);
    float floatResult=add(1.0,5.0);
    cout<<"Sum of the values : "<<intResult<<endl;
    cout<<"Sum of the values : "<<floatResult<<endl;
    Report <int>obj(5);
    Report <double>obj2(2.4589654);
    obj.displayValue();
    obj2.displayValue();
    return 0;
}
