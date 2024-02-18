#include<iostream>
using namespace std;
class student{
    private:
        string fullname;
        int rollnum;
        double sempercentage;
        string collegename;
        int collegecode;
    public:
        student(){}
        student(string name,int roll,string college,int code,double percentage)
        {
            fullname = name;
            rollnum = roll;
            collegename = college;
            collegecode = code;
            sempercentage = percentage;
        }
        //destructor
        ~student(){}
        void printstudentdetails()
        {
            cout << "Name : " << fullname << endl;
            cout << "Rollno : " << rollnum << endl;
            cout << "College : " << collegename << endl;
            cout << "College code : " << collegecode << endl;
            cout << "Sem percentage : " << sempercentage   << endl;
        }
};
//main function 
int main()
{
    student s1("vamsi",61,"Mvgr",33,99);

      s1.printstudentdetails();
   
}
