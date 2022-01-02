#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main() 
{
	stack<int> s;
	int n;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		string cmd;
		int x;

		cin >> cmd;

		if (cmd == "push")
		{
			cin >> x;
			s.push(x);
		}
		else if (cmd == "pop")
		{
			if (s.empty() != 0)
				x = -1;
			else
			{
				x = s.top();
				s.pop();
			}
			cout << x << endl;
		}
		else if (cmd == "size")
		{
			x = s.size();
			cout << x << endl;
		}
		else if (cmd == "empty")
		{
			cout << (s.empty() ? 1 : 0) << endl;
		}
		else if (cmd == "top")
		{
			if (s.empty() != 0)
				x = -1;
			else
				x = s.top();
			cout << x << endl;
		}
	}
}
