import java.util.*;

class Boxpattern
{

public static void main(String args[])

{

int n,start,end,i,j;
Scanner sc=new Scanner(System.in);

System.out.print("Enter the n value: ");
n=sc.nextInt( ); 
int size=n*2-1;
char[ ][ ] c=new char[size][size];
start=0;

end=size-1;
char ch='A';
while(n!=0)

{

for(i=start;i<=end;i++)

{

for(j=start;j<=end;j++)

{

if(i==start || i==end || j==start||j==end)

c[i][j] =ch;
}
}

n--;

ch++;

start++;

end--;

}

for(i=0;i<size;i++)

{

for(j=0;j<size;j++)

{

System.out.print(c[i][j]+" ");

}

System.out.println( );

}

}

}