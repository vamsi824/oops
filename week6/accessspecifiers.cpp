#include <iostream>
using namespace std;
class AccessSpecifierDemo
{
    private:
        int priVar;
    protected:
        int proVar;
    public:
        int pubVar;
    void setVar(int priValue, int proValue, int pubValue)
    {
        priVar = priValue;
        proVar = proValue;
        pubVar = pubValue;
    }
    int getPriVar()
    {
        return priVar;
    }
    int getProVar()
    {
        return proVar;
    }
    int getPubVar()
    {
        return pubVar;
    }
};
int main()
{
    AccessSpecifierDemo obj;
    obj.setVar(5,9,1);
    cout << "PriVar : " << obj.getPriVar() << endl;
    cout << "ProVar : " << obj.getProVar() << endl;
    cout << "PubVar : " << obj.getPubVar() << endl;
}
