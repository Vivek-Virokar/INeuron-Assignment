class Teluesko
{

// Below height and width variable can be used
// to create a user-defined sized alphabet's pattern
 
// Number of lines for the alphabet's pattern
static int height = 9;
 
// Number of character width in each line
 static int width = (2 * height) - 1;
 
// Function to find the absolute value
// of a number D
 static int abs(int d)
{
    return d < 0 ? -1 * d : d;
}
static void printE()
{
    int i, j;
    for (i = 0; i < height; i++)
    {
        System.out.printf("*");
        for (j = 0; j < height; j++)
        {
            if ((i == 0 || i == height - 1)
                || (i == height / 2
                    && j <= height / 2))
                System.out.printf("*");
            else
                continue;
        }
        System.out.printf("\n");
    }
}
 static void printT()
{
int i,j;
for (i = 0; i < height; i++)
    {
        for (j = 0; j < height; j++)
        {
            if (i == 0)
                System.out.printf("*");
            else if (j == height / 2)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        System.out.printf("\n");
    }
}
// Function print the pattern of the
// alphabets from A to Z
static void printPattern(char character)
{
    switch (character)
    {
   
    case 'E':
        printE();
        break;
    
   
   
   case 'T':
        printT();
        break;
    
   
    }
}
 
// Driver Code
public static void main(String[] args)
{
    char character = 'T';
    printPattern(character);
char character1 = 'E';
    printPattern(character1);
}
}




