using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;

class Player
{
    static void Main(string[] args)
    {
        int R = int.Parse(Console.ReadLine()); // the length of the road before the gap.
        int G = int.Parse(Console.ReadLine()); // the length of the gap.
        int L = int.Parse(Console.ReadLine()); // the length of the landing platform.
        bool jumped=false;

        // game loop
        while (true)
        {
            int S = int.Parse(Console.ReadLine()); // the motorbike's speed.
            int X = int.Parse(Console.ReadLine()); // the position on the road of the motorbike.

            if (S<G+1 && jumped==false) { Console.WriteLine("SPEED"); }
            else if (S>G+1 && jumped==false) { Console.WriteLine("SLOW"); }
            else if (S==G+1 && jumped==false) {
            if (X==R-1) { Console.WriteLine("JUMP"); jumped = true; }
            else { Console.WriteLine("WAIT"); }}
            if (jumped==true) { Console.WriteLine("SLOW"); }
        }
    }
}