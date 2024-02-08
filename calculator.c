#include<iostream>
using namespace std;
int main()
{
    float num1,num2;
    cout<<"Enter number1: ";
    cin>>num1;
    cout<<"Enter number2: ";
    cin>>num2;
    cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n";
    int choice;
    cout<<"Enter your choice: ";
    cin>>choice;
    switch(choice){
        case 1:
            cout<<"Addition of "<<num1<< " and "<<num2<< " is : "<<num1+num2<<endl;
            break;
        case 2:
            cout<<"Subtraction of "<<num1<< " and "<<num2<< " is : "<<num1-num2<<endl;
            break;
        case 3:
            cout<<"Multiplication of "<<num1<< " and "<<num2<< " is : "<<num1*num2<<endl;
            break;
        case 4:
            cout<<"Divison of "<<num1<< " and "<<num2<< " is : "<<num1/num2<<endl;
            break;
        default:
            cout<<"Invalid choice\n Please observe menu and enter your choice";
            break;
    }
}
