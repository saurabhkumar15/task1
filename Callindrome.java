/* Program to check a string is Caliondromic or not. 
Definition : A Caliondrome is similar to palindrome but it accepts only the string's with multiples of length six.
Some examples of caliondrome are cannac,011101,lirril,etc., */

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
caliondrome (char a[100]);
main ()
{
  char a[100];
  printf ("\n Enter the string to check for caliondrome : ");
  scanf ("%s", a);
  int index = caliondrome (a);
  if (strlen (a) % 6 != 0 || index == 0)
    printf ("\n %s: is Not a caliondrome.. \n", a);
  else
    printf ("\n %s: is a caliondrome !! \n", a);
}

int caliondrome (char a[100])
{
  int index = 1, i;
  int len = strlen(a)
  for (i = 0; a[i] != '\0';)
    {
      if ((a[i] == a[len-i-1]) && (a[i + 1] == a[len-i-2]) && (a[i + 2] == a[len-i-3]))
	i = i + 6;
      else
	{
	  index = 0;
	  break;
	}
    }
  return (index);
}