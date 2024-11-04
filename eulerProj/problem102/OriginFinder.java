package eulerProj.problem102;

public class OriginFinder
{

    public OriginFinder()
    {

    }

    public boolean findOrigin(int Ax, int Ay, int Bx, int By, int Cx, int Cy)
    {

        //Check if Ax and Bx are on the same side of the origin in a left-rightward way
        if(Ax * Bx > 0)
        {
            //If Ax and Bx are on the same side, The difference in slopes to the origin 
            //between A and C Must be opposite of that of B and C, in other words the produce is negative
            if(((Ay-Cy) / (Ax-Cx) * Cx + Cy) * ((By-Cy) / (Bx-Cx) * Cx + Cy) < 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        //Repeat above but with b and c on same side
        else if(Bx * Cx > 0)
        {
            if(((By-Ay) / (Bx-Ax) * Ax + Ay) * ((Cy-Ay) / (Cx-Ax) * Ax + Ay) < 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        //Repeat above but with a and c on same side
        else if(Ax * Cx > 0)
        {
            if(((Ay-By) / (Ax-Bx) * Bx + By) * ((Cy-By) / (Cx-Bx) * Bx + By) < 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}