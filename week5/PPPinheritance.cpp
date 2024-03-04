#include <iostream>
using namespace std;
class Parent
{
public:
    string name = "vamsi";
protected:
int roll = 561;
private:
    int code = 33;
};
class PublicChild : public Parent
{
public:
    int getProtected()
    {
        return roll;
    }
};
class ProtectedChild : protected Parent
{
public:
    string getPublic()
    {
        return name;
    }
    int getProtected()
    {
        return roll;
    }
};
class PrivateChild : private Parent
{
public:
    string getPublic()
    {
        return name;
    }
    int getProtected()
    {
        return roll;
    }
};
int main()
{
    PublicChild obj1;
    ProtectedChild obj2;
    PrivateChild obj3;
cout << "In Public Inheritance" << endl;
    cout << "Public Member : " << obj1.name << endl;
    cout << "Protected Member : " << obj1.getProtected() << endl;
    cout << "In Protected Inheritance" << endl;
    cout << "Public Member : " << obj2.getPublic() << endl;
    cout << "Protected Member : " << obj2.getProtected() << endl;
    cout << "Private Member : " << obj2.getPrivate() << endl;
    cout << "In Private Inheritance" << endl;
    cout << "Public Member : " << obj3.getPublic() << endl;
    cout << "Protected Member : " << obj3.getProtected() << endl;
}
