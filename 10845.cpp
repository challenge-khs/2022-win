#include <iostream>
#include <string>
#include <queue>

using namespace std;

int main()
{
	queue<int> q;
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
			q.push(x);
		}
		else if (cmd == "pop")
		{
			if (q.empty() != 0)
				x = -1;
			else
			{
				x = q.front();
				q.pop();
			}
			cout << x << endl;
		}
		else if (cmd == "size")
		{
			x = q.size();
			cout << x << endl;
		}
		else if (cmd == "empty")
		{
			cout << (q.empty() ? 1 : 0) << endl;
		}
		else if (cmd == "front")
		{
			if (q.empty() != 0)
				x = -1;
			else
				x = q.front();
			cout << x << endl;
		}
		else if (cmd == "back")
		{
			if (q.empty() != 0)
				x = -1;
			else
				x = q.back();
			cout << x << endl;
		}
	}
}
