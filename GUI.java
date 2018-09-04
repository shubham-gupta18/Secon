public class GUI
{
public String encode(String text)
{
char original[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
char reverse[]={'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
char original2[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
String textf="";
char ch;
int c=0;
int random;
for(int i=0;i<text.length();i++)
{
ch=text.charAt(i);
for(int p=0;p<26;p++)
{
if((ch==original[p])||(ch==original2[p]))
c=p;
}
if(ch==' ')
textf=textf+Character.toString('?');
else if(ch=='0')
textf=textf+Character.toString('-');
else if(ch=='1')
textf=textf+Character.toString('+');
else if(ch=='2')
textf=textf+Character.toString('%');
else if(ch=='3')
textf=textf+Character.toString('{');
else if(ch=='4')
textf=textf+Character.toString('}');
else if(ch=='5')
textf=textf+Character.toString('"');
else if(ch=='6')
textf=textf+Character.toString('.');
else if(ch=='7')
textf=textf+Character.toString(',');
else if(ch=='8')
textf=textf+Character.toString('*');
else if(ch=='9')
textf=textf+Character.toString('&');
else 
textf=textf+Character.toString(reverse[c]);
}
random=(int)(Math.random()*6);
if(random==0)
textf="01110010010'\'iyaswe"+textf;
if(random==1)
textf="11010011010'\'qrtags"+textf;
if(random==2)
textf="11111111000'\'dyjhjf"+textf;
if(random==3)
textf="11000000001'\'fkcxad"+textf;
if(random==4)
textf="11101000010'\'rteqtq"+textf;
if(random==5)
textf="00000000000'\'jhfknv"+textf;
if(random==6)
textf="11111011111'\'vbnmop"+textf;
return textf;
}
public String decode(String text)
{
int choice;
char original[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
char reverse[]={'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
char original2[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
String textf="";
char ch;
int c=0;
int l=text.length();
text=text.substring(19,l);
for(int i=0;i<text.length();i++)
{
ch=text.charAt(i);
for(int p=0;p<26;p++)
{
if(ch==reverse[p])
c=p;
}
if(ch=='?')
;
else if(ch=='-')
textf=textf+Character.toString('0');
else if(ch=='+')
textf=textf+Character.toString('1');
else if(ch=='%')
textf=textf+Character.toString('2');
else if(ch=='{')
textf=textf+Character.toString('3');
else if(ch=='}')
textf=textf+Character.toString('4');
else if(ch=='"')
textf=textf+Character.toString('5');
else if(ch=='.')
textf=textf+Character.toString('6');
else if(ch==',')
textf=textf+Character.toString('7');
else if(ch=='*')
textf=textf+Character.toString('8');
else if(ch=='&')
textf=textf+Character.toString('9');
else
textf=textf+Character.toString(original[c]);
}
return textf;
}
}