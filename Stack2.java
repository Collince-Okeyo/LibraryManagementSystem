public class Stack2 {
    int top=-1;
    int arr[] = new int[100];
    public void push(int n)
    {
        top++;
        arr[top] = n;
    }
    public int pop()
    {
        int temp=arr[top];
        arr[top]=0;
        top--;
        return temp;
    }
}
