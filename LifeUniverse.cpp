#include<iostream>
using namespace std;
int main()
{
	int n;
	for(long long int i=0;;i++)
	{
		cin>>n;
		if(n==42)
			break;
		else
			cout<<n<<endl;
	}
}
