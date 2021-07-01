import java.io.*;
class Pattern3
{
public static void main(String args[ ])
{
int i,j,n=5;
char ch='A';
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(ch+" ");
ch+=1;
}
System.out.println(" ");
}
}
}