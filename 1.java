using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace Rextester
{
    public class P
    {
        
public void reverse()
        {
            string input;
            input = Console.ReadLine();
            char[] inputarray = input.ToCharArray();
            Array.Sort(inputarray);

            string output = new string(inputarray);
            Console.WriteLine("op1\t\t{0}", output);
        }
        
        public static void Main(string[] args)
        {
              Program pg = new Program();
             pg.reverse();

            

            

           
 
          
        }
    }
}
