#include <iostream>

using namespace std;

int main()
{
	int x[3], y[3];
	int ccw;

	for (int i = 0; i < 3; i++)
	{
		cin >> x[i] >> y[i];
	}
	
	ccw = x[0] * y[1] + x[1] * y[2] + x[2] * y[0];
	ccw = ccw - (y[0] * x[1] + y[1] * x[2] + y[2] * x[0]);

	if (ccw > 0)
		cout << "1";
	else if (ccw < 0)
		cout << "-1";
	else
		cout << "0";
}
